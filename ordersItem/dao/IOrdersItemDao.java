package com.qhit.ordersItem.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.ordersItem.pojo.OrdersItem;
import java.util.List;



@Mapper  
public interface IOrdersItemDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<OrdersItem> search(OrdersItem ordersItem);

    List findByAmount(Object amount);

    List findByUnitprice(Object unitprice);

    List findBySubtotal(Object subtotal);

    List findByGid(Object gid);

    List findByOid(Object oid);

}