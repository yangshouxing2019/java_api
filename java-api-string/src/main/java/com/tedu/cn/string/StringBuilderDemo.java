package com.tedu.cn.string;

import org.junit.Test;

public class StringBuilderDemo {
    @Test
    /**
     * StringBuilder与StringBuffer都是一个可变的字符串序列
     * 但是StringBuilder没有安全锁synchronization,而StringBuffer有
     */

    public void m1(){
        //这是没有加锁的，所以不太安全。no synchronization
        //StringBuilder是可变的。不断的收纳。也可以通过toString（）吐出
        StringBuilder builder=new StringBuilder();
        //append方法
        //以下是加入元素
        builder.append("I love you!");
        builder.append(2019);
        builder.append('a');
        System.out.println("没有被删除："+builder.toString());
        builder.delete(2,5);//删除也是·含头不含尾·，删除第2个到第4个字符。

        //builder.toString()取出放入builder的元素
        System.out.println("已经删除的："+builder.toString());

        //指定删除字符串、2019
        builder.delete(builder.indexOf("2019"),builder.indexOf("2019")+"2019".length());
        System.out.println(builder.toString());

    }
    public void tip(){
        /**
         * StringBuilder 和StringBuffer的区别
         * StringBuilder：是非线程安全可变字符串类型。运行效率高。但是不能保证县城安全
         * StringBuffer也是一个可变字符串类。但是运行效率低。能保证安全。
         */
    }
}
