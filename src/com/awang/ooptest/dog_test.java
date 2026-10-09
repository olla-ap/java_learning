package com.awang.ooptest;

public class dog_test {
    public static  void main(String[] args){
        // 在main函数中创建对象
        dog d1 = new dog();
        d1.age = 4;
        d1.color = "white";
        d1.name = "wang";
        d1.weight = 12;

        // 获取第一只小狗的信息
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.weight);
        System.out.println(d1.color);


    }
}
