/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.StudentFacadeLocal;

/**
 *
 * @author SIBUSISO
 */
public class GetTestStatsServlet extends HttpServlet {
    @EJB StudentFacadeLocal sfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Long cnt = sfl.getStudentsCount();
       Long totPassed = sfl.getTotalPassed();
       Long totFailed = sfl.getTotalFailed();
       Integer minMark = sfl.getMinimumMark();
       Integer maxMark = sfl.getMaximumMArk();
       Double avgMark = sfl.getAverageMark();
       
       request.setAttribute("cnt", cnt);
       request.setAttribute("totPassed", totPassed);
       request.setAttribute("totFailed", totFailed);
       request.setAttribute("minMark", minMark);
       request.setAttribute("maxMark", maxMark);
       request.setAttribute("avgMark", avgMark);
       
        RequestDispatcher disp = request.getRequestDispatcher("get_test_stats_outcome.jsp");
        disp.forward(request, response);
    }

}
