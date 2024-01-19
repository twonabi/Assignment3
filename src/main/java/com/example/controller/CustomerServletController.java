package com.example.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

//http://localhost:8082/shopping/main -----> /WEB-INF/views/template.jsp
// @WebServlet("/main")
public class CustomerServletController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
                                                   throws ServletException, IOException {
        RequestDispatcher rd=req.getRequestDispatcher("/WEB-INF/views/template.jsp");
        rd.forward(req,resp);
    }
}
