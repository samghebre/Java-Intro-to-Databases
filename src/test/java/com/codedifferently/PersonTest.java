package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testGetFirstName(){
        Person person = new Person();
        String expected = "John";
        String actual = person.getFirstName();
        Assert.assertEquals(expected,actual);

        System.out.println(actual);
    }
    @Test
    public void testGetLastName(){
        Person person = new Person();
        String expected = "Doe";
        String actual = person.getLastName();
         Assert.assertEquals(expected,actual);

        System.out.println(actual);
    }

    @Test
    public void testGetAge(){
        Person person = new Person();
        Integer expected = 35;
        Integer actual = person.getAge();

        Assert.assertEquals(expected,actual);

        System.out.println(actual);
    }
    @Test
    public void testGetEmail(){
        Person person = new Person();
        String expected = "email@email.com";
        String actual = person.getEmail();

        Assert.assertEquals(expected,actual);

        System.out.println(actual);
    }
}
