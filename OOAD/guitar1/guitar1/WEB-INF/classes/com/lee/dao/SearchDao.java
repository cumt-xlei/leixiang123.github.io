package com.lee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class SearchDao {
	
	public JSONArray getResult(String sql){
		
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		JSONArray array = new JSONArray();

		try {		
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				JSONObject obj = new JSONObject();
				obj.put("model", rs.getString("model"));
				obj.put("type", rs.getString("type"));
				obj.put("backWood", rs.getString("back_wood"));
				obj.put("topWood", rs.getString("top_wood"));
				array.add(obj);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}
	
	private Connection getConnection(){
		Connection conn = null;
		
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite::resource:guitar1.db");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;	
	}

}
