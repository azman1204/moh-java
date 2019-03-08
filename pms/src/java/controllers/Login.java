package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.UserModel;

@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String staffId = req.getParameter("staff_id");
        String pwd = req.getParameter("pwd");
        UserModel user = new UserModel();
        if (user.isExist(staffId, pwd)) {
            // user wujud, set session, then go to project list
        } else {
            // user tak wujud, go back to login
            res.sendRedirect("/pms/pub/login.jsp?no");
        }
    }
}
