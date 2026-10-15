package com.awang.test3;

public class Test {
    public static void main(String[] args) {
        // 创建手机对象，原价6000
        Phone p = new Phone();
        p.price = 6000;
        // 计算价格
        double res = p.payment();
        System.out.println(res);
    }
}

