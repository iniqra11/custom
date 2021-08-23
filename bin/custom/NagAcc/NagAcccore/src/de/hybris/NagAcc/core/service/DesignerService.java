package de.hybris.NagAcc.core.service;

import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.NagAcc.facades.designer.data.DesignerData;
import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;

public interface DesignerService {
    public List<DesignerModel> findAllDesigners();
    public DesignerModel findDesignerByCode(String code);

    boolean compareProductDesignerAndCustomerPrefferedDesigner(ProductData productData, DesignerData designerData);
   

}
