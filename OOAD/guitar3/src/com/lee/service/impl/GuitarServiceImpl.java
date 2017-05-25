package com.lee.service.impl;

import java.util.List;

import com.lee.dao.GuitarDao;
import com.lee.dao.impl.GuitarDaoImpl;
import com.lee.domain.Guitar;
import com.lee.domain.GuitarSpec;
import com.lee.domain.Inventory;
import com.lee.service.GuitarService;

public class GuitarServiceImpl implements GuitarService {
	private GuitarDao guitarDao = new GuitarDaoImpl();

	@Override
	public void addInventory(Guitar guitar) {
		// TODO Auto-generated method stub
		guitarDao.addInventory(guitar);
		
	}

	@Override
	public void deleteInventory(int id) {
		// TODO Auto-generated method stub
		guitarDao.deleteInventory(id);
	}

	@Override
	public List<Guitar> getSearchGuitarList(GuitarSpec spec) {
		// TODO Auto-generated method stub
		List<Guitar> list = guitarDao.getGuitarList();
		Inventory inventory = new Inventory();
		inventory.setGuitars(list);
		List<Guitar> result = inventory.search(spec);
		return result;
	}

	@Override
	public int getSpecId(GuitarSpec spec) {
		// TODO Auto-generated method stub
		return guitarDao.getSpecId(spec);
	}

}
