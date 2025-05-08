<%-- 
    Document   : add_record
    Created on : 08 May 2025, 5:03:16 PM
    Author     : SIBUSISO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student Record Page</title>
    </head>
    <body>
        <h1>Add student record</h1>
        <p>
            Add the following student record:
        </p>
        <form action="AddRecordServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id" required=""/></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" required=""/></td>
                </tr>
                <tr>
                    <td>Birth date</td>
                    <td><input type="date" name="dob" required=""/></td>
                </tr>
                <tr>
                    <td>Age</td>
                    <td><input type="text" name="age" required=""/></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <select name= "gender">
                            <option value="F">Female</option>
                            <option value="M">Male</option>
                        </select>
                    <td>
                </tr>
                <tr>
                    <td>Mark obtained</td>
                    <td><input type="text" name="mark" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ADD"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
