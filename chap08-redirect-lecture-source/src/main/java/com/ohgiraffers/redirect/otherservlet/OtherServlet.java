package com.ohgiraffers.redirect.otherservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/otherservlet")
public class OtherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("GET 요청 정상 수락");

        //비즈니즈 로직 수행 구역

        Logic logic = new Logic();
        logic.registDate();

        //  sendRedirect()는 HTTP 응답을 통해 클라이언트(브라우저)에 새로운 URL 로 이동하도록 요청합니다.
        //브라우저는 서버로부터 이 리다이렉트 명령을 받으면 즉시 지정된 URL 로 이동하여 새로운 요청을 보냅니다.
        // ? = 쿼리의 시작을 알림
        // & = 여러 파라미터를 나열 할때 사용
        resp.sendRedirect("redirect?name=cho&age=20");

    }
}
