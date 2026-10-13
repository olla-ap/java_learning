package com.awang.enumtest;
/**
 * 枚举是特殊的JavaBean类
 */
public enum OrderState {
    // 在枚举类的第一行，把所有的对象都罗列出来
    // 这里调用了下面的私有构造方法，传入状态的中文描述
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");

    // 属性：状态的中文名称
    private String name;

    // 私有构造方法 (枚举类的构造方法默认是私有的)
    OrderState(String name) {
        this.name = name;
    }

    // Getter 方法，用于获取状态的中文名称
    public String getName() {
        return name;
    }
}
