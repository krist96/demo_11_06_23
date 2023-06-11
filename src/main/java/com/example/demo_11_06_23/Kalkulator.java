package com.example.demo_11_06_23;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Kalkulator", value = "/Kalkulator")
public class Kalkulator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String liczba = request.getParameter("liczba");
        String liczba2 = request.getParameter("liczba2");

        int wynik = (Integer.parseInt(liczba) + Integer.parseInt(liczba2));

        request.setAttribute("wynik", wynik);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Kalkulator.jsp");
        dispatcher.forward(request, response);
    }
}
