package com.qhit.ordersItem.controller; 

import com.qhit.ordersItem.pojo.OrdersItem; 
import com.qhit.ordersItem.service.IOrdersItemService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 



@RestController 
@RequestMapping("/ordersItem") 
public class OrdersItemController { 

    @Resource 
    IOrdersItemService ordersItemService; 

    @RequestMapping("/insert") 
    public void insert(OrdersItem ordersItem) { 
        ordersItemService.insert(ordersItem); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer itemId) { 
        ordersItemService.delete(itemId); 
    } 

    @RequestMapping("/update") 
    public void update(OrdersItem ordersItem) { 
        ordersItemService.update(ordersItem); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(OrdersItem ordersItem) { 
        ordersItemService.updateSelective(ordersItem); 
    } 

    @RequestMapping("/load") 
    public OrdersItem load(Integer itemId) { 
        OrdersItem ordersItem = ordersItemService.findById(itemId); 
        return ordersItem; 
    } 

    @RequestMapping("/list") 
    public List<OrdersItem> list()  { 
        List<OrdersItem> list = ordersItemService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<OrdersItem> search(OrdersItem ordersItem) { 
        List<OrdersItem> list = ordersItemService.search(ordersItem); 
        return list; 
    } 

} 
