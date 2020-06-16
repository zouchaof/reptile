package com.reptile.souce.item;

import lombok.Data;

@Data
public class Car extends BaseSource{

    public Car(Integer z_floor, Integer x_index) {
        setZ_floor(z_floor);
        setX_index(x_index);
    }
}
