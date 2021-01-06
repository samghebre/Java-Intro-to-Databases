package com.codedifferently;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
  //  private  char gender;
    private String email;

    public Person(String firstName, String lastName, Integer age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public Person() {
        firstName = getFirstName();
        lastName = getLastName();
        age = getAge();
        email = getEmail();
    }


    public String getFirstName() {
        firstName = "Rome";
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getLastName() {
        lastName = "Paris";
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        age = 45;
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getEmail() {
        email = "samuelka2001@yahoo.com";
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person getOwner() {
        return new Person();
    }
}
