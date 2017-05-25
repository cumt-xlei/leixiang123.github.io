package com.lee.domain;

public enum Builder {
	
	BuilderOne,BuilderTwo;
	
	public static Builder valueFrom(String builder){
		switch (builder) {
		case "BuilderOne":
			return BuilderOne;

		case "BuilderTwo":
			return BuilderTwo;
		default:
			return null;
		}
	}
	
	@Override
	public String toString(){
		switch (this) {
		case BuilderOne:
			return "厂家1";
		case BuilderTwo:
			return "厂家2";
		default:
			return "unspecified";
		}
	}

}
