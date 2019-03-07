package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ProjectModel;

@WebServlet(name = "Project", urlPatterns = {"/project"})
public class Project extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //ArrayList list = new models.ProjectModel().getAll();
        ArrayList list = new ProjectModel().getAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("project/list.jsp").forward(request, response);
    }

}
