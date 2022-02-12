package com.dmdev.http.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.Map;
import java.util.stream.Stream;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //config.getServletContext().
        super.init();
    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        var paramValue = req.getParameter("param");
//        var parameterMap = req.getParameterMap();
//        System.out.println();
//
//        resp.setContentType("text/html; charset=UTF-8");
//        resp.setHeader("token", "12345");
//        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
//        try (var writer = resp.getWriter()) {
//            writer.write("<h2>Hello from first servlet. Привет с первого сервлета</h2>");
//        }
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (var reader = req.getReader();
             var lines = reader.lines()) {
            lines.forEach(System.out::println);
        }
    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        var headerNames = req.getHeaderNames();
//        while (headerNames.hasMoreElements()) {
//            var header = headerNames.nextElement();
//            System.out.println(req.getHeader(header));
//        }


   // }

    @Override
    public void destroy() {
        super.destroy();
    }
}