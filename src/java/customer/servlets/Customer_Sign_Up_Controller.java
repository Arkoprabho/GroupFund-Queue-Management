/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer.servlets;

import database.UserExistsException;
import database.customer.InsertCustomer;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**

 @author Arko
 */
public class Customer_Sign_Up_Controller extends HttpServlet
{

    /**
     Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     methods.
     @param request servlet request
     @param response servlet response

     @throws ServletException if a servlet-specific error occurs
     @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        ServletContext servletContext = null;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            servletContext = request.getServletContext();
            String userName = request.getParameter("username");
            String fullName = request.getParameter("fullname");
            
            // To allow parsing from the parameters.
            // TODO find a better/ cleaner way.
            String tempString = request.getParameter("country");
            int countryCode = Integer.parseInt(tempString);
            tempString = request.getParameter("state");
            int stateCode = Integer.parseInt(tempString);
            tempString = request.getParameter("branch");
            int branchCode = Integer.parseInt(tempString);
            String password = request.getParameter("pass");
            
            
            String password = request.getParameter("pass");
            InsertCustomer insertCustomer = new InsertCustomer();
            insertCustomer.setData(fullName, countryCode, stateCode, branchCode, userName, password);
            
        }
        catch(UserExistsException e)
        {
            // Handle error Accordingly.
            servletContext.log(e.getMessage());
        }
        catch(SQLException e)
        {
            servletContext.log(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     Handles the HTTP <code>GET</code> method.
     @param request servlet request
     @param response servlet response

     @throws ServletException if a servlet-specific error occurs
     @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     Handles the HTTP <code>POST</code> method.
     @param request servlet request
     @param response servlet response

     @throws ServletException if a servlet-specific error occurs
     @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     Returns a short description of the servlet.
     @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
