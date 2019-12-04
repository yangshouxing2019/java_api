package com.tedu.cn.api;

public class Person {
    public Person() {
    }

    public Person(String name, int age, char gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person p=(Person) obj;
            return this.age==p.age?true:false;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name+":"+this.age+":"+this.gender+":"+this.height+":"+this.weight;
    }
}
