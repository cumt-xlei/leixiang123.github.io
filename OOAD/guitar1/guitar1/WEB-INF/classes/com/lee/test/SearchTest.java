package com.lee.test;

import com.lee.Service.SearchService;
import net.sf.json.JSONArray;

public class SearchTest{
	public static void main(String[] args) {
		String sql = "select * from guitar";
		
		SearchService service = new SearchService();
		JSONArray array = service.getResult(sql);
		System.out.println(array.toString());
		
	}

}
