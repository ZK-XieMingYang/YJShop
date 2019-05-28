package com.qhit.ordersItem.service;

import java.util.List;
import com.qhit.ordersItem.pojo.OrdersItem;

public interface IOrdersItemService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    OrdersItem findById(Object id);

    List<OrdersItem> search(OrdersItem ordersItem);

}