/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.gray.tutiontribe.servlet;


import com.gray.tutiontribe.controller.SampleRegisterRemote;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author grays
 */
@WebServlet(name = "Register", urlPatterns = {"/register"})
public class Register extends HttpServlet {


    @EJB
    private SampleRegisterRemote sampleregister;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        sampleregister.registerClient();
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
