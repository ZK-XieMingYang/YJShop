package com.qhit.baseUser.pojo;



public class BaseUser { 
    private Integer userId;    //用户id 
    private String username;    //账号 
    private String password;    //密码 
    private String cname;    //姓名 
    private String email;    //邮箱 
    private String phone;    //电话 
    private String addr;    //地址 
    private String sex;    //性别 
    private String regdate;    //注册时间 
    private String vipgrade;    //会员等级 
    private String integral;    //积分 会员等级  0：非会员 1：白银会员 9 2：黄金会员 9.2 3 钻石会员 8.5 

    public Integer getUserId() { 
        return userId;
    }

    public void setUserId(Integer userId) { 
        this.userId = userId;
    } 

    public String getUsername() { 
        return username;
    }

    public void setUsername(String username) { 
        this.username = username;
    }
    public String getPassword() { 
        return password;
    }

    public void setPassword(String password) { 
        this.password = password;
    }
    public String getCname() { 
        return cname;
    }

    public void setCname(String cname) { 
        this.cname = cname;
    }
    public String getEmail() { 
        return email;
    }

    public void setEmail(String email) { 
        this.email = email;
    }
    public String getPhone() { 
        return phone;
    }

    public void setPhone(String phone) { 
        this.phone = phone;
    }
    public String getAddr() { 
        return addr;
    }

    public void setAddr(String addr) { 
        this.addr = addr;
    }
    public String getSex() { 
        return sex;
    }

    public void setSex(String sex) { 
        this.sex = sex;
    }
    public String getRegdate() { 
        return regdate;
    }

    public void setRegdate(String regdate) { 
        this.regdate = regdate;
    }
    public String getVipgrade() { 
        return vipgrade;
    }

    public void setVipgrade(String vipgrade) { 
        this.vipgrade = vipgrade;
    }
    public String getIntegral() { 
        return integral;
    }

    public void setIntegral(String integral) { 
        this.integral = integral;
    }

 }