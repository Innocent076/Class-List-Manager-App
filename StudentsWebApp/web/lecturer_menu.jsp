<%-- 
    Document   : lecturer_menu
    Created on : 09 May 2025, 1:37:14 AM
    Author     : SIBUSISO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lecture Menu Page</title>
    </head>
    <body>
        <h1>Lecturer menu</h1>
        <p>
            Please select one of the following options:
        </p>
        <ul>
        <li><a href="GetTestStatsServlet.do">Get test statistics</a></li>
            <li><a href="get_records_per_gender.html">Get all records per gender</a></li>
            <li><a href="GetStudentsWhoPassedServlet.do">Get all students who passed</a></li>
            <li><a href="GetStudentsWhoFailedServlet.do">Get all students who failed</a></li>
            <li><a href="get_records_over_range.jsp">Get the details of students over a mark range</a></li>
          
            <li><a href="index.html">Main page</a></li>
                
             
        </ul>
    </body>
</html>
