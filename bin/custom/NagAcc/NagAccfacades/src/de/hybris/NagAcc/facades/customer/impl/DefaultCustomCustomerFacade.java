package de.hybris.NagAcc.facades.customer.impl;

import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.NagAcc.core.service.DesignerService;
import de.hybris.NagAcc.facades.customer.CustomCustomerFacade;
import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.TitleModel;
import org.apache.commons.lang.StringUtils;

public class DefaultCustomCustomerFacade extends DefaultCustomerFacade implements CustomCustomerFacade {

    private DesignerService designerService;

    public DesignerService getDesignerService() {
        return designerService;
    }

    public void setDesignerService(DesignerService designerService) {
        this.designerService = designerService;
    }

    @Override
    public void setDesignerNameForRegister(RegisterData registerData, CustomerModel customerModel) {

        if (StringUtils.isNotBlank(registerData.getMyPreferredDesigner()))
        {
            final DesignerModel designer = getDesignerService().findDesignerByCode(registerData.getMyPreferredDesigner());
            customerModel.setDesignerPreference(designer);
        }

    }

    @Override
    protected void setCommonPropertiesForRegister(RegisterData registerData, CustomerModel customerModel) {
        super.setCommonPropertiesForRegister(registerData, customerModel);
        setDesignerNameForRegister(registerData,customerModel);
    }
}
