<%@page import="models.UserModel"%>
<%
if(session.getAttribute("loggedin") == null) {
    response.sendRedirect("/pms/pub/login.jsp");
    return;
}
// casting
UserModel user = (UserModel)session.getAttribute("user");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" 
              href="/pms/assets/bootstrap/css/bootstrap.css">
        <script src="/pms/assets/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="/pms/assets/jquery-ui.min.js" type="text/javascript"></script>
        <link href="/pms/assets/jquery-ui.css" rel="stylesheet" type="text/css"/>
        <title>PMS</title>
    </head>
    <body>
        <h3><%= user.getName() %></h3> (<a href="/pms/login?logout">Logout</a>)
        <hr>