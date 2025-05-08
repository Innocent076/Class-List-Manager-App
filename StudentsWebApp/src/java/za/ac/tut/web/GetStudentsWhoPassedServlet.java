/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.StudentFacadeLocal;
import za.ac.tut.model.entity.Student;

/**
 *
 * @author SIBUSISO
 */
public class GetStudentsWhoPassedServlet extends HttpServlet {
    @EJB StudentFacadeLocal sfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       List<Student> stud = sfl.getStudentsWhoPassed();
       
       request.setAttribute("stud", stud);
       
       RequestDispatcher disp = request.getRequestDispatcher("get_students_who_passed_outcome.jsp");
       disp.forward(request, response);
    }

}
