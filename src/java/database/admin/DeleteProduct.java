/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.admin;

import database.UserExistsException;
import java.sql.SQLException;

/**

 @author Arko
 */
public class DeleteProduct extends InsertProduct
{

    public DeleteProduct() throws SQLException
    {
        // Just to call the super constructor.
    }

    /**
    Deletes the product from the database.
    */
    void deleteProduct(int productCode) throws UserExistsException, SQLException
    {
        String deleteQuery = "DELETE FROM GROUPFUND.PRODUCT WHERE PRODUCTCODE = " + productCode + "";
        if (!checkProduct(productCode))
        {
            statement.executeUpdate(deleteQuery);
        } else
        {
            throw new UserExistsException("Product doesnt exist!");
        }
    }

}
