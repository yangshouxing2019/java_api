package com.tedu.cn;

public class Driver {
    public static void main(String[] args) {
        Person p1=new Person("Jack",18,'N',170,70);
        Person p2=new Person("Jack",18,'N',170,70);

        System.out.println(p1.equals(p2));
        System.out.println(p1);
    }
}
