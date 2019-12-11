package com.tedu.cn.string;

import org.junit.Test;

public class PackageDemo1 {
    @Test
    public void m1(){
        String pwd="123ddd456";//对这个密码进行判断
        if(pwd.length()<8){
            throw new PasswordException(2,"密码安全系数不高");
        }
        if(pwd.matches("\\d{4,8}&&\\w{4,8}")){
            throw  new PasswordException(1,"密码不匹配");
        }
        if(!pwd.equals("asdffg123")){
            throw new PasswordException(3,"密码错误");
        }
    }
}
