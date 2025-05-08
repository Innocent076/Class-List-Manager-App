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
public class GetRecordsOverRangeServlet extends HttpServlet {
    @EJB StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer min = (Integer.parseInt(request.getParameter("min")));
        Integer max = Integer.parseInt(request.getParameter("max"));
        
        List<Student> stud = sfl.getStudentsOverMarkRange(min, max);
        
        request.setAttribute("stud", stud);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_records_over_range_outcom.jsp");
        disp.forward(request, response);
    }
}
