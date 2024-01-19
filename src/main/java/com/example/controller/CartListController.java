package com.example.controller;

//Servlet 의 기본 골격

import com.example.entity.ProductsDTO;
import com.example.repository.ProductsDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//http://localhost:8082/Assignment3/cartlist
 //@WebServlet("/cartlist")

public class CartListController implements Controller {

    public String requestHandler(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ProductsDAO dao= new ProductsDAO();
        List<ProductsDTO> list = dao.productsList();
        req.setAttribute("list",list);
        return "list";

    }
}
