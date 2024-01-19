package com.example.controller;

import com.example.entity.ProductsDTO;
import com.example.repository.ProductsDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductRegisterPostController implements Controller {

    public String requestHandler(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        int productNumber = Integer.parseInt(req.getParameter("productNumber"));
        String productName = req.getParameter("productName");
        int inventory = Integer.parseInt(req.getParameter("inventory"));
        int price = Integer.parseInt(req.getParameter("price"));
        String manufacturer = req.getParameter("manufacturer");

        ProductsDTO dto = new ProductsDTO();
        dto.setProductNumber(productNumber);
        dto.setProductName(productName);
        dto.setInventory(inventory);
        dto.setPrice(price);
        dto.setManufacturer(manufacturer);

        ProductsDAO dao = new ProductsDAO();
        dao.productsInsert(dto);
        return "redirect:list.do";
    }
}
