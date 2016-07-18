/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import banker.BankerOperations;

/**
Contains methods to handle the ticket.
@author Arko
*/
public class TicketHandler
{
    /**
    Generates the ticket and adds it to the queue.
    */
    static void generateTicket()
    {
        int ticketNumber = 0;
        for(Object item : BankerOperations.arrayListQueue)
        {
            ticketNumber = (int) item;
        }
        ticketNumber++;
        BankerOperations.arrayListQueue.add(ticketNumber);
    }
}
