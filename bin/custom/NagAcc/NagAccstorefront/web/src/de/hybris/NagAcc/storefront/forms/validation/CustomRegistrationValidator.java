package de.hybris.NagAcc.storefront.forms.validation;

import bsh.StringUtil;
import de.hybris.NagAcc.storefront.forms.CustomRegisterForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.RegistrationValidator;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component("customRegistrationValidator")
public class CustomRegistrationValidator extends RegistrationValidator {

    @Override
    public void validate(Object object, Errors errors) {
        super.validate(object, errors);
        if (object instanceof CustomRegisterForm) {
            CustomRegisterForm customRegisterForm = (CustomRegisterForm) object;
            validateDesignerName(errors, customRegisterForm.getMyPreferredDesigner());
        }
    }

    private void validateDesignerName(Errors errors, String myPreferredDesigner) {
        if(StringUtils.isEmpty(myPreferredDesigner))
        {
            errors.rejectValue("myPreferredDesigner", "register.designerName.invalid");
        }
    }
}
