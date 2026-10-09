package com.awang.array;

public class practice2_hebingshulie {
//    给你两个有序数组 arr1 和 arr2
//
//    将两个数组中的数据合并到一个大数组
//
//    要求:合并之后的大数组也是有序的
//
//    举例1:
//
//    arr1: 13579   1 5 9 12 34 55
//                  2 3 4 10 44 56 66
    //              1 2 3 4 5 9 10 12 34 44 55 56 66
//    arr2: 246810
//
//    arr3: 1 2 3 45 6 7 8910
    public static void main(String[] args){
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10,12};
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        // 将数组里剩余的数补上，不确定哪个剩
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        // 遍历大数组
        for (k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + " ");
        }



    }
}
