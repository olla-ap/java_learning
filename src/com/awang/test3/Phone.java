package com.awang.test3;

/**
 * 子类：手机，继承智能设备
 * 1.如果父类里面的代码，我一行都不想用，此时把子类中的方法体重新完整写一遍
 * 2.如果父类里面的代码我还想用，此时我只是在父类的基础上再加其他的逻辑
 * 此时可以先通过super关键字调用父类的方法得到一个结果，再对这个结果进行二次运算
 */
public class Phone extends SmartDevice{
    @Override
    public double payment(){
        // 调用父类里面的payment方法先计算出商品的价格
        double payment = super.payment();
        // 手机额外再打9折
        payment = payment * 0.9;
        return payment;
    }
}

