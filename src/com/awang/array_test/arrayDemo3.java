package com.awang.array;

import java.util.Random;






// 将数据打乱
public class arrayDemo3 {
    public static void main(String[] args){
        // 获取随机数据
        // Random r = new Random();
        // int randomNum = r.nextInt(arr.length);

        // 键盘录入
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();




        // 1.定义数组
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

        System.out.println();
        System.out.println("_________");
        // 2.遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 获取随机索引
            Random r = new Random();
            int randomNum = r.nextInt(arr.length);
            // 利用中间量实现两个数据交换
            int temp = arr[i];
            arr[i] = arr[randomNum];
            arr[randomNum] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }



    }
}
