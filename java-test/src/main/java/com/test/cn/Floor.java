package com.test.cn;

public class Floor {
    /**
     * 青蛙爬楼梯第一次爬1步，第二次爬1步，第三次爬2步，第四次爬3步，编程实现
     * 第20次爬多少步？
     */
    public int frog(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return frog(n-1)+frog(n-2);
        }
    }

    public static void main(String[] args) {
        int n=20;
        Floor f=new Floor();
        System.out.println("第20次爬"+f.frog(n)+"步");
    }
}
