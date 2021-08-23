package de.hybris.NagAcc.core.interceptors.impl;

import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

public class DesignerMediaValidateInterceptor implements ValidateInterceptor {

    @Override
    public void onValidate(Object o, InterceptorContext interceptorContext) throws InterceptorException {
        if (o instanceof DesignerModel)
        {
            DesignerModel designerModel = (DesignerModel) o;
            if(designerModel.getPhoto() == null)
            {
                throw new InterceptorException("Designer with name " + designerModel.getName() + " has no photo associated with their profile.");
            }
        }
    }
}
