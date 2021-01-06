package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {


    @Test
    public void testGetFirstName(){
        Person person = new Person();
        String expected = "";
        String actual = person.getFirstName();
        Assert.assertEquals(expected,actual);

        System.out.println(actual);
    }
    @Test
    public void testGetLastName(){
        Person person = new Person();
        String expected = "";
        String actual = person.getLastName();
         Assert.assertEquals(expected,actual);

        System.out.println(actual);
    }

    @Test
    public void testGetAge(){
        Person person = new Person();
        Integer expected = 45;
        Integer actual = person.getAge();

        Assert.assertEquals(expected,actual);

        System.out.println(actual);
    }
    @Test
    public void testGetEmail(){
        Person person = new Person();
        String expected = "";
        String actual = person.getEmail();

        Assert.assertEquals(expected,actual);

        System.out.println(actual);
    }

//    @Test
//    public void testGender(){
//        Person person = new Person();
//        person.getGender("male");
//        char expected = 'M';
//        char actual = person.getGender("male");
//        Assert.assertEquals(expected,actual);
//
//        System.out.println(actual);
//    }
}
