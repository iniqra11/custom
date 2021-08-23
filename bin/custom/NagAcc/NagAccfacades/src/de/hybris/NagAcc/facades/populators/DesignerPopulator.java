package de.hybris.NagAcc.facades.populators;

import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.NagAcc.facades.designer.data.DesignerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DesignerPopulator<SOURCE extends DesignerModel, TARGET extends DesignerData> implements Populator<SOURCE,TARGET> {
    @Override
    public void populate(SOURCE source, TARGET target) throws ConversionException {
        if (source != null)
        {
            target.setCode(source.getUid());
            target.setName(source.getName());
        }
    }
}
