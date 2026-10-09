// 数组的动态初始化

package com.awang.array;
import java.util.Scanner;
public class arrayDemo1 {
    public static void main(String[] args){
        // 创建数组
        int[] arr1 = new int [7];
        // 利用循环录入数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("请输入一个整数:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            arr1[i] = num;
        }

        // 遍历数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }



    }

}
