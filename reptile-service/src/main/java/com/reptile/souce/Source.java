package com.reptile.souce;

import com.reptile.souce.item.*;

import java.util.*;

public class Source {

    public static List<Guidao> guidaoList = new ArrayList<>();
    public static List<Tuoban> tuobanList = new ArrayList<>();
    public static List<Huanchong> huanchongList = new ArrayList<>();
    public static List<Lift> liftList = new ArrayList<>();
    public static List<Car> carList = new ArrayList<>();
    public static List<Stock> stockList = new ArrayList<>();
    public static ZhuaShou zhuaShou = new ZhuaShou();

//    public static Map<Integer, Map<Integer, Stock>> stockInfo = new HashMap<>();
//    public static Map<Integer, Map<Integer, Guidao>> gui = new HashMap<>();
//    public static Map<Integer, Map<Integer, Stock>> stockInfo = new HashMap<>();
//    public static Map<Integer, Map<Integer, Stock>> stockInfo = new HashMap<>();
//    public static Map<Integer, Map<Integer, Stock>> stockInfo = new HashMap<>();


    public static void init(){

        for(int z =0;z<SourceConfig.floors;z++){
            for(int x = 0;x<SourceConfig.columns ; x++){
                Guidao guidao = new Guidao(z, x);
                guidaoList.add(guidao);
                stockList.add(new Stock(z, x));
            }
        }

        for(int i = 0; i<SourceConfig.liftCount; i++){
            liftList.add(new Lift(i));
        }

        for(int i = 0; i<SourceConfig.tuobanCount; i++){
            Tuoban tuoban = new Tuoban(1, i);
            tuobanList.add(tuoban);
        }

        for(int i=0;i<SourceConfig.columns;i++){
            Huanchong huanchong = new Huanchong(i);
            huanchongList.add(huanchong);
        }

        zhuaShou.setX_index(5);
        Set<Integer> set = new HashSet<>();
        set.add(3);
        zhuaShou.setZ_floorSet(set);
    }


}
