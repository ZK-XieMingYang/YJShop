package com.qhit.ordersInfo.controller; 

import com.qhit.ordersInfo.pojo.OrdersInfo; 
import com.qhit.ordersInfo.service.IOrdersInfoService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.springframework.web.bind.annotation.RestController; 



@RestController 
@RequestMapping("/ordersInfo")
public class OrdersInfoController { 

    @Resource 
    IOrdersInfoService ordersInfoService; 

    @RequestMapping("/insert") 
    public void insert(OrdersInfo ordersInfo) { 
        ordersInfoService.insert(ordersInfo); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer oid) { 
        ordersInfoService.delete(oid); 
    } 

    @RequestMapping("/update") 
    public void update(OrdersInfo ordersInfo) { 
        ordersInfoService.update(ordersInfo); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(OrdersInfo ordersInfo) { 
        ordersInfoService.updateSelective(ordersInfo); 
    } 

    @RequestMapping("/load") 
    public OrdersInfo load(Integer oid) { 
        OrdersInfo ordersInfo = ordersInfoService.findById(oid); 
        return ordersInfo; 
    } 

    @RequestMapping("/list") 
    public List<OrdersInfo> list()  { 
        List<OrdersInfo> list = ordersInfoService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<OrdersInfo> search(OrdersInfo ordersInfo) { 
        List<OrdersInfo> list = ordersInfoService.search(ordersInfo); 
        return list; 
    }
    @RequestMapping("/shopOrdersList")//查看所有该商铺订单
    public List<OrdersInfo> shopOrdersList(Integer shopid)  {
        List<OrdersInfo> list = ordersInfoService.findByshopid(shopid);
        return list;
    }
    @RequestMapping("/userOrdersList")//查看用户所有该订单
    public List<OrdersInfo> userOrdersList(Integer userId)  {
        List<OrdersInfo> list = ordersInfoService.findByUserid(userId);
        return list;
    }
    @RequestMapping("/deliverGoods")//发货更改状态
    public boolean deliverGoods(String oid)  {;
        return ordersInfoService.deliverGoods(oid);
    }
    @RequestMapping("/salesReturn")//退订单更改状态
    public boolean salesReturn(String oid)  {;
        return ordersInfoService.salesReturn(oid);
    }
    @RequestMapping("/reap")//收货更改状态
    public boolean reap(String oid)  {;
        return ordersInfoService.salesReturn(oid);
    }
    @RequestMapping("/appraise")//评价更改状态
    public boolean appraise(String oid)  {;
        return ordersInfoService.salesReturn(oid);
    }
    @RequestMapping("/outExcle")//导出月销量Excle
    public void outExcle(Integer shopid, HttpServletResponse response)  {
        try {
             ordersInfoService.outExcle(shopid,response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
