package com.sigit.pattern.creational.builder;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonalBuilderTest {


    @Test
    public void testCreateObjectUsingBuilder() throws Exception {
        Personal personal = Personal.Builder().setAge(24).setName("sigit").setSkill("java").build();
        Assert.assertEquals(personal.getAge(), 24);
        Assert.assertEquals(personal.getName(), "sigit");
        Assert.assertEquals(personal.getSkill(), "java");


    }
}
