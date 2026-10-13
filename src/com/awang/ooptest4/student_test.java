package com.awang.ooptest4;

public class student_test {
    public static void main(String[] args) {
        // 定义一个Javabean类描述学生
        // 属性：姓名 年龄 性别 身高

        // 创建对象
        // 1.调用无参构造
        student s = new student();
        // 利用setter检验合法性和赋值
        s.setAge(15);
        s.setGender("male");
        s.setHeight(178);
        s.setName("wang");
//        System.out.println(s.age);无法直接获取
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        System.out.println(s.getHeight());

        // 带所以参数的构造
//        student ss = new student("zhangsan", 23, "男", 180);
//        System.out.println(ss.getName());
//        System.out.println(ss.getAge());
//        System.out.println(ss.getGender());
//        System.out.println(ss.getHeight());
    }
}