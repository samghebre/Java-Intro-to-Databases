package com.codedifferently.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class DataBase {
    private static final Logger logger = Logger.getGlobal();
    private Connection connection;

    private void getConnection() throws DataBaseConnectionException {
        try{
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3308/addressbook?createDatabaseIfNotExist=true&useSSL=false", "developer01", "pass");
            connection.setAutoCommit(false);
            logger.info("Successful Connection");
        }catch (Exception e) {
            logger.warning(e.getMessage());
            throw new DataBaseConnectionException();
        }
    }

    public Statement DataBase() throws DataBaseConnectionException, SQLException {
        getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO PERSON" + "VALUES('Sam', 'Ghebremedhin', 51, 'samuelka2001@yahoo.com')");
        connection.close();
        return statement;
    }


}
