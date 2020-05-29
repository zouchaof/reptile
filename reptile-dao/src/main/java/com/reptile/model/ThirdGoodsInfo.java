package com.reptile.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name="t_third_goods_info")
public class ThirdGoodsInfo implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private Long pid;

    private String thirdPlatform;//所属平台

    private String linkHref;//目标地址

    private Date createTime;

    private Date updateTime;


}
