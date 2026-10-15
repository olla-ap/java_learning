package com.awang.test5;

public class SearchStudent   extends Student {
    public SearchStudent() {
    }

    public SearchStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        super.study();
        System.out.println("学习硕士阶段知识");
    }
}
