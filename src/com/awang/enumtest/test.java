package com.awang.enumtest;

public class test {
    public static void main(String[] args) {
        /*
            电商项目中，订单的状态只有以下6种，请编写代码实现。
            待支付      PAYMENT_PENDING
            处理中      PROCESSING
            已发货      SHIPPED
            配送中      OUT_FOR_DELIVERY
            已送达      DELIVERED
            已取消      CANCELLED
        */

        // 获取枚举类的对象
        // 细节：所有的枚举项，默认使用 public static final 修饰的
        final OrderState o1 = OrderState.PAYMENT_PENDING;

        // 调用 getName() 方法获取中文描述并打印
        System.out.println(o1.getName());
        
        // 调用value()及valudeof()方法
        // 获取所有枚举项
        OrderState[]  arr  = OrderState.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 获取指定枚举项
        OrderState ship = OrderState.valueOf("SHIPPED");
        System.out.println(ship);
    }
}