package com.awang.test5;

public class ProfessionTeacher extends Teacher{
    public ProfessionTeacher() {
    }

    public ProfessionTeacher(String name, int age, String subject) {
        super(name, age, subject);

    }

    @Override
    public void teach() {
        super.teach();
        System.out.println("教专业课");
    }
}
