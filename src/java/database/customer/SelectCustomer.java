/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.customer;

import java.sql.*;
import java.util.Scanner;

/**
 Retrieves the data from the database of customer.
 @author Arko
 */
public class SelectCustomer
{

    // Variable declaration.
    protected String url;
    protected String databaseUserName, databasePassword, userId, password;
    String name;
    int cash;

    // Object declaration.
    protected Connection connection;
    protected Statement statement;
    protected ResultSet resultSet;
    protected Scanner scanner;

    /**
     Used to initialize the objects.
     @throws java.sql.SQLException
     */
    public SelectCustomer() throws SQLException
    {
        scanner = new Scanner(System.in);
        url = "jdbc:derby://localhost:1527/NIITProject";
        databaseUserName = "GroupFund";
        databasePassword = "123456789";
        connect();
    }

    /**
     Used to set the name.
     @param userId
     */
    public void setName(String userId)
    {
        this.userId = userId;
    }

    /**
     Used to set the password.
     @param password
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     Establishes a connection between the database and the user.
     */
    private void connect() throws SQLException
    {
        try
        {
            // Connecting to the databse.
            connection = DriverManager.getConnection(url, databaseUserName, databasePassword);
            // On connection -> preparing the statement to execute the queries.
            statement = connection.createStatement();
        } catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    /**
     Matches the password with the account name and returns true if the password
     is correct.
     @param userId
     @param password

     @return

     @throws java.sql.SQLException
     */
    public boolean validate(String userId, String password) throws SQLException
    {
        String name = null;
        String secretWord = null;
        try
        {
            // Construct the query.
            String searchQuery = "SELECT * FROM GROUPFUND.CUSTOMER WHERE USERNAME='" + userId + "'";
            // Execute the query.
            resultSet = statement.executeQuery(searchQuery);
            // Store the results.
            while (resultSet.next())
            {
                name = resultSet.getString(7);
                secretWord = resultSet.getString(8);
            }
        } catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        if (name != null && secretWord != null)
        {
            if (name.equals(userId) && secretWord.equals(password))
            {
                setName(userId);
                setPassword(password);
                return true;
            }
        }
        return false;
    }

    /**
     Returns balance in the account.
     @return

     @throws java.sql.SQLException
     */
    public int getCash() throws SQLException
    {
        try
        {
            // Construct the query.
            String searchQuery = "SELECT * FROM GROUPFUND.CUSTOMER WHERE USERNAME= '" + userId + "'";
            // Execute the query and store the output in a result set.
            resultSet = statement.executeQuery(searchQuery);
            while (resultSet.next())
            {
                cash = resultSet.getInt(2);
            }
            System.out.println("Cash: " + cash);
        } catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        return cash;
    }

    /**
     Returns the name of the account holder.
     @return

     @throws SQLException
     */
    public String getName() throws SQLException
    {
        try
        {
            // Construct the query.
            String searchQuery = "SELECT * FROM GROUPFUND.CUSTOMER WHERE USERNAME= '" + userId + "'";
            // Execute the query.
            resultSet = statement.executeQuery(searchQuery);
            // Store the result.
            while (resultSet.next())
            {
                name = resultSet.getString(1);
            }
        } catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        
        return name;
    }

    /**
     Gets the account number.
     @return

     @throws java.sql.SQLException
     */
    public String getAccountNumber() throws SQLException
    {
        StringBuilder stringBuilder = new StringBuilder();
        // Construct the query.
        String searchQuery = "SELECT * FROM GROUPFUND.CUSTOMER WHERE USERNAME= '" + userId + "'";
        // Execute the query.
        resultSet = statement.executeQuery(searchQuery);
        // Store the result.
        while (resultSet.next())
        {
            stringBuilder.append(resultSet.getInt(3));
            stringBuilder.append(" ");
            stringBuilder.append(resultSet.getInt(4));
            stringBuilder.append(" ");
            stringBuilder.append(resultSet.getInt(5));
            stringBuilder.append(" ");
            stringBuilder.append(resultSet.getInt(6));
        }
        return stringBuilder.toString();
    }
}
