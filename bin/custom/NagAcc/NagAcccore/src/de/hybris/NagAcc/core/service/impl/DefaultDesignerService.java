package de.hybris.NagAcc.core.service.impl;

import de.hybris.NagAcc.core.dao.DesignerDao;
import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.NagAcc.core.service.DesignerService;
import de.hybris.NagAcc.facades.designer.data.DesignerData;
import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;

public class DefaultDesignerService implements DesignerService {

    private DesignerDao designerDao;

    public DesignerDao getDesignerDao() {
        return designerDao;
    }

    public void setDesignerDao(DesignerDao designerDao) {
        this.designerDao = designerDao;
    }

    @Override
    public List<DesignerModel> findAllDesigners() {
       return designerDao.getAllDesigners();
    }

    @Override
    public DesignerModel findDesignerByCode(String code) {
        return designerDao.getDesignerByCode(code);
    }

    @Override
    public boolean compareProductDesignerAndCustomerPrefferedDesigner(ProductData productData, DesignerData designerData) {
        if (productData.getDesigner().getCode().equals(designerData.getCode()))
            return Boolean.TRUE;
        return Boolean.FALSE;
    }
}
