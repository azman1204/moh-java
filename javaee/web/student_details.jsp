<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.StudentModel" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        StudentModel stud = (StudentModel) request.getAttribute("stud");
        out.print(stud.name);
        out.print("<br>");
        out.print(stud.id);
        %>
        <h1>Student Details</h1>

        <br>
        ID : ${stud.name}
    </body>
</html>
