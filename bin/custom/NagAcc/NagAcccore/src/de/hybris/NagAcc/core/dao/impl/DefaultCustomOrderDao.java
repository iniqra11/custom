package de.hybris.NagAcc.core.dao.impl;

import de.hybris.NagAcc.core.dao.CustomerOrderDao;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.order.daos.impl.DefaultOrderDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collections;
import java.util.List;

public class DefaultCustomOrderDao extends DefaultOrderDao implements CustomerOrderDao {

    @Override
    public List<OrderModel> findAllOrders() {
        final StringBuilder query = new StringBuilder("SELECT {pk} from {Order}");
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query.toString());
        flexibleSearchQuery.setResultClassList(Collections.singletonList(OrderModel.class));
        final SearchResult searchResult = getFlexibleSearchService().search(flexibleSearchQuery);
        return searchResult.getResult();

    }
}
