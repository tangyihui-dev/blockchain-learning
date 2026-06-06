package com.yihui.ooptest.test3;

public class test {
    public static void main(String[] args) {
        Phone p1=new Phone();
        p1.brand="华为";
        p1.price=5999;
        p1.color="黑色";
        System.out.println(p1.brand+" "+p1.price+" "+p1.color);
        Phone p2=new Phone();
        p2.brand="苹果";
        p2.price=9999;
        p2.color="蓝色";
        System.out.println(p2.brand+" "+p2.price+" "+p2.color);
    }
}
