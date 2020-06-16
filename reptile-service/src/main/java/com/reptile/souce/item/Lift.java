package com.reptile.souce.item;

import lombok.Data;

/**
 * 轨道
 */
@Data
public class Lift extends BaseSource {

    public Lift(Integer x_index) {
        setZ_floor(1);
        setX_index(x_index);
    }
}
