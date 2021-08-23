package de.hybris.NagAcc.facades.product.converters.populator;

import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.NagAcc.facades.designer.data.DesignerData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.springframework.util.Assert;

public class ProductDesignerPopulator<SOURCE extends ProductModel, TARGET extends ProductData> implements Populator<SOURCE,TARGET> {

    private Converter<DesignerModel,DesignerData> designerConverter;

    public Converter<DesignerModel, DesignerData> getDesignerConverter() {
        return designerConverter;
    }

    public void setDesignerConverter(Converter<DesignerModel, DesignerData> designerConverter) {
        this.designerConverter = designerConverter;
    }

    @Override
    public void populate(SOURCE productModel, TARGET productData) throws ConversionException {
        Assert.notNull(productData, "Parameter target cannot be null.");
        if (productModel.getDesigner() != null)
        {
            DesignerData designerData = getDesignerConverter().convert(productModel.getDesigner());
            productData.setDesigner(designerData);
        }

    }
}
