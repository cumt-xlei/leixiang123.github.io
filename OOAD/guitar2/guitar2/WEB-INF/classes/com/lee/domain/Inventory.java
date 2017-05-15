package com.lee.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitars;
	
	//从库存中查询guitar
	public List<Guitar> search(GuitarSpec searchSpec){
		//全部库存
		guitars = getGuitars();
		//匹配的guitar
		List<Guitar> matchingGuitars = new LinkedList<>();
		for (Iterator iterator = guitars.iterator(); iterator.hasNext();) {
			Guitar guitar = (Guitar) iterator.next();
			if(guitar.getGuitarSpec().mactches(searchSpec)){
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}
	
	//从数据库中取出全部guitar库存
	private List<Guitar> getGuitars(){
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<Guitar> list = new LinkedList<>();
		try {		
			stmt = conn.createStatement();
			//查询数据库中guitar的库存
			rs = stmt.executeQuery("select * from inventory inner join spec on inventory.spec_id = spec.spec_id");
			while(rs.next()){
				Builder builder = Builder.valueOf(rs.getString("builder"));
				Type type = Type.valueOf(rs.getString("type"));
				Wood backWood = Wood.valueOf(rs.getString("back_wood"));
				Wood topWood = Wood.valueOf(rs.getString("top_wood"));
				Model model = Model.valueFrom(rs.getString("model"));
				//创建guitarSpec对象
				GuitarSpec spec = new GuitarSpec.Creater()
										.builder(builder)
										.type(type)
										.backWood(backWood)
										.topWood(topWood)
										.model(model)
										.creat();
				
				String serialNumber = rs.getString("serial_number");
				double price = rs.getDouble("price");
				//创建guitar对象
				Guitar guitar = new Guitar(serialNumber, price, spec);
				
				//存入库存集合
				list.add(guitar);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	private Connection getConnection(){
		Connection conn = null;
		
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite::resource:guitar2.db");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;	
	}

	public void setGuitars(List<Guitar> guitars) {
		this.guitars = guitars;
	}
	

}
