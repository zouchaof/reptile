package com.reptile.mess.main;

import com.reptile.mess.util.HttpRequestUtil;
import com.reptile.mess.util.MultiHttpClient;

public class TestMain {

    public static void main(String[] args) {
        String phone = "15527933115";
//        fun(phone);
//        doMogu(phone);
//        fun1(phone);
        fun2(phone);
    }



    //羚萌直播
    private static void fun2(String phone){
//        String url1 = "https://live.51lm.tv/";
        MultiHttpClient httpClient = new MultiHttpClient(true);
//        System.out.println(httpClient.getMethod(url1));
        String url = "https://live.51lm.tv/user/acct/login/getSmsCode?mobile="+phone;
        System.out.println(httpClient.postMethodByJsonStream(url,"{\"mobile\":\""+phone+"\"}","utf-8"));
    }

    //随乐游
    private static void fun1(String phone){
        String url = "https://www.suileyoo.com/api/passport/login/sendcode?cellphone="+phone;
        System.out.println(HttpRequestUtil.getMethod(url));
    }

    //跳跃网络
    private static void fun(String phone){
        MultiHttpClient httpClient = new MultiHttpClient();
        httpClient.getMethod("http://passport.jumpw.com/views/register.jsp");
        String url = "http://passport.jumpw.com/UserManager.do";
        String body = "serviceCode=100100096&Phonestr="+phone;
        String returnString = httpClient.postMethod(url, body, "utf-8");
        System.out.println(returnString);
    }

    //蘑菇云游
    private static void doMogu(String phone){
        String url = "https://www.moguyouxi.cn/Home/SendVerificationCode";
        String returnString = HttpRequestUtil.postMethod(url, "phone="+phone+"&code=", "utf-8");
        System.out.println(returnString);
    }

    class PhoneCont{
        String pingan = "https://www.4008000000.com/ebusiness/breakPoint.do?mediaSource=T00-BD-HYDT-xz2019-gw&province=420000&departmentCode=2091301&city=420100&vehicleLicenceCode=%E9%84%82A*&mobile=13308628696&pname=%E6%B9%96%E5%8C%97%E7%9C%81&cname=%E6%AD%A6%E6%B1%89%E5%B8%82";



    }

}
