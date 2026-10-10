package com.awang.ooptest4;

public class student  {
    // 属性：姓名 年龄 性别 身高
    private String name;
    private int age;
    private String gender;
    private int height;

    // 构造方法
    // 习惯：空参
    public student() {
    }

    // 带全部参数的构造
    public student(String name, int age, String gender, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    // set/get
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 截图未显示完整的 get/set 方法，根据代码规范补充如下：
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}