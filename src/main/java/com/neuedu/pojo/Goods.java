package com.neuedu.pojo;

import java.lang.Double;
import java.util.Date;

public class Goods {
    private Integer id;

    private String name;

    private Integer typeid;

    private String imgpath;

    private Double price;

    private String goodsdesc;

    private Date createtime;

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc == null ? null : goodsdesc.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }


    public Goods() {
    }

    public Goods(Integer id, String name, Integer typeid, String imgpath, Double price, String goodsdesc, Date createtime, Integer state) {
        this.id = id;
        this.name = name;
        this.typeid = typeid;
        this.imgpath = imgpath;
        this.price = price;
        this.goodsdesc = goodsdesc;
        this.createtime = createtime;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeid=" + typeid +
                ", imgpath='" + imgpath + '\'' +
                ", price=" + price +
                ", goodsdesc='" + goodsdesc + '\'' +
                ", createtime=" + createtime +
                ", state=" + state +
                '}';
    }
}