package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GetAllPicturesServlet extends HttpServlet{
	
	//Hardcoded list of Picture ids
	List<Integer> pictures = new ArrayList<>();
	private static ObjectMapper om = new ObjectMapper();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		pictures.add(1);
		pictures.add(10);
		pictures.add(22);
		pictures.add(55);
		PrintWriter pw = resp.getWriter();
		pw.println(om.writeValueAsString(pictures));
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
