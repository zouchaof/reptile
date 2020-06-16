package com.reptile.main;

import com.reptile.souce.Source;
import com.reptile.souce.item.Car;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DispatchService {

    private final ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 3, 0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(9999));

    public static void main(String[] args) throws Exception {
        Source.init();

        for(int i=0;i<10;i++){
            Car car = new Car(0, i);
            Source.carList.add(car);
//            Thread.sleep(2000);
        }

//        new Thread(()->{
//        }).start();
        DispatchService d = new DispatchService();
        d.dofun();

//        new Thread(()->{
//            DispatchService d = new DispatchService();
//            d.dofun();
//        }).start();



    }

    private void dofun() {
//        while (true){
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
        for(Car car : Source.carList){
            executor.submit(() -> {

            });
        }
    }

}
