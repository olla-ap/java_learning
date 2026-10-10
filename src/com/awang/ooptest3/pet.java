package com.awang.ooptest3;

public class pet {
    //1. 就近原则
    //在方法当中直接使用变量查找顺序:
    //先找局部变量,再找成员变量

    //2. this的作用?
    //可以区别成员变量和局部变量
    //System.out.println(age);// 触发就近原则
    //System.out.println(this.age);//使用成员变量


    //  属性和行为
    private String name;
    private int age;



    // 写set/get方法
    // value 即要赋的值
    public void setName(String name){
        this.name = name;
    }
    public String setName(){
        return name;
    }


    public void setAge(int age){
        if(age >= 0 && age <= 15){
            this.age = age;
        }
        else{
            System.out.println("该年龄不合规");
        }
    }
    public int setAge(){
        return age;
    }




    // 行为
    public void eat(){
        System.out.println(age + "岁的" + name + "，正在吃骨头");
    }


}
