package com.lee.domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitars;
	
	public List<Guitar> search(GuitarSpec searchSpec){
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

	public void setGuitars(List<Guitar> guitars) {
		this.guitars = guitars;
	}
	

}
