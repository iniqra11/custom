package de.hybris.NagAcc.fulfilmentprocess.actions.order;

import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.platform.commerceservices.customer.CustomerService;
import de.hybris.platform.commerceservices.enums.CustomerType;
import de.hybris.platform.core.PasswordsReEncoder;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.task.RetryLaterException;

public class CheckDesignerAction extends AbstractSimpleDecisionAction<OrderProcessModel> {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Transition executeAction(OrderProcessModel orderProcessModel) throws RetryLaterException, Exception {
        UserModel userModel = userService.getCurrentUser();
        if (userModel instanceof CustomerModel)
        {
            CustomerModel customerModel = (CustomerModel) userModel;
            boolean isRegisteredUser = !(getUserService().isAnonymousUser(getUserService().getCurrentUser()));
            if(isRegisteredUser){
                final OrderModel orderModel = orderProcessModel.getOrder();
                DesignerModel orderDesigner = orderModel.getDesigner();
                if (orderDesigner != null) // if designer is set i.e when all products in the order have same designer
                {
                    DesignerModel customerPreferredDesigner = customerModel.getDesignerPreference();
                    if (!customerPreferredDesigner.getUid().equals(orderDesigner.getUid())) {
                        customerModel.setDesignerPreference(orderDesigner);
                        getModelService().save(customerModel);
                    }
                }
            }
        }
        return Transition.OK;

    }
}

