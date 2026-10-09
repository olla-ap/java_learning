package com.awang.array;

// 给定一个递增有序数组，利用快慢指针去除重复元素

public class arrayDemo5 {

        public static void main(String[] args){
           int slow = 0;
           int fast = 1;
           int[] arr = {1,1,2,2,8,9,9,40,41,55,55};

           while(fast < arr.length){

               // 相同：快指针自增1
               // 不相同：慢指针自增1，并将快指针的数据赋值给慢指针，快指针自增1

               if(arr[slow] == arr[fast]){
                   fast++;

                   }
               else{
                   slow++;
                   arr[slow] = arr[fast];
                   fast++;


               }
           }
           // 只遍历慢指针的数据
            for (int i = 0; i < slow; i++) {
                System.out.print(arr[i] + " ");
            }





    }







}
