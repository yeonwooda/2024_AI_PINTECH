package org.koreait.board.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/board/view")
public class BoardViewController extends HttpServlet {
  /*  @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      RequestDispatcher rd = req.getRequestDispatcher("/board/view.jsp");
      rd.forward(req.resp);
    }*/


    /* @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html; charset=UTF-8");
        RequestDispatcher rd = req.getRequestDispatcher("/outlines/header.jsp");
        rd.include(req.resp);



        PrintWriter out = resp.getWriter();
        out.write("<main><h1>메인영역...</h1></main>1");

        RequestDispatcher rd2 = req.getRequestDispatcher("/outlinces/footer.jsp");
        rd2.include(req.resp);
    }*/
}
