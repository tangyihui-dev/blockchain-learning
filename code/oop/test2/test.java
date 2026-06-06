package com.yihui.ooptest.test2;

public class test {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="小王";
        s2.name="小张";
        s1.age=18;
        s2.age=19;
        s1.gender='男';
        s2.gender='女';
        s1.height=170;
        s2.height=160;
        System.out.println("学生姓名为："+s1.name+"，年龄为："+s1.age+"，性别为："+s1.gender+"，身高为："+s1.height);
        System.out.println("学生姓名为："+s2.name+"，年龄为："+s2.age+"，性别为："+s2.gender+"，身高为："+s2.height);
    }
}
