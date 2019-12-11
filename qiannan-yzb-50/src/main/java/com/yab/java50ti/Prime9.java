package com.yab.java50ti;

import java.util.Scanner;

public class Prime9 {
    /*
    题目：一个素数能被几个9整除
     */
    public static boolean isPrime(long n){
        boolean f=true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0||n==1){
                    f=false;
                    break;
                }else {
                    f= true;
                }
            }
        return f;
    }

    public static void main(String[] args) {
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入一个数：");
        long n=scanner.nextLong();
        if(n>8){
            if(isPrime(n)){
                while (n%9==0){
                    n/=9;
                    count++;
                }
                System.out.print(n+"能被"+count+"个9整除");
            }else {
                System.out.println(n+"不是素数");
            }
        }else{
            System.out.println("请输入大于9的数");
        }
        scanner.close();
    }
}
