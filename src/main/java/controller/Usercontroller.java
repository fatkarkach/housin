package controller;

import dao.UserDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Users;

import java.io.IOException;

@WebServlet(name = "Usercontroller", value = "/Usercontroller")
public class Usercontroller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstname=request.getParameter("first_name");
        String last_name=request.getParameter("last_name");
        String user_name=request.getParameter("user_name");
        String password=request.getParameter("password");
        String ville=request.getParameter("ville");
        String centre=request.getParameter("centre");
        Users users= new Users(firstname,last_name,user_name,password,ville,centre);
        users.setUserName(user_name);
        users.setLastName(last_name);
        users.setUserName(user_name);
        users.setPassword(password);
        users.setPassword(password);
        users.setVille(ville);
        users.setCentre(centre);
        UserDao userDao=new UserDao();
        userDao.savepro(users);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
