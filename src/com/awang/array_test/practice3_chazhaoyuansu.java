package com.awang.array;

import java.util.Scanner;

public class practice3_chazhaoyuansu {
//    给定一个递增的有序数组和一个目标值,在数组中找到目标值,打印其索引。
//
//    如果目标值不存在于数组中,打印应插入的位置
//
//    举例1:
//
//    数据:nums=[1,3,5,6];
//
//    输出:2
//
//    举例2:
//
//    数据:nums=[1,3,5,6],target=2
//
//    输出:1
//
//    target = 5
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,11};
        // 确定target
        Scanner sc = new Scanner(System.in);
        System.out.print("输入要查找的数：");
        int target = sc.nextInt();
        System.out.println();

        // 先在数组里查找,利用标志符确定找到没
         boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("[" + i + "]");
                found = true;
            }

        }
        if(found == true){
            return;
        }



        // 没有就插入
        int[] arr1 = new  int[arr.length + 1];
        int i = 0;
        int k = 0;
        // 循环一定注意潜在越界风险
        while(i < arr.length) {
            if (arr[i] < target) {
                arr1[k] = arr[i];
                i++;
                k++;
            } else {
                arr1[k] = target;
                k++;
                break;
            }
        }
         if(i == arr.length)
         {
             arr1[k] = target;
         }

         else {
             for (int i1 = i; i1 < arr.length; i1++) {
                 arr1[k] = arr[i1];
                 k++;
             }
         }
        // 遍历新数组
        for ( i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}



//            int[] arr1 = new int[arr.length + 1];
//            int k = 0;
//
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] < target) {
//                    arr1[k++] = arr[i];
//                } else {
//                    if (k == i) {          // 第一次遇到 >= target，先插 target
//                        arr1[k++] = target;
//                    }
//                    arr1[k++] = arr[i];
//                }
//            }
//
//// 如果 target 比所有元素都大，循环里没插，补上
//            if (k == arr.length) {
//                arr1[k] = target;
//            }
//


        // 将剩余数据补上
        // 1,3,5,7,9,11
        // 1,3,5,7,8,9,11
