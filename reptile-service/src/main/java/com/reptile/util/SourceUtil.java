package com.reptile.util;

import com.reptile.souce.Source;
import com.reptile.souce.SourceConfig;
import com.reptile.souce.item.Car;
import com.reptile.souce.item.Huanchong;

public class SourceUtil {

    public static void lockHuanchong(Car car){
        for(Huanchong huanchong : Source.huanchongList){
            if(huanchong.getX_index().equals(car.getX_index())){
                huanchong.setStatus(1);
            }
        }
    }

    public static void lockStock(Car car){
//        for(Huanchong huanchong : Source.huanchongList){
//            if(huanchong.getX_index().equals(car.getX_index())){
//                huanchong.setStatus(1);
//            }
//        }
    }

}
