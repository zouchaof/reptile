package com.reptile.souce.item;

import lombok.Data;

import java.io.Serializable;

/**
 * 轨道
 */
@Data
public class Guidao extends BaseSource {


    public Guidao(Integer z_floor, Integer x_index) {
        setZ_floor(z_floor);
        setX_index(x_index);
    }
}
