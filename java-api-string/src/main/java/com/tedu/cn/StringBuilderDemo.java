package com.tedu.cn;

import org.junit.Test;

public class StringBuilderDemo {

    @Test
    public void testBuilder(){
        /**
         * StringBuilder与StringBuffer都是一个可变的字符串序列
         * 但是StringBuilder没有安全锁synchronization,而StringBuffer有
         * StringBuilder是非线程安全的可变字符串类，运行效率较高，但不能保证线程安全
         * StringBuffer也是一个可变字符串类，但运行效率较低，线程安全
         */


    }
}
