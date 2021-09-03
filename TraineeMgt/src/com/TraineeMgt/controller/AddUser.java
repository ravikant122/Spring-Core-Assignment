package com.TraineeMgt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.TraineeMgt.model.User;
import com.TraineeMgt.service.UserService;
import com.TraineeMgt.service.UserServiceImpl;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String username=request.getParameter("username");
    	String password=request.getParameter("password");
    	User user=new User(username,password);
    	
    	UserService userService=new UserServiceImpl();
    	List<User> users=userService.getAllUsers();
    	
    	boolean valid=false;
    	for(User everyUser:users) {
    		if(everyUser.getUsername().equals(user.getUsername()) && everyUser.getPassword().equals(user.getPassword())) {
    			valid=true;
    			break;
    		}
    	}
    	
    	if(valid) {
    		HttpSession session=request.getSession();
    		session.setAttribute("user", user);
    	
    		response.sendRedirect("secondindex.jsp");
    	}else {
    		response.sendRedirect("login.jsp");
    	}
    }

}
