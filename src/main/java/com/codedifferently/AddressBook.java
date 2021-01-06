package com.codedifferently;

import com.codedifferently.database.DataBase;
import com.codedifferently.database.DataBaseConnectionException;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private Person person = new Person();
    private Owner Person = new Owner();
    private List<Person> people = new ArrayList<>();
    private DataBase dataBase = new DataBase();


    /**
     * An example of Dependency injection
     * @param dataBase
     */
    public AddressBook(DataBase dataBase) throws DataBaseConnectionException {
        this.dataBase = dataBase;

    }

    public String getOwner(Person person){
        this.person = person;
        return null;
    }

    public Person getPerson() {
        return person;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPerson(){
        this.person = person;
    }

    public void setPeople(){
        this.people = people;
        return ;
    }
}
