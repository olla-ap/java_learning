package com.awang.toolclasstest;

public class test {
    public static void main(String[] args) {
        // 需求:
        //在实际开发中,经常会遇到一些数组使用的工具类。
        //请按照如下要求编写一个数组的工具类完成以下需求:
        //提供一个方法printArr,用于遍历数组。
        //格式如下:[10,20,50,34,100](只考虑整数数组)
        //提供一个方法getAverage,用于返回平均分。(只考虑整数数组)
        int[] arr = {1,2,3,4,5,6,7,8};
        ArrayUitl.printfArr(arr);
        ArrayUitl.getAverage(arr);
    }


}
