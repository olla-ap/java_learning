package com.awang.toolclasstest;

public class ArrayUitl {
    // 私有化构造方法,目的:不让外界创建对象
    private ArrayUitl(){}



// 定义方法(静态)
/*提供一个方法printArr,用于遍历数组。
格式如下:[10,20,50,34,100](只考虑整数数组)*/
    public static void printfArr(int[] arr){
        System.out.print("[" + " ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // 方法二：getAverage，用于求平均数
    public static void getAverage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // 注意avg用double定义
        double average = sum * 1.0 / arr.length;
        System.out.println("平均数为:" + average);
        }


}
