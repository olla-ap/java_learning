package com.awang.test3;

public class SmartDevice {

    /**
     * 父类：智能设备
     * 行为：计算商品总价格
     */
    String name;
    double price;

    /**
     * 计算价格折扣
     * [ 0 ~ 1000 ）元，不打折
     * [ 1000 ~ 5000 ）元，9折
     * [ 5000 ~ 10000 ）元，8折
     * 10000元及以上，7折
     *
     * @return 折后价格
     */
    public double payment() {
        if (price >= 0 && price < 1000) {
            return price;
        } else if (price >= 1000 && price < 5000) {
            return price * 0.9;
        } else if (price >= 5000 && price < 10000) {
            return price * 0.8;
        } else {
            return price * 0.7;
        }


    }
}
