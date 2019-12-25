package com.test.cn;

public class Factorial {
    //使用递归算法实现10的阶乘
    public int factorial(int n){
        if(n<0){
            System.out.println("负数没有阶乘");
        }
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Factorial f=new Factorial();
        System.out.println(f.factorial(10));
    }
}
