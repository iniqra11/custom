package de.hybris.NagAcc.fulfilmentprocess.actions.order;

import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.platform.commerceservices.customer.CustomerService;
import de.hybris.platform.commerceservices.enums.CustomerType;
import de.hybris.platform.commerceservices.strategies.CheckoutCustomerStrategy;
import de.hybris.platform.core.PasswordsReEncoder;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.order.OrderService;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.task.RetryLaterException;
import org.apache.log4j.Logger;

import java.util.Locale;

public class CheckDesignerAction extends AbstractSimpleDecisionAction<OrderProcessModel> {

    private static final String ANONYMOUS_USER = "anonymous";
    @Override
    public Transition executeAction(OrderProcessModel orderProcessModel) throws RetryLaterException, Exception {
        UserModel userModel = orderProcessModel.getOrder().getUser();
        String userUid = userModel.getUid();
        if (userModel instanceof CustomerModel)
        {
            CustomerModel customerModel = (CustomerModel) orderProcessModel.getOrder().getUser();
            boolean isAnonymous = userUid.equals(ANONYMOUS_USER);
            if(!isAnonymous){
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
           return Transition.OK;
        }
        return Transition.NOK;

    }
}

