package com.awang.array;

import java.util.Scanner;

public class methodDemo2_dafen {
//    跳水比赛有五个评委打分,分数在0~100之间。最终得分会去掉一个最高分,去掉一个最低分,
//    剩余的分数再求平均数,改平均数为选手最终得分。
//
//    要求1:利用键盘录入5个整数存入数组当中,如果分数超出范围需要重新录入
//
//    要求2:定义方法分别求数组的最大值和最小值
//
//    要求3:计算五名评委的总分
//
//    要求4:总分-最大值-最小值,求选手最终平均分

    public  static  void main(String[] args){
        // 要求1:利用键盘录入5个整数存入数组当中,如果分数超出范围需要重新录入
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; ) {
            System.out.print("请输入评委打分：");
            int temp = sc.nextInt();

            if(temp < 0 || temp > 100)
            {
                System.out.println("分数无效");
            }

            else
            {
                arr[i] = temp;
                i++;
            }
        }



        // 要求3:计算五名评委的总分
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }


        int max = max(arr);
        int min = min(arr);

        // 要求4:总分-最大值-最小值,求选手最终平均分
        int finalSum = sum - max - min;
        int average = finalSum / 3;

        System.out.println("最终成绩为：" + average);



        }


    // 要求2:定义方法分别求数组的最大值和最小值
    // 形参为数组 int arr[]
    public  static  int max(int arr[])
    {
        int max = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return  max;

    }

    public  static  int min(int arr[])
    {
        int min = 100;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

}



