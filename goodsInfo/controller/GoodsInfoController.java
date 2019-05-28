package com.qhit.goodsInfo.controller; 

import com.qhit.goodsInfo.pojo.GoodsInfo; 
import com.qhit.goodsInfo.service.IGoodsInfoService;
import com.qhit.utils.RedisManager;
import com.qhit.utils.Upload;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController; 


@RestController 
@RequestMapping("/goodsInfo") 
public class GoodsInfoController { 

    @Resource 
    IGoodsInfoService goodsInfoService;
    @Resource
    RedisManager redisManager;
    @RequestMapping("/insert") 
    public void insert(GoodsInfo goodsInfo) { 
        goodsInfoService.insert(goodsInfo); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer gid) { 
        goodsInfoService.delete(gid); 
    } 

    @RequestMapping("/update") 
    public void update(GoodsInfo goodsInfo) { 
        goodsInfoService.update(goodsInfo); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(GoodsInfo goodsInfo) { 
        goodsInfoService.updateSelective(goodsInfo); 
    } 

    @RequestMapping("/load") 
    public GoodsInfo load(Integer gid) { 
        GoodsInfo goodsInfo = goodsInfoService.findById(gid); 
        return goodsInfo; 
    } 

    @RequestMapping("/list") 
    public List<GoodsInfo> list()  { 
        List<GoodsInfo> list = goodsInfoService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<GoodsInfo> search(GoodsInfo goodsInfo, HttpSession session) {
        List<GoodsInfo> list = goodsInfoService.search(goodsInfo); 
        return list; 
    }
    //商店商品
    @RequestMapping("/shopList")//查看本商店商品
    public List<GoodsInfo> shopList(Integer shopid) {
        List<GoodsInfo> list = goodsInfoService.shopList(shopid);
        return list;
    }
    @RequestMapping("/upload")//多文件上传返回文件名逗号连接
    public String upload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String   s = Upload.handleFileUpload(request, response);
        return s;
    }
} 
