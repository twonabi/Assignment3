package com.example.controller;


import com.example.entity.ProductsDTO;
import com.example.repository.ProductsDAO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//http://localhost:8082/Assignment3/productList
 //@WebServlet("/productList")

public class ProductListController implements Controller {

    public String requestHandler(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ProductsDAO dao = new ProductsDAO();
        List<ProductsDTO> list = dao.productsList();
        req.setAttribute("list",list);
        return "list";
    }
}
