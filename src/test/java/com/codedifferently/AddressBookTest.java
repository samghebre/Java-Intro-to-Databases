package com.codedifferently;

import com.codedifferently.database.DataBase;
import com.codedifferently.database.DataBaseConnectionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddressBookTest {


    @Before
   public void init() throws  DataBaseConnectionException {
        DataBase dataBase = new DataBase();
        AddressBook addressBook = new AddressBook();
    }
        @Test
        public void testGetOwner ()  {

            Person person = new Person("", "", 45, "");
            Person expected = person;
            Person actual = person.getOwner();

            Assert.assertEquals(expected, actual);
        }
        @Test
        public void testGetPersonByEmail() throws DataBaseConnectionException {
            AddressBook addressBook = new AddressBook();
            Person sam = new Person("sam", "ghebremedhin", 50, "samuelka201@yahoo.com");
            Person expected = sam;
            Person actual = addressBook.getPersonByEmail("email");

            Assert.assertEquals(expected, actual);
        }
    }

