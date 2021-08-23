package de.hybris.NagAcc.facades.designer;

import de.hybris.NagAcc.facades.designer.data.DesignerData;
import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;

public interface DesignerFacade {

    public List<DesignerData> getDesigners();
    public boolean isProductDesignerSameAsCustomerPreferredDesigner(ProductData productData, DesignerData designerData);
}
