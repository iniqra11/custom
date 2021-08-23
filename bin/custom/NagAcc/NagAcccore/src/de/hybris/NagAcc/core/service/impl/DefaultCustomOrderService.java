package de.hybris.NagAcc.core.service.impl;

import de.hybris.NagAcc.core.dao.CustomerOrderDao;
import de.hybris.NagAcc.core.service.CustomOrderService;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.order.impl.DefaultOrderService;

import java.util.ArrayList;
import java.util.List;

public class DefaultCustomOrderService extends DefaultOrderService implements CustomOrderService {
    @Override
    public List<OrderModel> getAllOrders() {
        if (getOrderDao() instanceof CustomerOrderDao) {
        return  ((CustomerOrderDao)getOrderDao()).findAllOrders();
        }
        return new ArrayList<OrderModel>();
    }
}
