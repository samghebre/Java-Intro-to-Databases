package com.codedifferently;

import com.codedifferently.database.DataBase;
import com.codedifferently.database.DataBaseConnectionException;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
   private Person owner;
    private List<Person> people;
    private DataBase dataBase;

    {
        try {
            dataBase = new DataBase();
        } catch (DataBaseConnectionException e) {
            e.printStackTrace();
        }
    }


    /**
     * An example of Dependency injection
     * @param dataBase
     */
    public AddressBook(DataBase dataBase) throws DataBaseConnectionException {
        this.dataBase = dataBase;
        this.people = new ArrayList<Person>();

    }


    public AddressBook() throws DataBaseConnectionException {
    }

    public Person getOwner(){
        return owner;
    }

    public void setOwner(Person person) {
        this.owner = person;
    }
    public void addPerson(Person person){
        people.add(person);
    }
    public void removePerson(Person person){
        people.remove(person);
    }
    public Person getPersonByEmail(String email) {
        for (Person person : people){
            if(person.getEmail().equals(email)){
                return person;
            }
        }
        return null;
    }

    public List<Person> getAllPeople(Person person){
        return people;
    }

    public boolean saveAll(){
        return true;
    }
}
