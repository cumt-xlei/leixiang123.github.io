package com.lee.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.lee.dao.DataAccess;
import com.lee.dao.impl.DataAccessFactory;

public class DataAccessUtil<T> {
	private static DataAccess dataAccess = null;
	
	private static Connection conn = null ;
	
	private static PreparedStatement ptmt = null;
	private static ResultSet rs = null;
	
	public static void update(String sql,Object[] args){
		
		try {	
			dataAccess = DataAccessFactory.creatDateAcess();
			conn = dataAccess.getConnection();
			ptmt = conn.prepareStatement(sql);
			
			for(int i = 0;i<args.length;i++){
				ptmt.setObject(i+1, args[i]);				
			}
			ptmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ResultSet getResult(String sql,Object[] args){
		
		try {
			dataAccess = DataAccessFactory.creatDateAcess();
			conn = dataAccess.getConnection();
			ptmt = conn.prepareStatement(sql);
			
			for(int i = 0;i<args.length;i++){
				ptmt.setObject(i+1, args[i]);				
			}
			
			rs = ptmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	

}
