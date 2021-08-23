package de.hybris.NagAcc.core.dao;

import de.hybris.NagAcc.core.model.DesignerModel;

import java.util.List;

public interface DesignerDao {

    public List<DesignerModel> getAllDesigners();
    public DesignerModel getDesignerByCode(String code);
}
