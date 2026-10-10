package com.awang.ooptest3;

public class pet_test {
    public static void main(String[] args) {
//        小狗有属性:姓名、年龄。
//        行为:吃骨头
//                实现以下需求
//        要求1:小狗的年龄:0~15岁
//        要求2:打印小狗所有的信息:小白,2岁
//        要求3:调用吃骨头的方法打印效果:2岁的小白,正在吃骨头

        pet a = new pet();


        a.setName("小白");
        a.setAge(13);
            System.out.println(a.setName() + "," +  a.setAge());

        a.eat();
    }
}
