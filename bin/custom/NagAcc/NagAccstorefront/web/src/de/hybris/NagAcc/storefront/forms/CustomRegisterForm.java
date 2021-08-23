package de.hybris.NagAcc.storefront.forms;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;

public class CustomRegisterForm extends RegisterForm {
    private String myPreferredDesigner;

    public String getMyPreferredDesigner() {
        return myPreferredDesigner;
    }

    public void setMyPreferredDesigner(String myPreferredDesigner) {
        this.myPreferredDesigner = myPreferredDesigner;
    }
}
