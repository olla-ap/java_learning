package com.awang.test3;

    /**
     * 子类：平板，继承智能设备
     */
    public class Pad extends SmartDevice{
        @Override
        public double payment() {
            // 先调用父类折扣
            double payment = super.payment();
            // 平板额外95折
            payment = payment * 0.95;
            return payment;
        }
    }
