package de.hybris.NagAcc.core.dao.impl;

import de.hybris.NagAcc.core.dao.DesignerDao;
import de.hybris.NagAcc.core.model.DesignerModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.*;

public class DefaultDesignerDao implements DesignerDao {

    private FlexibleSearchService flexibleSearchService;

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public List<DesignerModel> getAllDesigners() {
        final StringBuilder query = new StringBuilder(
                "SELECT {pk} FROM {Designer}");
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query.toString());
        flexibleSearchQuery.setResultClassList(Collections.singletonList(DesignerModel.class));
        final SearchResult searchResult = getFlexibleSearchService().search(flexibleSearchQuery);
        return searchResult.getResult();

    }

    @Override
    public DesignerModel getDesignerByCode(String code) {
        final StringBuilder query = new StringBuilder(
                "SELECT {pk} FROM {Designer} where {uid} = ?code");
        final Map<String, Object> params = new HashMap<String, Object>();
        params.put("code",code);
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query.toString());
        flexibleSearchQuery.addQueryParameters(params);

        flexibleSearchQuery.setResultClassList(Collections.singletonList(DesignerModel.class));
        final SearchResult searchResult = getFlexibleSearchService().search(flexibleSearchQuery);
        if (searchResult.getResult().size() > 1) {
            throw new AmbiguousIdentifierException("Found " +searchResult.getResult().size() + " objects from type " + "Designer" + " with " + params.toString() + "'");
        } else {
            return searchResult.getResult().isEmpty() ? null : (DesignerModel)searchResult.getResult().get(0);
        }

    }
}
