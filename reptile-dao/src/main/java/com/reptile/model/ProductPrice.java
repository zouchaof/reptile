package com.reptile.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name="t_product_price")
public class ProductPrice implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private Long pid;//商品id

    private BigDecimal taxation;//税费

    private BigDecimal price;//商品价格（含税）

    private BigDecimal lastPrice;//上次价格（数据更新前价格）

    private BigDecimal singlePrice;//商品单价

    private String validityPeriod ;//效期

    private String spec;//规格

    private Date createTime;

    private Date updateTime;

    private String refreshQuery;//价格更新参数
}
