package com.awang.test5;

public class Test {
    public static void main(String[] args) {
        BachelorStudent a = new BachelorStudent("小王",18,"grade 1");
        System.out.println(a.getAge());
        a.study();
    }
}


//多态:事物的多种形态
//
//多态的表现形式
//
//父类类型 对象名称=子类对象;
//
//多态的前提
//
//● 有继承/实现关系
//● 有父类引用指向子类对象  Person a = new Student();
//● 有方法重写

