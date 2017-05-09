package com.lee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lee.Service.SearchService;

import net.sf.json.JSONArray;

public class SearchServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		//获取查询参数
		String model = (String) req.getParameter("model");
		String type = (String) req.getParameter("type");
		String backWood = (String) req.getParameter("backWood");
		String topWood = (String) req.getParameter("topWood");
		
		//判断是不是第一个查询参数
		boolean first = true;
		
		String sql = "select * from guitar ";
		if(!model.equals("")){
			String add = "where model="+"'"+model+"'";
			sql = sql + add;
			first = false;
		}
		if(!type.equals("")){
			String add = null;
			if(first){
				add = "where type="+"'"+type+"'";
			}else{				
				add = " and type="+"'"+type+"'";
			}
			sql = sql +add;
			first = false;
		}
		if(!backWood.equals("")){
			String add = null;
			if(first){
				add = "where back_Wood="+"'"+backWood+"'";
			}else{				
				add = " and back_Wood="+"'"+backWood+"'";
			}
			sql = sql +add;
			first = false;
		}
		if(!topWood.equals("")){
			String add = null;
			if(first){
				add = "where top_wood="+"'"+topWood+"'";
			}else{
				add = " and top_wood="+"'"+topWood+"'";
			}
			sql = sql + add;
		}

		SearchService searchService = new SearchService();
		JSONArray array = searchService.getResult(sql);
		
		resp.setHeader("Cache-Control", "no-cache");
		resp.setContentType("text/json;charset=UTF-8");
		resp.getWriter().print(array.toString());
		resp.getWriter().flush();
		resp.getWriter().close();			
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
