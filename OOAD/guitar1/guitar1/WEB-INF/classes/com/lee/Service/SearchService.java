package com.lee.Service;

import com.lee.dao.SearchDao;

import net.sf.json.JSONArray;

public class SearchService {
	
	SearchDao searchDao = new SearchDao();
	
	public JSONArray getResult(String sql){
		return searchDao.getResult(sql);
	}

}
