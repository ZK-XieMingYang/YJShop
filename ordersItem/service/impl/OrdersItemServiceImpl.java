package com.qhit.ordersItem.service.impl;

import com.qhit.ordersItem.service.IOrdersItemService;
import java.util.List;
import com.qhit.ordersItem.dao.IOrdersItemDao;
import com.qhit.ordersItem.pojo.OrdersItem;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 



@Service 
public class OrdersItemServiceImpl  implements IOrdersItemService {

    @Resource 
    IOrdersItemDao dao;

    @Override 
    public boolean insert(Object object) { 
        return dao.insert(object); 
    } 

    @Override 
    public boolean update(Object object) { 
        return dao.update(object); 
    } 

    @Override 
    public boolean updateSelective(Object object) { 
        return dao.updateSelective(object); 
    } 

    @Override 
    public boolean delete(Object id) { 
        OrdersItem ordersItem = findById(id); 
        return dao.delete(ordersItem); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public OrdersItem findById(Object id) { 
        List<OrdersItem> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<OrdersItem> search(OrdersItem ordersItem) { 
        return dao.search(ordersItem); 
    } 

}