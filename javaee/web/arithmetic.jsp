<%-- 
    Document   : arithmetic
    Created on : Mar 6, 2019, 2:54:28 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EL</h1>
        2 + 2 = ${2 + 2}%
        <hr>
        <h1>Scriptlet</h1>
        <%
        String name = "Azman Zakaria";
        out.println(name);
        out.println(cetak(5));
        %>
        
        <%!
        public String cetak(int bil) {
            String str = "";
            for(int i=0; i<bil; i++) {
                str += i + "--";
            }
            return str;
        }  
        %>
        <hr>
        <h1>JSP Expression</h1>
        Tarikh hari ini ialah <%= new java.util.Date() %>
        <hr>
        <h1>JSP Directives</h1>
        <%@include file="form.html" %>
    </body>
</html>
