package com.awang.array;

import java.util.Random;
// 注意大括号位置
public class methodDemo1_suijishu {
    public static void main(String[] args) {
        //获取10个1-100之间的随机数并存入到数组当中,要求保证数据是唯一的
        // 创建数组
        int[] arr = new int[10];

        // 获取随机数
        // 注意此处不用再写i++
        for (int i = 0; i < arr.length; ) {
            Random r = new Random();
            int num = r.nextInt(100) + 1;

            boolean flag = contain(num, arr);
            if (!flag) {
                arr[i] = num;
                i++;
            }

        }


        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }


    // 判断是否重复（方法）
    public static boolean contain(int num, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }

}