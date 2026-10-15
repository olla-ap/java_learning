package com.awang.test5;

public class Student extends Person {
    private String grade;

    // 构造方法（需要将父类的参数传上来

    public Student() {
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }



    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void study(){
        System.out.println("正在读书");
    }
}
