package com.lee.dao.impl;

import com.lee.dao.DataAccess;

public class DataAccessFactory {
	
	private static String packageName = "com.lee.dao.impl";
	
//	private static final String	dataAccessName = "MysqlDataAccess";
	private static final String	dataAccessName = "SqliteDataAccess";
	
	public static DataAccess creatDateAcess(){
		String className = packageName + "."+ dataAccessName;
		DataAccess dataAccess = null;
		try {
			Class<?> clazz = Class.forName(className);
			dataAccess = (DataAccess) clazz.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("无法创建DataAccess对象");
		}
		
		return dataAccess;
		
	}

}
