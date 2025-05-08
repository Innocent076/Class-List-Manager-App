<%-- 
    Document   : get_records_over_range
    Created on : 09 May 2025, 1:07:55 AM
    Author     : SIBUSISO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Records Over Range Page</title>
    </head>
    <body>
        <h1>Get records over range</h1>
        <p>
            Enter the details below..
        </p>
        <form action="GetRecordsOverRangeServlet.do" method="POST">
            <table>
                <tr>
                    <td>Lower bound</td>
                    <td><input type="text" name="min" required=""/></td>
                </tr>
                <tr>
                    <td>Upper bound</td>
                    <td><input type="text" name="max" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET RECORDS"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
