package com.qhit.ordersItem.pojo;




public class OrdersItem { 
    private Integer itemId;    //订单详情ID 订单详情ID 
    private Integer amount;    //商品数量 商品数量 
    private Double unitprice;    //单价 单价 
    private Double subtotal;    //商品金额 商品金额=单价*商品数量 
    private Integer gid;    //商品ID 商品ID 
    private Integer oid;    //订单ID 订单ID 

    public Integer getItemId() { 
        return itemId;
    }

    public void setItemId(Integer itemId) { 
        this.itemId = itemId;
    } 

    public Integer getAmount() { 
        return amount;
    }

    public void setAmount(Integer amount) { 
        this.amount = amount;
    } 

    public Double getUnitprice() { 
        return unitprice;
    }

    public void setUnitprice(Double unitprice) { 
        this.unitprice = unitprice;
    } 

    public Double getSubtotal() { 
        return subtotal;
    }

    public void setSubtotal(Double subtotal) { 
        this.subtotal = subtotal;
    } 

    public Integer getGid() { 
        return gid;
    }

    public void setGid(Integer gid) { 
        this.gid = gid;
    } 

    public Integer getOid() { 
        return oid;
    }

    public void setOid(Integer oid) { 
        this.oid = oid;
    } 


 }