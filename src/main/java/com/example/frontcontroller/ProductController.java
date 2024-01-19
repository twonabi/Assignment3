package com.example.frontcontroller;

import com.example.controller.Controller;
import com.example.controller.ProductListController;
import com.example.controller.ProductRegisterController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.do")
public class ProductController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String reqPath = req.getRequestURI();
        String cpath = req.getContextPath();
        String command = reqPath.substring(cpath.length());

        String nextView = null;
        Controller controller = null;

        if (command.equals("/productsList.do")) {
            controller = new ProductListController();
            nextView = controller.requestHandler(req, resp);

        } else if (command.equals("/productsRegister.do")) {
            controller = new ProductRegisterController();
            nextView = controller.requestHandler(req, resp);

        }
        if(nextView!=null) {
            if (nextView.indexOf(":") == -1) {
                RequestDispatcher rd = req.getRequestDispatcher(ViewResolver.makeView(nextView));
                rd.forward(req, resp);
            } else {
                resp.sendRedirect(nextView.split(":")[1]);
            }
        }
    }
}

