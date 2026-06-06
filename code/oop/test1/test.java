package com.yihui.ooptest.test1;

public class test {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "小黄";
        d1.age = 2;
        d1.weight = 32.5;
        d1.Color="白色";
        Dog d2 = new Dog();
        d2.name = "小黑";
        d2.age = 3;
        d2.weight = 34.5;
        d2.Color="黑色";
        System.out.println(d1.name + " " + d1.age + " " + d1.weight + " " + d1.Color);
        System.out.println(d2.name + " " + d2.age + " " + d2.weight + " " + d2.Color);
    }
}
