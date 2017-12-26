package com.sigit.pattern.creational.builder;


public class Personal {


    private String skill;
    private String name;
    private int age;

    public static PersonalBuilder Builder() {
        return new PersonalBuilder();
    }
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
