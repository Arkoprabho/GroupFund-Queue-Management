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
public class AdminOperations
{
    DeleteProduct deleteProduct = null;
    InsertProduct insertProduct = null;

    public AdminOperations() throws SQLException
    {
        deleteProduct = new DeleteProduct();
        insertProduct = new InsertProduct();
    }
    
    
    //TODO
    /*
    Create a product and add it to the database.
    Delete a product from the database.
    */
    
    /**
    Method to delete a product specified by its product code.
    */
    public void productsServices(int productCode) throws UserExistsException, SQLException
    {
        deleteProduct.deleteProduct(productCode);
    }
    
    /**
    Method to insert a specific product into the database.
    */
    public void productsServices(int productCode, int branchCode) throws UserExistsException, SQLException
    {
        insertProduct.setData(productCode, branchCode);
    }
}
