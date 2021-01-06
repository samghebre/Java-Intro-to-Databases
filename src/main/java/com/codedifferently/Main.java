package com.codedifferently;

import com.codedifferently.database.DataBase;
import com.codedifferently.database.DataBaseConnectionException;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private DataBase dataBase;
    private AddressBook addressBook;
    private static Scanner scanner;

    private ArrayList<String> menu;
    public Main() throws DataBaseConnectionException, SQLException {
        dataBase = new DataBase();
        scanner = new Scanner(System.in);
        addressBook = new AddressBook(dataBase);
        initMenuOption();
    }

    private void initMenuOption(){
        menu = new ArrayList<>();
        menu.add("Exit");
        menu.add("Add new person");
        menu.add("Remove person");
        /**
         * Add your menu items here
         */
    }

    public Integer displayMenu(){
        int option = 0;
        for(int i = 0; i < menu.size(); i++){
            String menuOption = String.format("Press %d for %s", i, menu.get(i));
            System.out.println(menuOption);
        }
        option = scanner.nextInt();
        return option;
    }

    public static void main(String[] args) {
        try {
            Main main = new Main();
            Boolean endProgram = false;
            System.out.println("Welcome to address book");
            while (!endProgram) {
                /* Your code goes here */
                int menuOption = main.displayMenu();

                switch (menuOption) {
                    case 0:
                        System.out.println("Goodbye!!");
                        endProgram = true;
                        break;
                    case 1:
                        System.out.println("Add a person");
                        break;
                    case 2:
                        System.out.println("Delete a person");
                        break;
                    default:
                        break;
                }
            }
        } catch (DataBaseConnectionException | SQLException e) {
        }
        System.out.println("Your database could not be connected to.");

        try {
            String sql = "SELECT Samuel, Ghebremedhin from PERSON";
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/addressbook?createDatabaseIfNotExist=true&useSSL=false", "developer01", "pass");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                String firstName = rs.getNString("Samuel");
                System.out.println("Found" + firstName);
            }

        } catch (SQLException se) {
            System.err.println("Got an exception!");
            System.err.println(se.getMessage());

        }
    }
}