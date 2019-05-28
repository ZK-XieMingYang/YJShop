package com.qhit.ordersInfo.pojo;



public class OrdersInfo { 
    private Integer oid;    //主键
    private Double total;    //订单总金额
    private String ordertime;    //下单时间
    private String state;    //状态  1已下单 2已发货 3已收货 4已评价
    private String cname;    //用户姓名
    private String phone;    //用户电话
    private String addr;    //用户地址
    private Integer userId;    //用户id
    private Integer shopid;    //店家id

    public Integer getOid() { 
        return oid;
    }

    public void setOid(Integer oid) { 
        this.oid = oid;
    } 

    public Double getTotal() { 
        return total;
    }

    public void setTotal(Double total) { 
        this.total = total;
    } 

    public String getOrdertime() { 
        return ordertime;
    }

    public void setOrdertime(String ordertime) { 
        this.ordertime = ordertime;
    }
    public String getState() { 
        return state;
    }

    public void setState(String state) { 
        this.state = state;
    }
    public String getCname() { 
        return cname;
    }

    public void setCname(String cname) { 
        this.cname = cname;
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
    public Integer getUserId() { 
        return userId;
    }

    public void setUserId(Integer userId) { 
        this.userId = userId;
    } 

    public Integer getShopid() { 
        return shopid;
    }

    public void setShopid(Integer shopid) { 
        this.shopid = shopid;
    } 


 }