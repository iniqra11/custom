package de.hybris.NagAcc.facades.cart;

import de.hybris.platform.commercefacades.order.CartFacade;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.user.data.CustomerData;

import java.util.List;

public interface CustomCartFacade extends CartFacade {

    public boolean checkIfDesignerIsSameAsPreferredDesigner(List<OrderEntryData> orderEntryDataList, CustomerData customerData);

}
