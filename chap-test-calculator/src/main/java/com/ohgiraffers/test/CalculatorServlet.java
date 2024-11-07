package com.ohgiraffers.test;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/calculator")
public class CalculatorServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        double number1 = Double.parseDouble(request.getParameter("number1"));
        double number2 = Double.parseDouble(request.getParameter("number2"));
        String sign = request.getParameter("sign");
        double value = 0;

        switch (sign){
            case "add" :
                value = number1 + number2;
                break;
            case "minus" :
                value = number1 - number2;
                break;
            case "multiplication" :
                value = number1 * number2;
            break;
            case "division" :
                value = number1 / number2;
        }

        System.out.println("결과 : " + value);



        HttpSession session = request.getSession();
        session.setAttribute("result", value);

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();


        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>계산 결과</title></head>");
        out.println("<body>");
        out.println("<h1>계산 결과: " + session.getAttribute("result") + "</h1>");
        out.println("<a href='index.jsp'>다시 계산하기</a>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();


    }


}