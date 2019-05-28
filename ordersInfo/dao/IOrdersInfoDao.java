package com.qhit.ordersInfo.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.ordersInfo.pojo.OrdersInfo;
import java.util.List;



@Mapper  
public interface IOrdersInfoDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<OrdersInfo> search(OrdersInfo ordersInfo);

    List findByTotal(Object total);

    List findByOrdertime(Object ordertime);

    List findByState(Object state);

    List findByCname(Object cname);

    List findByPhone(Object phone);

    List findByAddr(Object addr);

    List findByUserId(Object userId);

    List findByShopid(Object shopid);
    List monthTotal(Integer shopid);

}