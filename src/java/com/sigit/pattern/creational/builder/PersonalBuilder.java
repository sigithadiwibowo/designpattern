package com.sigit.pattern.creational.builder;


public class PersonalBuilder {

    private Personal personal;

    public PersonalBuilder() {
        this.personal = new Personal();
    }

    public Personal build() {
        return this.personal;
    }

    public PersonalBuilder setSkill(String skill) {
        this.personal.setSkill(skill);
        return this;
    }



    public PersonalBuilder setAge(int age) {
        this.personal.setAge(age);
        return this;
    }



    public PersonalBuilder setName(String name) {
        this.personal.setName(name);
        return this;
    }



}
