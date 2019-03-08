<%@page import="models.ProjectModel"%>
<%@include file="../include/header.jsp" %>
<%
ProjectModel pro = (ProjectModel) request.getAttribute("project");
%>
<legend>Daftar Projek</legend>
<form method="post" action="/pms/project">
    <div class="row">
        <div class="col-md-1">Tajuk</div>
        <div class="col-md-4"><input value="<%= pro.getTitle() %>" class="form-control" type="text" name="title"></div>
    </div>
    <div class="row">
        <div class="col-md-1">Keterangan</div>
        <div class="col-md-4"><textarea class="form-control" name="description"><%= pro.getDescription() %></textarea></div>
    </div>
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-4"><input class="btn btn-primary" type="submit" value="Simpan"></div>
    </div>
</form>


<%@include file="../include/footer.jsp" %>