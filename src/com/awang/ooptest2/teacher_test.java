package com.awang.ooptest2;

public class teacher_test {
    // 新建一个类，写主入口
    public static void main(String[] args) {
    // 在主入口中创建 对象
        teacher a = new teacher();
        // 赋值
        a.setAge(19);
        a.name = "wang";
        a.weight = 66.6;

        a.cry();
        a.laugh();
    }
}
