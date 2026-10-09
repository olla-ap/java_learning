package com.awang.array;

// 获取十个1到100内的随机数，不可以重复

import java.util.Random;



public class arrayDemo4 {
    public static void main(String[] args){
        // 获取1到100内某个随机数
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        System.out.println(num);




    }
}
