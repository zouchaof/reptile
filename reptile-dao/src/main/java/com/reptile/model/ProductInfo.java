package com.reptile.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name="t_product_info")
public class ProductInfo implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private Long channelId;//所属栏目id

    private String productName;//物品名称

    private String thirdGoodsId;//三方商品id

    private String unit;//单位

    private String productDesc;//规格描述

    private String trademark;//品牌

    private String barcode;//条形码

    private String shelfLife;//保质期

    private Date createTime;

    private Date updateTime;


}
