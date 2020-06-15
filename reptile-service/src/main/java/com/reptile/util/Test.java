package com.reptile.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i<10000;i++){
            String s = HttpRequestUtil.getMethod("http://localhost/test3");
            if("true".equals(s)){
                System.out.println("return true");
                Thread.sleep(3000);
            }
        }
    }

}


