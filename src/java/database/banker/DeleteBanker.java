/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.banker;

import database.UserExistsException;
import java.sql.SQLException;

/**
 Contains methods to delete a banker from the database.
 @author Arko
 */
public class DeleteBanker extends InsertBanker
{

    public DeleteBanker() throws SQLException
    {
        // Just to call the super constructor.
    }

    /**
     Deletes the banker specified by its user name from the database.
     */
    void deleteBanker(String userId) throws SQLException, UserExistsException
    {
        String deleteQuery = "DELETE FROM GROUPFUND.BANKER WHERE USERNAME = '" + userId + "'";
        if (!checkUser(userId))
        {
            statement.executeUpdate(deleteQuery);
        } else
        {
            throw new UserExistsException("User doesnt exist!");
        }
    }
}
