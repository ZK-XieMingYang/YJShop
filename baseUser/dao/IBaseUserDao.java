package com.qhit.baseUser.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.baseUser.pojo.BaseUser;
import java.util.List;

@Mapper  
public interface IBaseUserDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<BaseUser> search(BaseUser baseUser);

    List findByUsername(Object username);

    List findByPassword(Object password);

    List findByCname(Object cname);

    List findByEmail(Object email);

    List findByPhone(Object phone);

    List findByAddr(Object addr);

    List findBySex(Object sex);

    List findByRegdate(Object regdate);

    List findByVipgrade(Object vipgrade);

    List findByIntegral(Object integral);

}