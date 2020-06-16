package com.reptile.souce.item;

import lombok.Data;

/**
 * 1楼缓冲区
 */
@Data
public class Huanchong extends BaseSource{


    public Huanchong(Integer x_index) {
        setZ_floor(0);
        setX_index(x_index);
    }
}
