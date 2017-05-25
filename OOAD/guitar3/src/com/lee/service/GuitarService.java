package com.lee.service;

import java.util.List;

import com.lee.domain.Guitar;
import com.lee.domain.GuitarSpec;

public interface GuitarService {
	
	public void addInventory(Guitar guitar);
	
	public void deleteInventory(int id);
	
	public List<Guitar> getSearchGuitarList(GuitarSpec spec);
	
	public int getSpecId(GuitarSpec spec);

}
