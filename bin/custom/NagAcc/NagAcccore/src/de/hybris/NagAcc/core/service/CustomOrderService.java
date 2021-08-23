package de.hybris.NagAcc.core.service;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.order.OrderService;

import java.util.List;

public interface CustomOrderService extends OrderService {

    List<OrderModel> getAllOrders();
}
