package de.hybris.NagAcc.facades.designer.impl;

import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.NagAcc.core.service.DesignerService;
import de.hybris.NagAcc.facades.designer.DesignerFacade;
import de.hybris.NagAcc.facades.designer.data.DesignerData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.user.data.TitleData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

public class DefaultDesignerFacade implements DesignerFacade {
    private DesignerService designerService;
    private Converter<DesignerModel, DesignerData> designerConverter;

    public DesignerService getDesignerService() {
        return designerService;
    }

    public void setDesignerService(DesignerService designerService) {
        this.designerService = designerService;
    }

    public Converter<DesignerModel, DesignerData> getDesignerConverter() {
        return designerConverter;
    }

    public void setDesignerConverter(Converter<DesignerModel, DesignerData> designerConverter) {
        this.designerConverter = designerConverter;
    }

    @Override
    public List<DesignerData> getDesigners() {
       return Converters.convertAll(getDesignerService().findAllDesigners(), getDesignerConverter());
    }

    @Override
    public boolean isProductDesignerSameAsCustomerPreferredDesigner(ProductData productData, DesignerData designerData) {
        return getDesignerService().compareProductDesignerAndCustomerPrefferedDesigner(productData,designerData);
    }
}
