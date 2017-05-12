package com.lee.domain;

public enum Type {
	
	Acoustic,Electric;
	
	public static Type valueFrom(String type){
		switch (type) {
		case "Acoustic":
			return Acoustic;
		case "Electric":
			return Electric;
		default:
			return null;
		}
	}
	@Override
	public String toString(){
		switch (this) {
		case Acoustic:
			return "木吉他";
		case Electric:	
			return "电吉他";
		default:
			return "unspecified";
		}
	}
	

}
