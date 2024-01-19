package com.example.controller;

//Servlet 의 기본 골격

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;


 //@WebServlet("/")

public class ProductServletController extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }
}
