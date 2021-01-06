package com.codedifferently;

import com.codedifferently.database.DataBase;
import jdk.internal.icu.text.UnicodeSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddressBookTest {



    @Before
   public void init() {
        DataBase dataBase = new DataBase();
        AddressBook addressBook = new AddressBook(dataBase);
    }
        @Test
        public void testGetOwner ()  {

            Person person = new Person("", "", 51, "");
            Person expected = person;
            Person actual = person.getOwner();

            Assert.assertEquals(expected, actual);
        }
        @Test
        public void testGetPersonByEmail() {
            DataBase database = new DataBase();
            AddressBook addressBook = new AddressBook(database);
            Person person = new Person("Samuel", "Ghebremedhin", 51, "samuelka201@yahoo.com");
            Person expected = person;
            Person actual = addressBook.getPersonByEmail("samuelka2001@yahoo.com");

            Assert.assertEquals(expected, actual);
        }
    }

