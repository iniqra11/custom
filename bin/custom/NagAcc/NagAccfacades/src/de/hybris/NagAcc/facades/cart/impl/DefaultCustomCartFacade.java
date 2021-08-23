package de.hybris.NagAcc.facades.cart.impl;

import de.hybris.NagAcc.facades.cart.CustomCartFacade;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.order.impl.DefaultCartFacade;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.user.data.CustomerData;

import java.util.List;

public class DefaultCustomCartFacade extends DefaultCartFacade implements CustomCartFacade {
    @Override
    public boolean checkIfDesignerIsSameAsPreferredDesigner(List<OrderEntryData> orderEntryDataList, CustomerData customerData) {

        String designerCode = customerData.getDesignerPreference().getCode();
        boolean hasFavouriteDesigner = true;

        for (OrderEntryData orderEntryData : orderEntryDataList) {
            ProductData productData = orderEntryData.getProduct(); // this product data is being populated by the designer data because of the populator we added to the orderEntryProductConverter in facades_spring.xml
            if (productData.getDesigner() == null)  //  product does not have a designer
            {
                hasFavouriteDesigner = false;
                break;
            }

            if(!designerCode.equals(productData.getDesigner().getCode())) {
                hasFavouriteDesigner = false;
                break;
            }

        }
       return  hasFavouriteDesigner;
    }
}

