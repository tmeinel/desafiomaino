/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desafiomaino.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;


/**
 *
 * @author tmeinel
 */
public class HelloWord extends HttpServlet{
    
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello!");
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
 
        WebAppContext webAppContext = new WebAppContext("src/main/webapp", "/");
        server.setHandler(webAppContext);
 
        System.out.println("Starting");
        server.start();
        System.out.println("Started");
        server.join();
        System.out.println("Shutdown");
    }
}
