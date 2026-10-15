package com.awang.test5;

public class GeneralTeacher extends Teacher{
    public GeneralTeacher() {
    }

    public GeneralTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        super.teach();
        System.out.println("教通识课");
    }
}
