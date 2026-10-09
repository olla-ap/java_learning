package com.awang.array;
// 查找数据，判断是否在数组内

import java.util.Scanner;

public class arrayDemo2 {
    public static void main(String[] args){
        int[] arr = {11,55,87,54,554,88};
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数据：");
        int num = sc.nextInt();
        // 利用count计数作为判断
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                System.out.println(num);
                count++;
                break;

            }
        }
        if(count == 0){
            System.out.println("数据中没有这个数");

        }


    }




}
