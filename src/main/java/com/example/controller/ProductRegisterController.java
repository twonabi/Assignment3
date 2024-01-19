package com.example.controller;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//http://localhost:8082/shopping/list/productregisterPost -----> /WEB-INF/views/register.jsp
//@WebServlet("/productregisterPost")
public class ProductRegisterController implements Controller {


    public String requestHandler(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        return "register";
    }
}




