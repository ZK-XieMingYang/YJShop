package com.qhit.test;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.qhit.utils.HttpUtil;
import com.qhit.utils.RedisUtils;
import com.qhit.utils.Upload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    HttpUtil httpUtil;
    @Autowired
    RedisUtils redisUtils;
    @RequestMapping("/signin")
    public Object signin(){
        HashMap map =new HashMap();
        map.put("username","lsx");
        map.put("password","123456");
        Object baseinfo = httpUtil.getForList("baseinfo", "baseUser/login", List.class, map);
        return baseinfo;
    }

    @RequestMapping("/getSession")
    public Integer getSession(HttpSession session){
        Integer id = (Integer) session.getAttribute("baseUserId");
        return id;
    }
    @RequestMapping("/login")
    public String login(HttpSession session){
        session.setAttribute("baseUser","张三");
        return "张三";
    }
    @RequestMapping("/upload")
    public String upload(HttpServletRequest request, HttpServletResponse response) throws Exception {
         String s = Upload.handleFileUpload(request, response);
        return s;
    }
}
