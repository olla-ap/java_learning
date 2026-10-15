package com.awang.extendstest;

    public class son extends person{
        String name = "Zi";
        public void show(){
            String name = "ziShow";
            System.out.println(name); //"ziShow"
            System.out.println(this.name); //"Zi",this直接调用成员变量
            System.out.println(super. name); //"Fu"，super直接调用父类的成员变量

        }
        // 先在局部位置找,本类成员位置找,父类成员位置找,逐级往上。
        //
        //. 如果出现了重名的成员变量怎么办?
        //
        //System.out.println(name);
        //
        //System.out.println(this.name);
        //System.out.println(super.name);
        //
        //从局部位置开始往上找
        //
        //从本类成员位置开始往上找
        //
        //从父类成员位置开始往上找


    }

