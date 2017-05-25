package com.lee.dao;

import java.util.List;

import com.lee.domain.Guitar;
import com.lee.domain.GuitarSpec;

public interface GuitarDao {
	
	public void addInventory(Guitar guitar);
	
	public void deleteInventory(int id);
	
	public List<Guitar> getGuitarList();
	
	public int getSpecId(GuitarSpec spec);

}
