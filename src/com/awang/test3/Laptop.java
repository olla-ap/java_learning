package com.awang.test3;

    /**
     * 子类：笔记本电脑，继承智能设备
     */
    public class Laptop extends SmartDevice{
        @Override
        public double payment() {
            double payment = super.payment();
            // 笔记本额外9.8折
            payment = payment * 0.98;
            return payment;
        }
    }


