package com.example.controller;


import com.example.entity.CustomerDTO;
import com.example.repository.CustomerDAO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//http://localhost:8082/Assignment3/customerlist
 //@WebServlet("/customerlist")

public class CustomerListController implements Controller {

    public String requestHandler(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        CustomerDAO dao = new CustomerDAO();
        List<CustomerDTO> customerList = dao.customerList();
        req.setAttribute("customerlist",customerList);
        return customerList.toString();
    }
}
