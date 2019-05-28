package com.qhit.ordersInfo.service.impl;

import com.qhit.ordersInfo.pojo.MonthTotal;
import com.qhit.ordersInfo.service.IOrdersInfoService;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import com.qhit.ordersInfo.dao.IOrdersInfoDao;
import com.qhit.ordersInfo.pojo.OrdersInfo;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;



@Service 
public class OrdersInfoServiceImpl  implements IOrdersInfoService {

    @Resource 
    IOrdersInfoDao dao;

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
        OrdersInfo ordersInfo = findById(id); 
        return dao.delete(ordersInfo); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public OrdersInfo findById(Object id) { 
        List<OrdersInfo> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<OrdersInfo> search(OrdersInfo ordersInfo) { 
        return dao.search(ordersInfo); 
    }

    @Override
    public List<OrdersInfo> findByshopid(Integer shopid) {
        return dao.findByShopid(shopid);
    }

    @Override
    public List<OrdersInfo> findByUserid(Integer userId) {
        return dao.findByUserId(userId);
    }

    @Override
    public boolean deliverGoods(String oid) {
        List list = dao.findById(oid);
        OrdersInfo ordersInfo = (OrdersInfo) list.get(0);
        ordersInfo.setState("2");
        return dao.update(ordersInfo);
    }
    @Override
    public boolean reap(String oid) {
        List list = dao.findById(oid);
        OrdersInfo ordersInfo = (OrdersInfo) list.get(0);
        ordersInfo.setState("3");
        return dao.update(ordersInfo);
    }
    @Override
    public boolean appraise(String oid) {
        List list = dao.findById(oid);
        OrdersInfo ordersInfo = (OrdersInfo) list.get(0);
        ordersInfo.setState("4");
        return dao.update(ordersInfo);
    }

    @Override
    public List<MonthTotal> monthTotal(Integer shopid) {
        return dao.monthTotal(shopid);
    }

    @Override
    public void outExcle(Integer shopid, HttpServletResponse response) throws IOException {
        List<MonthTotal> list = dao.monthTotal(shopid);
        HSSFWorkbook wb = new HSSFWorkbook();
//建立新的sheet对象（excel的表单）
        HSSFSheet sheet=wb.createSheet("本月销量表");
//在sheet里创建第一行，参数为行索引(excel的行)，可以是0～65535之间的任何一个
        HSSFRow row1=sheet.createRow(0);
//创建单元格（excel的单元格，参数为列索引，可以是0～255之间的任何一个
        HSSFCell cell=row1.createCell(0);
        //设置单元格内容
        cell.setCellValue("月销量一览表");
//合并单元格CellRangeAddress构造参数依次表示起始行，截至行，起始列， 截至列
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,3));
//在sheet里创建第二行
        HSSFRow row2=sheet.createRow(1);
        //创建单元格并设置单元格内容
        row2.createCell(0).setCellValue("月份");
        row2.createCell(1).setCellValue("商品名称");
        row2.createCell(2).setCellValue("销量");
        //在sheet里创建第三行
        int i=2;
        for(MonthTotal item:list){
            HSSFRow rownext=sheet.createRow(i);
            rownext.createCell(0).setCellValue(item.getMonth());
            rownext.createCell(1).setCellValue(item.getName());
            rownext.createCell(2).setCellValue(item.getAmount());
            i++;
        }


//输出Excel文件
        OutputStream output=response.getOutputStream();
        response.reset();
        response.setHeader("Content-disposition", "attachment; filename=details.xls");
        response.setContentType("application/msexcel");
        wb.write(output);
        output.close();
    }

    @Override
    public boolean salesReturn(String oid) {
        List list = dao.findById(oid);
        OrdersInfo ordersInfo = (OrdersInfo) list.get(0);
        ordersInfo.setState("5");
        return dao.update(ordersInfo);
    }
}