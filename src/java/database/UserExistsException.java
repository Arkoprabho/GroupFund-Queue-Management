/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
User defined exception, thrown when user already exists,
 @author Arko
 */
public class UserExistsException extends Exception
{

    public UserExistsException(String message)
    {
        super(message);
    }
    
}
