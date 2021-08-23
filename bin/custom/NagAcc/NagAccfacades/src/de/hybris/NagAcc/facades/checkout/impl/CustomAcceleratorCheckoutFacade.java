package de.hybris.NagAcc.facades.checkout.impl;

import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.platform.acceleratorfacades.order.impl.DefaultAcceleratorCheckoutFacade;
import de.hybris.platform.commercefacades.order.impl.DefaultCheckoutFacade;
import de.hybris.platform.commerceservices.enums.SalesApplication;
import de.hybris.platform.commerceservices.enums.UiExperienceLevel;
import de.hybris.platform.commerceservices.service.data.CommerceCheckoutParameter;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.order.InvalidCartException;

import java.util.List;

public class CustomAcceleratorCheckoutFacade extends DefaultAcceleratorCheckoutFacade {

    @Override
    protected void beforePlaceOrder(CartModel cartModel) {
        if (cartModel != null) {
            checkIfAllProductsInCartHaveSameDesigner(cartModel);
        }
    }

    private void checkIfAllProductsInCartHaveSameDesigner(CartModel cartModel) {
        boolean hasSameDesigner = true;
        String designerCode = "";
        List<AbstractOrderEntryModel> orderEntryModelList = cartModel.getEntries();
        for (AbstractOrderEntryModel orderEntryModel : orderEntryModelList)
        {
            ProductModel productModel = orderEntryModel.getProduct();
            if(productModel.getDesigner() == null){  // if a product has no designer set
                hasSameDesigner = false;
                break;
            }
            if(designerCode.isEmpty()) {
                designerCode = productModel.getDesigner().getUid();
            }

            if(!designerCode.equals(productModel.getDesigner().getUid())) // different designers found
            {
                hasSameDesigner = false;
                break;
            }
        }
        cartModel.setHasSameDesigner(hasSameDesigner);
        getModelService().save(cartModel);

    }

    @Override
    protected OrderModel placeOrder(CartModel cartModel) throws InvalidCartException {

        final UiExperienceLevel uiExperienceLevel = getUiExperienceService().getUiExperienceLevel();
        final CommerceCheckoutParameter parameter = new CommerceCheckoutParameter();
        parameter.setEnableHooks(true);
        parameter.setCart(cartModel);

       // checkIfAllProductsInCartHaveSameDesigner(cartModel);

        OrderModel orderModel;
        if (UiExperienceLevel.MOBILE.equals(uiExperienceLevel))
        {
            // Set application to WebMobile
            parameter.setSalesApplication(SalesApplication.WEBMOBILE);
            orderModel = getCommerceCheckoutService().placeOrder(parameter).getOrder();
        }
        else {
            // Default to WEB
            parameter.setSalesApplication(SalesApplication.WEB);
            orderModel = getCommerceCheckoutService().placeOrder(parameter).getOrder();
        }

        if(cartModel.getHasSameDesigner())
        {
            DesignerModel designerModel = cartModel.getEntries().get(0).getProduct().getDesigner();
            orderModel.setDesigner(designerModel);
            getModelService().save(orderModel);
        }
        return orderModel;
    }
}
