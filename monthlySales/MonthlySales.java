package com.qhit.monthlySales;

import com.qhit.ordersInfo.pojo.MonthTotal;
import com.qhit.ordersInfo.service.IOrdersInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/monthSales")
public class MonthlySales {
    @Resource
    IOrdersInfoService ordersInfoService;
    //月销售量统计
    @RequestMapping("/statistics")
    public List<MonthTotal> monthlySales(Integer shopid){
        return ordersInfoService.monthTotal(shopid);
    }
    //月销售量统计报表Excle
    @RequestMapping("/outExcle")
    public void outExcle(Integer shopid, HttpServletResponse response) throws IOException {
        ordersInfoService.outExcle(shopid,response);
    }
}
