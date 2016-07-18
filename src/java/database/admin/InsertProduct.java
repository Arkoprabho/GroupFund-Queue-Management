/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.admin;

import database.UserExistsException;
import database.customer.SelectCustomer;
import java.sql.SQLException;

/**

 @author Arko
 */
public class InsertProduct extends SelectCustomer
{

    public InsertProduct() throws SQLException
    {
        // Just to call the super class constructor.
    }

    /**
    Inserts the data into the table.
    */
    public void setData(int productCode, int branchCode) throws UserExistsException, SQLException
    {
        String insertQuery = "INSERT INTO GROUPFUND.PRODUCTS VALUES (" + branchCode + "," + productCode + ")";
        if (!checkProduct(productCode))
        {
            throw new UserExistsException("Product already exists.");
        } else
        {
            statement.executeUpdate(insertQuery);
        }
    }

    /**
    Checks if the product exists in the table or not.
    */
    protected boolean checkProduct(int productCode) throws SQLException
    {
        String searchQuery = "SELECT * FROM GROUPFUND.PRODUCT WHERE PRODUCTCODE = " + productCode + "";
        resultSet = statement.executeQuery(searchQuery);
        if (resultSet.next())
        {
            return false;
        }
        return true;
    }

}
