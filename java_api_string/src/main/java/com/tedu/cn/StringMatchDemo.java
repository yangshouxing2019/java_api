package com.tedu.cn;

import org.junit.Test;

public class StringMatchDemo {
    //手机号匹配
    @Test
    public void m1(){
        String e1="(\\+86)?\\s?\\d{11}";
        String phone="13312379613";
        if(phone.matches(e1)){
            System.out.println("手机号合法");
        }else{
            System.out.println("手机号非法");
        }
    }
}
