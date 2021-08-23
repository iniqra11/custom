package de.hybris.NagAcc.facades.customer;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.core.model.user.CustomerModel;

public interface CustomCustomerFacade extends CustomerFacade {

    public void setDesignerNameForRegister(final RegisterData registerData, final CustomerModel customerModel);
}
