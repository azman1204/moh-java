<%@page import="models.ProjectModel"%>
<%@page import="controllers.Project"%>
<%@page import="java.util.ArrayList"%>
<%@include file="../include/header.jsp" %>

<table class="table table-bordered">
    <tr>
        <td>Bil</td>
        <td>Tajuk</td>
        <td>Keterangan</td>
    </tr>
    <%
    ArrayList list = (ArrayList)request.getAttribute("list");
    for (int i=0; i<list.size(); i++) {
        ProjectModel pro = (ProjectModel)list.get(i);
    %>
    <tr>
        <td></td>
        <td><%= pro.getTitle() %></td>
        <td></td>
    </tr>
    <% } %>
</table>

<%@include file="../include/footer.jsp" %>