package de.hybris.NagAcc.facades.user.converters.populator;

import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.NagAcc.facades.designer.data.DesignerData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

public class CustomerDesignerPopulator<SOURCE extends UserModel, TARGET extends CustomerData> implements Populator<SOURCE, TARGET> {

    private Converter<DesignerModel, DesignerData> designerConverter;

    public Converter<DesignerModel, DesignerData> getDesignerConverter() {
        return designerConverter;
    }

    public void setDesignerConverter(Converter<DesignerModel, DesignerData> designerConverter) {
        this.designerConverter = designerConverter;
    }

    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        if (source instanceof CustomerModel)
        {
            CustomerModel customerModel = (CustomerModel) source;
            if (customerModel.getDesignerPreference() != null)
            {
                target.setDesignerPreference(getDesignerConverter().convert(customerModel.getDesignerPreference()));
            }
        }

    }
}
