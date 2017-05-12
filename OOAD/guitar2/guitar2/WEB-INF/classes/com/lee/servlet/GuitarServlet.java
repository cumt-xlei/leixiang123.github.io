package com.lee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lee.domain.Builder;
import com.lee.domain.Guitar;
import com.lee.domain.GuitarSpec;
import com.lee.domain.Inventory;
import com.lee.domain.Model;
import com.lee.domain.Type;
import com.lee.domain.Wood;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class GuitarServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);

		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String builder = (String) req.getParameter("builder");
		String model = (String) req.getParameter("model");
		String type = (String) req.getParameter("type");
		String backWood = (String) req.getParameter("backWood");
		String topWood = (String) req.getParameter("topWood");
		
		//转换为枚举
		Builder builder1 = Builder.valueFrom(builder);
		Model model1 = Model.valueFrom(model);
		Type type1 =Type.valueFrom(type);
		Wood backWood1 = Wood.valueFrom(backWood);
		Wood topWood1 = Wood.valueFrom(topWood);

		//构造guitarSpec
		GuitarSpec spec = new GuitarSpec.Creater()
							.builder(builder1).type(type1)
							.backWood(backWood1)
							.topWood(topWood1)
							.model(model1)
							.creat();
		
		Inventory inventory = new Inventory();
		//首先重数据库中查询出全部库存
		List<Guitar> list = inventory.search(spec);
		
		//转换为json传到前台
		JSONArray array = new JSONArray();
		for (Guitar guitar : list) {
			JSONObject obj = new JSONObject();
			obj.put("price", guitar.getPrice());
			obj.put("model", guitar.getGuitarSpec().getModel().toString());
			obj.put("builder", guitar.getGuitarSpec().getBuilder().toString());
			obj.put("type", guitar.getGuitarSpec().getType().toString());
			obj.put("topWood", guitar.getGuitarSpec().getTopWood().toString());
			obj.put("backWood", guitar.getGuitarSpec().getBackWood().toString());
			array.add(obj);
		}
		resp.setHeader("Cache-Control", "no-cache");
		resp.setContentType("text/json;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println(array.toString());
		out.flush();
		out.close();
//		
//		System.out.println(list.size());
//		System.out.println(list.toString());
	}

}
