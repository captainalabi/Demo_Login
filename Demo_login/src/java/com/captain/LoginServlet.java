package com.captain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ALABI
 */
//@WebServlet(urlPatterns={"/LoginServlet"})
public class LoginServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String userName = request.getParameter("uName");
        String passWord = request.getParameter("pWord");
        
        String defaultUname = "defaultUname";
        String defaultPw = "defaultPw";
        
        String successMessage = "";
        
        if(userName.equals(defaultUname) && passWord.equals(defaultPw) ){
        
        successMessage = "You are welcome onboard";
        }else{
        successMessage = "Your username or password or both are incorrect ";
        }
        
        request.setAttribute("successMessage", successMessage);
        request.getRequestDispatcher("index.jsp").forward(request,response);
        
       
        //PrintWriter out = response.getWriter();
        //out.print("good morning");
    }

    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "to receive login parameters from index and return success or failure "
                + "message";
    }// </editor-fold>

}
