package com.tedu.cn.api;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    @Test
    public void m1(){
        /**
         * 日期转字符串
         */
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");
        String src=sdf.format(new Date());
        System.out.println(src);
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss").format(new Date()));
    }
    @Test
    public void m2() throws ParseException {
        /**
         *字符串转日期
         */
        String src="2019.12.04";
        SimpleDateFormat sd=new SimpleDateFormat("yyyy.MM.dd");
        Date d=sd.parse(src);
        System.out.println(d);
    }

}
