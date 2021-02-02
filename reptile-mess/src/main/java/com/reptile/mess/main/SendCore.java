package com.reptile.mess.main;

import com.reptile.mess.util.HttpRequestUtil;
import com.reptile.mess.util.MultiHttpClient;

public class SendCore {

    public static void main(String[] args) {
        fun();
        doMogu();
    }




    //跳跃网络
    private static void fun(){
        MultiHttpClient httpClient = new MultiHttpClient();
        httpClient.getMethod("http://passport.jumpw.com/views/register.jsp");
        String url = "http://passport.jumpw.com/UserManager.do";
        String body = "serviceCode=100100096&Phonestr=13308628696";
        String returnString = httpClient.postMethod(url, body, "utf-8");
        System.out.println(returnString);
    }

    //蘑菇云游
    private static void doMogu(){
        String url = "https://www.moguyouxi.cn/Home/SendVerificationCode";
        String returnString = HttpRequestUtil.postMethod(url, "phone=13308628696&code=", "utf-8");
        System.out.println(returnString);
    }

    class PhoneCont{
        String pingan = "https://www.4008000000.com/ebusiness/breakPoint.do?mediaSource=T00-BD-HYDT-xz2019-gw&province=420000&departmentCode=2091301&city=420100&vehicleLicenceCode=%E9%84%82A*&mobile=13308628696&pname=%E6%B9%96%E5%8C%97%E7%9C%81&cname=%E6%AD%A6%E6%B1%89%E5%B8%82";



    }

}
