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
public class GetRecordsPerGenderServlet extends HttpServlet {
    @EJB StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Character gen = request.getParameter("gender").charAt(0);
        List<Student> studs = sfl.getAllPerGender(gen);
        
        request.setAttribute("studs", studs);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_records_per_gender_outcome.jsp");
        disp.forward(request, response);
    }
}