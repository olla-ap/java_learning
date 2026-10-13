package com.awang.finaltest;

public class circle_test {
    public static void main(String[] args) {
        /*
            定义一个JavaBean类描述圆
            属性：半径和圆周率
            行为：计算圆的面积和周长
        */

        // 创建一个圆的对象，半径为 1.5
        circle c = new circle(1.5);

        // 获取圆里面的属性
        System.out.println("半径: " + c.getRadius());
        System.out.println("圆周率: " + c.getPi());

        // 获取圆的面积
        System.out.println("面积: " + c.getArea());

        // 获取圆的周长
        System.out.println("周长: " + c.getLength());
    }
}
