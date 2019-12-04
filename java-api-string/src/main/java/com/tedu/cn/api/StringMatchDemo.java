package com.tedu.cn.api;

import org.junit.Test;

public class StringMatchDemo {
    @Test
    public void m1(){
        String e1="[a-z]";
        System.out.println("i".matches(e1));
    }
}
