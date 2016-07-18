/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banker;

import java.util.ArrayList;

/**

 @author Arko
 */
class CustomerTicket
{

    public int ticketNumber;
    int priority;

    /**
     Initializes the ticket number, and the priority to 0.
     */
    public CustomerTicket(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
        this.priority = 0;
    }

    /**
     Initializes the ticket number and priority to given values.
     */
    public CustomerTicket(int ticketNumber, int priority)
    {
        this.ticketNumber = ticketNumber;
        this.priority = priority;
    }

    /**
     returns the priority.
     */
    int getPriority()
    {
        return priority;
    }

    void setPriority(int priority)
    {
        this.priority = priority;
    }

    /**
     returns the ticket number.
     */
    int getTicketNumber()
    {
        return ticketNumber;
    }
}

/**
 Methods that the banker can access.
 */
public class BankerOperations
{
    public static ArrayList arrayListQueue = new ArrayList();
    
    /**
    Returns and deletes the first ticket in the queue.
    */
    static int deleteTicket()
    {
        return (int) arrayListQueue.remove(0);
    }
    
    /**
    Returns(doesn't delete) the first ticket in the queue. This is a part of the central display.
    */
    static int getFirstTicket()
    {
        return (int) arrayListQueue.get(0);
    }
}
