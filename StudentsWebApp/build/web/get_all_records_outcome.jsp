<%-- 
    Document   : get_all_records_outcome
    Created on : 08 May 2025, 5:37:17 PM
    Author     : SIBUSISO
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="za.ac.tut.model.entity.Student"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get All Record Outcome Page</title>
    </head>
    <body>
        <h1>Get all records outcome</h1>
        <%
                List<Student> studs = (List<Student>)request.getAttribute("studs");
        %>
        <p>
            Below are the all students:
        </p>
        <table border = "1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Birth date</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Mark obtained</th>
                <th>Create date</th>
             </tr>
                <%
                        for(int i = 0; i < studs.size();i++){
                            Student stud = studs.get(i);
                            Long id = stud.getId();
                            String name = stud.getName();
                            Date dob = stud.getDob();
                            SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
                            String fDob = format.format(dob);
                            
                            Integer age = stud.getAge();
                            Character gen = stud.getGender();
                            Integer mark = stud.getMarkObtained();
                            Date crtDate = stud.getCreationDate();
               %>
            <tr>
                <td><%=id%></td>
                <td><%=name%></td>
                <td><%=fDob%></td>
                <td><%=age%></td>
                <td><%=gen%></td>
                <td><%=mark%></td>
                <td><%=crtDate%></td>
            </tr>
                <%}
                %>
            </tr>
        </table>
            <ul>
                <li><a href="index.html">Main page</a></li>
                <li><a href="tutor_menu.jsp">Menu page</a></li>
            </ul>
    </body>
</html>

