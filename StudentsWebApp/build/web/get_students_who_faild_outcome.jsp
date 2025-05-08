<%-- 
    Document   : get_students_who_faild_outcome
    Created on : 09 May 2025, 1:00:36 AM
    Author     : SIBUSISO
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entity.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Students Who Faild Outcome Page</title>
    </head>
    <body>
        <h1>Get students who faild outcome</h1>
        <%
            List<Student> stud = (List<Student>)request.getAttribute("stud");
            Integer cnt = stud.size();
        %>
        
        <%
                if(cnt > 0){
                 %>   
                <p>
                            There are <%=cnt%> students that failed...below is the list
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
                    for(int i = 0; i < stud.size();i++){
                        Student std = stud.get(i);
                        Long id = std.getId();
                        String name = std.getName();
                        Integer age = std.getAge();
                        Character gen = std.getGender();
                        Integer mark = std.getMarkObtained();
                        Date crtDate = std.getCreationDate();
                        Date dob = std.getDob();
                        
                        SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd");
                        String fDob = f.format(dob);
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
        <%}else{
                %>
                <p>
                    The are no students that failed the test...
                </p>
        <%
            }
        %>
             <ul>
                <li><a href="index.html">Main page</a></li>
                <li><a href="lecturer_menu.jsp">Menu page</a></li>
            </ul>
    </body>
</html>
