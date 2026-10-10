package com.awang.ooptest2;

public class teacher {
    // 1.属性

    //私有化成员变量
    //get/set方法
    String name;
    double weight;
    private int age;


    // age
    // get/ set method
    public void setAge(int num){
        // 检验年龄是否合理
        if(num >= 18 && num <= 100){
            age = num;
        }
        else{
            System.out.println("年龄不合理");
        }
    }

    public int setAge(){
        return age;
    }



    // 2.行为
    public void laugh(){
        System.out.println("laugh");
    }

    public  void cry(){
        System.out.println("cry bitterly");
    }
}
