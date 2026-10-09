package com.awang.array;

import java.util.Scanner;

public class practice1_plus {
    /* 给定一个整数数组nums和一个整数目标值target,请你在该数组中找出和为目标值target 的
那两个 整数,并输出它们的数组索引。

提示:先不用考虑效率问题,两层循环即可完成

要求1:只要输出第一对满足要求的情况

要求2:输出所有满足要求的情况*/

    public static void main(String[] args){
        int[] arr = {1,5,8,9,4,6,3};
        int target;
//        boolean found = false;
        // 键盘录入target
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数作为target:");
        target = sc.nextInt();
        System.out.println();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == target){
//                    found = true;
                    System.out.println(i + " " + j);
                    //  方法一：通过return跳出两层循环，完成要求1
                    return;
                    //方法二：利用标志位跳出循环（通用）
                }

            }

        }







    }
}
