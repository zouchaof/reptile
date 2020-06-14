package com.test.souce;

import lombok.Data;

import java.io.Serializable;

/**
 * 轨道
 */
@Data
public class Guidao implements Serializable {

    private Integer startIndex;//起点

    private Integer endIndex;//终点

}
