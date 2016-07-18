/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.banker;

import database.UserExistsException;
import java.sql.SQLException;

/**

 @author Arko
 */
public class InsertBanker extends SelectBanker
{

    public InsertBanker() throws SQLException
    {
        // Just to call the super constructor.
    }
    
    /**
    Used to let the admin sign up a banker.
    */
    public void setData(String accountName, int countryCode, int stateCode, int branchCode, String userId, String password) throws SQLException, UserExistsException
    {
        String insertQuery = "INSERT INTO GROUPFUND.BANKER VALUES ('" + accountName + "', " + countryCode + "," + stateCode + "," + generateAccountNumber() + ",'" + userId + "', '" + password + "', " + branchCode + ")";
        if (!checkUser(userId))
        {
            throw new UserExistsException("User already exists.");
        } else
        {
            statement.executeUpdate(insertQuery);
        }
    }
    /**
    Generates the account number.
    */
    private int generateAccountNumber() throws SQLException
    {
        int lastAccountNumber = 0;
        String searchQuery = "SELECT * FROM GROUPFUND.BANKER";
        resultSet = statement.executeQuery(searchQuery);
        while (resultSet.next())
        {
            lastAccountNumber = resultSet.getInt(4);
        }
        return ++lastAccountNumber;
    }
    /**
    Checks if the user name already exists.
    */
    protected boolean checkUser(String userId) throws SQLException
    {
        String searchQuery = "SELECT * FROM GROUPFUND.BANKER WHERE USERNAME = '" + userId + "'";
        resultSet = statement.executeQuery(searchQuery);
        if (resultSet.next())
        {
            return false;
        }
        return true;
    }

}
