package com.reptile.souce.item;

import lombok.Data;

/**
 * 托板
 */
@Data
public class Tuoban extends MoveSource{


    public Tuoban(Integer z_floor, Integer x_index) {
        setZ_floor(z_floor);
        setX_index(x_index);
    }
}