package com.qhit.baseUser.controller; 

import com.qhit.baseUser.pojo.BaseUser; 
import com.qhit.baseUser.service.IBaseUserService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 


@RestController 
@RequestMapping("/baseUser") 
public class BaseUserController { 

    @Resource 
    IBaseUserService baseUserService; 

    @RequestMapping("/insert") 
    public void insert(BaseUser baseUser) { 
        baseUserService.insert(baseUser); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer userId) { 
        baseUserService.delete(userId); 
    } 

    @RequestMapping("/update") 
    public void update(BaseUser baseUser) { 
        baseUserService.update(baseUser); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(BaseUser baseUser) { 
        baseUserService.updateSelective(baseUser); 
    } 

    @RequestMapping("/load") 
    public BaseUser load(Integer userId) { 
        BaseUser baseUser = baseUserService.findById(userId); 
        return baseUser; 
    } 

    @RequestMapping("/list") 
    public List<BaseUser> list()  { 
        List<BaseUser> list = baseUserService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<BaseUser> search(BaseUser baseUser) { 
        List<BaseUser> list = baseUserService.search(baseUser); 
        return list; 
    } 

} 
