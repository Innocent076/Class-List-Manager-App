<%-- 
    Document   : get_records_per_gender_outcome
    Created on : 08 May 2025, 11:49:43 PM
    Author     : SIBUSISO
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entity.Student"%>
<%@page import="za.ac.tut.model.entity.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Records Per Gender Outcome Page</title>
    </head>
    <body>
        <h1>Get records per gender out come</h1>
        <%
            List<Student> studs = (List<Student>)request.getAttribute("studs");
        %>
        <p>
            These are the records of the gender that you want
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
                        Student std = studs.get(i);
                        Long id = std.getId();
                        String name = std.getName();
                        Integer age = std.getAge();
                        Character gen = std.getGender();
                        Integer mark = std.getMarkObtained();
                        Date crtDate = std.getCreationDate();
                        Date dob = std.getDob();
                        
                        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
                        String fDob = format.format(dob);
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
            <%}%>
        </table>
             <ul>
                <li><a href="index.html">Main page</a></li>
                <li><a href="lecturer_menu.jsp">Menu page</a></li>
            </ul>
    </body>
</html>
