/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class AddRecordServlet extends HttpServlet {
    @EJB StudentFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Long id = Long.parseLong(request.getParameter("id"));
            String name = request.getParameter("name");
            Character gender = request.getParameter("gender").charAt(0);
            Integer age = Integer.parseInt(request.getParameter("age"));
            Integer mark = Integer.parseInt(request.getParameter("mark"));
            String dobStr = request.getParameter("dob");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            Date dob = sdf.parse(dobStr);
            
            //create student
            Student stud = createStudent(id, name, dob, age, gender, mark);
            sfl.create(stud);
            
            RequestDispatcher disp = request.getRequestDispatcher("add_record_outcome.jsp");
            disp.forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(AddRecordServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    private Student createStudent(Long id,String name,Date dob,Integer age,Character gender,Integer mark){
        Student stud = new Student();
        stud.setId(id);
        stud.setName(name);
        stud.setDob(dob);
        stud.setAge(age);
        stud.setGender(gender);
        stud.setMarkObtained(mark);
        stud.setCreationDate(new Date());
        
        return stud;
    }
}
