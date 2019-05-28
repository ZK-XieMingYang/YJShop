package com.qhit.goodsInfo.service;

import java.util.List;
import com.qhit.goodsInfo.pojo.GoodsInfo;

import javax.servlet.http.HttpSession;


public interface IGoodsInfoService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    GoodsInfo findById(Object id);

    List<GoodsInfo> search(GoodsInfo goodsInfo);
    List<GoodsInfo> shopList(Integer shopid);
    boolean addCart(GoodsInfo goodsInfo, HttpSession session);
    boolean delCartBygid(HttpSession session,Integer gid);
    String getAllCart(HttpSession session);
}