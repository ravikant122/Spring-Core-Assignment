package com.TraineeMgt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TraineeMgt.model.Trainee;
import com.TraineeMgt.service.TraineeService;
import com.TraineeMgt.service.TraineeServiceImpl;

/**
 * Servlet implementation class AddTrainee
 */
@WebServlet("/AddTrainee.do")
public class AddTrainee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String trainee_name=request.getParameter("trainee_name");
		String branch=request.getParameter("branch");
		Double percentage=Double.parseDouble(request.getParameter("percentage"));
		
		Trainee trainee = new Trainee(trainee_name,branch,percentage);
    	
    	TraineeService traineeService=new TraineeServiceImpl();    	
    	traineeService.addTrainee(trainee);
    	

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		out.write("Trainee successfully added");
	}

}
