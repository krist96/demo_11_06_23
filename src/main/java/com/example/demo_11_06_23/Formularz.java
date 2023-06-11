package com.example.demo_11_06_23;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Formularz", value = "/Formularz")
public class Formularz extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String pobraneImie = request.getParameter("imie");
        String pobraneNazwisko = request.getParameter("nazwisko");

        Weryfikacja weryfikacja = new Weryfikacja();

        String kolorImie = "green";
        String kolorNazwisko = "green";

        if(!weryfikacja.czyImiePoprawne(pobraneImie)){
            pobraneImie = "Zła wartość Imienia! Podaj nową!";
            kolorImie = "red";
        } else if (!weryfikacja.czyNazwiskoPoprawne(pobraneNazwisko)) {
            pobraneNazwisko = "Zła wartość Nazwiska! Podaj nową!";
            kolorNazwisko = "red";
        }

        request.setAttribute("weryfikacjaImie", pobraneImie);
        request.setAttribute("kolorImie", kolorImie);
        request.setAttribute("weryfikacjaNazwisko", pobraneNazwisko);
        request.setAttribute("kolorNazwisko", kolorNazwisko);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Formularz.jsp");
        dispatcher.forward(request, response);

    }
}
