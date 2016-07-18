/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.customer;

import database.UserExistsException;
import java.sql.SQLException;

/**
Inserts data into the database of customer.
 @author Arko
 */
public class InsertCustomer extends SelectCustomer
{

    public InsertCustomer() throws SQLException
    {
        // just to call the super constructor.
    }
    
    /**
     * Method to insert data into the table.
     * @param accountName
     * @param countryCode
     * @param stateCode
     * @param branchCode
     * @param userId
     * @param password
     * @throws java.sql.SQLException
      * @throws database.UserExistsException
     */
    public void setData(String accountName, int countryCode, int stateCode, int branchCode, String userId, String password) throws SQLException, UserExistsException
    {
        // TODO construct the query.
        
        String insertQuery = "INSERT INTO GROUPFUND.CUSTOMER VALUES ('"+accountName+"', "+0+", "+countryCode+","+stateCode+","+branchCode+","+generateAccountNumber()+", '"+userId+"', '"+password+"')";
        if(!checkUser(userId))
        {
            // Throwing an exception if the user already exists.
            throw new UserExistsException("User already exists.");
        }
        else
        {
            // Else adding it to the database.
            statement.executeUpdate(insertQuery);
        }
    }
    
    /**
    Checks if the user already exists.
    */
    boolean checkUser(String userId) throws SQLException, UserExistsException
    {
        // Construct the query.
        String searchQuery = "SELECT * FROM GROUPFUND.CUSTOMER WHERE USERNAME='" +userId+"'";
        // Execute the query.
        resultSet = statement.executeQuery(searchQuery);
        if(resultSet.next())
        {
            // If the resultSet is not empty then return false.
            return false;
        }
        // else
        return true;
    }

    /**
    Returns the account number.
    The account numbers are stored in a serial order.
    */
    private int generateAccountNumber() throws SQLException
    {
        int lastAccountNumber = 0;
        // Construct the query.
        String searchQuery = "SELECT * FROM GROUPFUND.CUSTOMER";
        // Execute the query.
        resultSet = statement.executeQuery(searchQuery);
        // Go to the last row.
        while(resultSet.next())
        {
            lastAccountNumber = resultSet.getInt(6);
        }
        return ++lastAccountNumber;
    }
    
}
