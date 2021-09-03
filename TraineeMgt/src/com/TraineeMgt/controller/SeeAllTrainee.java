package com.TraineeMgt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TraineeMgt.model.Trainee;
import com.TraineeMgt.service.TraineeService;
import com.TraineeMgt.service.TraineeServiceImpl;

/**
 * Servlet implementation class SeeAllTrainee
 */
@WebServlet("/SeeAllTrainee.do")
public class SeeAllTrainee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		TraineeService traineeService=new TraineeServiceImpl();
		List<Trainee> allTrainees=traineeService.getAllTrainees();
		
		for(Trainee trainee:allTrainees) {
			out.write(trainee+"<br>");
		}
	}

}
