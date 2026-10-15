package com.awang.extendstest2;

public class test {
    // 方法重写的练习(手机版本升级)
    //
    //在手机的发展历史中,第一代手机功能比较单一,只能用来打电话,比如在电视中经常见到的大哥大
    //
    //随着第二代数字移动通信系统(2G)的发展,手机体积逐渐变小,开始具备短信,彩信,基本功能
    //
    //进入到21世纪,主要是2009年左右,智能手机开始普及。按照这个背景设计手机的Javabean类
    //
    //第一代手机:
    //
    //功能:打电话
    //
    //第二代手机:
    //功能:打电话,发短信
    //
    //第三代手机:
    //
    //功能:打电话升级为视频通话,发短信,玩游戏
    public static void main(String[] args) {
        // 创建对象
        generation1 phone1 = new generation1();
        phone1.call();

        generation3 phone3 = new generation3();
        phone3.call();
        phone3.playGame();

    }

}
