package com.reptile.souce.item;

import lombok.Data;

import java.io.Serializable;

/**
 * 轨道
 */
@Data
public class Guidao extends BaseSource {

    private Integer startIndex;//起点

    private Integer endIndex;//终点

}
