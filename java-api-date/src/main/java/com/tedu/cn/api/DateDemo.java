package com.tedu.cn.api;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    @Test
    public void m1(){//Calendar是抽象类
        Calendar calendar= Calendar.getInstance();//获取日历对象
        System.out.println(calendar.getWeekYear());//现在的年份
        System.out.println(calendar.getTime());//获得此刻的年份和时间
    }
    @Test
    public void m2(){
        Date date=new Date();
        System.out.println(date);
        //返回1970年1月1日00.00到现在的毫秒数
        System.out.println(date.getTime());//是一个long值

        Date d1=new Date(157542821565L);
        System.out.println("***"+d1);
        System.out.println(d1.before(date));//判断d1这个时间是否在date这个时间之前。真为true
    }


    /**
     * 测试日期格式化
     */
    @Test
    public void m3(){
        //将具体日期格式化。
        // 日期转字符串
        SimpleDateFormat f=new SimpleDateFormat("yyy.MM.dd hh:mm:ss");//重写一个日期的格式
        String d=f.format(new Date());//获得此新的时间
        System.out.println(d);
    }

    @Test
    public void m4()throws ParseException {
        //字符串转日期
        String date="2019.12.04";
        SimpleDateFormat ne=new SimpleDateFormat("yyy.MM.dd");//转化的格式
        Date d=ne.parse(date);//匹配模式Date d=表示d变量的类型是日期类型。
        System.out.println(d);

    }
}
