package com.awang.test4;

public class Student extends Person {
    String grade;

    // 构造方法
    // 1.空参构造
    public Student() {
        System.out.println("子类Student的空构造执行了~");
    }

    // 2.带全部参数构造（父 + 子）
//    public Student(String name, int age, String grade){
//        // 父类中的属性：通过super(参数)的形式传递给父类的构造方法赋值
//        super(name,age);
//        // 子类中的属性：自己赋值
//        this.grade = grade;
//
//        System.out.println("子类Student的带参构造执行了~");
//    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
        System.out.println("子类Student的带参构造执行了~");
    }
}
