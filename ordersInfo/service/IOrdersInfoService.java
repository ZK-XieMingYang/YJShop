package com.qhit.ordersInfo.service;

import java.io.IOException;
import java.util.List;

import com.qhit.ordersInfo.pojo.MonthTotal;
import com.qhit.ordersInfo.pojo.OrdersInfo;

import javax.servlet.http.HttpServletResponse;


public interface IOrdersInfoService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    OrdersInfo findById(Object id);

    List<OrdersInfo> search(OrdersInfo ordersInfo);
    List<OrdersInfo> findByshopid(Integer shopid);
    List<OrdersInfo> findByUserid(Integer userId);
    boolean deliverGoods(String oid);//发货
    boolean salesReturn(String oid);//退订单
    boolean reap(String oid);//已收货
    boolean appraise(String oid);//已评价
    List<MonthTotal> monthTotal(Integer shopid);//月销量统计
    void outExcle(Integer shopid, HttpServletResponse response) throws IOException;
}