/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.banker;

import database.customer.SelectCustomer;
import java.sql.SQLException;

/**
 Retrieves the data from the database of banker.
 @author Arko
 */
public class SelectBanker extends SelectCustomer
{

    public SelectBanker() throws SQLException
    {
        // Just to call the super constructor. Pretty useless right? :P
    }

    @Override
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
        String name = null, secretWord = null;
        try
        {
            // Construct the query.
            String searchQuery = "SELECT * FROM GROUPFUND.BANKER WHERE USERNAME='" + userId + "'";
            // Execute the query.
            resultSet = statement.executeQuery(searchQuery);
            while (resultSet.next())
            {
                name = resultSet.getString(5);
                secretWord = resultSet.getString(6);
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

    @Override
    /**
     Gets the account number.
     @return

     @throws java.sql.SQLException
     */
    public String getAccountNumber() throws SQLException
    {
        StringBuilder stringBuilder = new StringBuilder();
        // Construct the query.
        String searchQuery = "SELECT * FROM GROUPFUND.BANKER WHERE USERNAME= '" + userId + "'";
        // Execute the query.
        resultSet = statement.executeQuery(searchQuery);
        // Store the result.
        while (resultSet.next())
        {
            stringBuilder.append(resultSet.getInt(2));
            stringBuilder.append(" ");
            stringBuilder.append(resultSet.getInt(3));
            stringBuilder.append(" ");
            stringBuilder.append(resultSet.getInt(7));
            stringBuilder.append(" ");
            stringBuilder.append(resultSet.getInt(4));
        }
        return stringBuilder.toString();
    }
}
