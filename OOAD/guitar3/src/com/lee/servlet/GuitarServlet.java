package com.lee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

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
import com.lee.service.GuitarService;
import com.lee.service.impl.GuitarServiceImpl;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class GuitarServlet extends HttpServlet {
	
	private GuitarService guitarService = new GuitarServiceImpl();
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//获取请求名
		String path = arg0.getServletPath();
		int begin = path.indexOf("/");
		int end = path.indexOf(".");
		String methodName = null;
		if(end != -1){			
			methodName = path.substring(begin+1, end);
		}else{
			methodName = path.substring(begin);
		}
		
		//利用反射调用请求名对应的方法
		try {
			//获取方法
			Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			//执行方法
			method.invoke(this, arg0,arg1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("没有对应的方法");
		} 
		
	}
	
	public void addInventory(HttpServletRequest req, HttpServletResponse resp){
		String builder = (String) req.getParameter("builder");
		String model = (String) req.getParameter("model");
		String type = (String) req.getParameter("type");
		String backWood = (String) req.getParameter("backWood");
		String topWood = (String) req.getParameter("topWood");
		String price = req.getParameter("price");
		
		//转换为枚举
		Builder builder1 = Builder.valueFrom(builder);
		Model model1 = Model.valueFrom(model);
		Type type1 =Type.valueFrom(type);
		Wood backWood1 = Wood.valueFrom(backWood);
		Wood topWood1 = Wood.valueFrom(topWood);

		//构造guitarSpec
		GuitarSpec spec = new GuitarSpec.Creater()
							.builder(builder1)
							.type(type1)
							.backWood(backWood1)
							.topWood(topWood1)
							.model(model1)
							.creat();
		
		
		spec.setId(guitarService.getSpecId(spec));
		
		Guitar guitar = new Guitar(UUID.randomUUID().toString(), Double.parseDouble(price), spec);
		guitarService.addInventory(guitar);
		
		
	}
	
	public void getInventory(HttpServletRequest req, HttpServletResponse resp) throws IOException{
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
							.builder(builder1)
							.type(type1)
							.backWood(backWood1)
							.topWood(topWood1)
							.model(model1)
							.creat();
		
		Inventory inventory = new Inventory();
		//首先重数据库中查询出全部库存
		List<Guitar> list = guitarService.getSearchGuitarList(spec);
		
		//转换为json传到前台
		JSONArray array = new JSONArray();
		for (Guitar guitar : list) {
			JSONObject obj = new JSONObject();
			obj.put("serialNumber", guitar.getSerialNumber());
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
	}


}
