package com.lee.domain;

public enum Wood {
	Teak,Maple;
	
	public static Wood valueFrom(String wood){
		switch (wood) {
		case "Teak":
			return Teak;
		case "Maple":
			return Maple;
		default:
			return null;
		}
	}
	
	@Override
	public String toString(){
		switch (this) {
		case Teak:
			return "柚木";
		case Maple:
			return "枫木";
		default:
			return "unspecified";
		}
	}
}
