<%-- 
    Document   : get_test_stats_outcome
    Created on : 08 May 2025, 11:29:14 PM
    Author     : SIBUSISO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Test Stats Outcome Page</title>
    </head>
    <body>
        <h1>Get test stats outcome</h1>
        <%
            Long cnt = (Long) request.getAttribute("cnt");
           Long totPassed = (Long) request.getAttribute("totPassed");
           Long totFailed = (Long) request.getAttribute("totFailed");
           Integer minMark = (Integer) request.getAttribute("minMark");
           Integer maxMark = (Integer) request.getAttribute("maxMark");
           Double avgMark = (Double) request.getAttribute("avgMark");
        %>
        <p>
            Below are the stats:
        </p>
        <table border = "1">
            <tr>
                <td>Total number of students</td>
                <td><%=cnt%></td>
            </tr>
            <tr>
                <td>Total number of students who passed</td>
                <td><%=totPassed%></td>
            </tr>
            <tr>
                <td>Total number of students who failed</td>
                <td><%=totFailed%></td>
            </tr>
            <tr>
                <td>Minimum mark</td>
                <td><%=minMark%></td>
            </tr>
            <tr>
                <td>Maximum mark</td>
                <td><%=maxMark%></td>
            </tr>
            <tr>
                <td>Average mark</td>
                <td><%=avgMark%></td>
            </tr>
        </table>
            <ul>
                <li><a href="index.html">Main page</a></li>
                <li><a href="lecturer_menu.jsp">Menu page</a></li>
            </ul>
    </body>
</html>
