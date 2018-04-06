package com.mmall.vo;

import java.math.BigDecimal;

/**
 * Created by power on 2018/4/6.
 */
public class ProductDetailVo {
    private Integer id;
    private Integer categroyId;
    private String name;
    private String subtitle;
    private String mainImage;
    private String subImage;
    private String detail;
    private BigDecimal price;
    private Integer stock;
    private Integer status;
    private String createTime;
    private String updateTime;

    private String imageHost;
    private Integer parentCategroyId;

    public Integer getCategroyId() {
        return categroyId;
    }

    public void setCategroyId(Integer categroyId) {
        this.categroyId = categroyId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentCategroyId() {
        return parentCategroyId;
    }

    public void setParentCategroyId(Integer parentCategroyId) {
        this.parentCategroyId = parentCategroyId;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getSubImage() {
        return subImage;
    }

    public void setSubImage(String subImage) {
        this.subImage = subImage;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
