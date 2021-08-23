package de.hybris.NagAcc.core.dao;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.order.daos.OrderDao;

import java.util.List;

public interface CustomerOrderDao extends OrderDao {

    public List<OrderModel> findAllOrders();
}
