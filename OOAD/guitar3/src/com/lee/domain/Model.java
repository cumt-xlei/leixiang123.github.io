package com.lee.domain;

/**
 * @see品牌
 * @author Administrator
 *
 */
public enum Model {
	
	Gibson,Fender;
	
	public static Model valueFrom(String model){
		switch (model) {
		case "Gibson":
			return Gibson;
		case "Fender":
			return Fender;
		default:
			return null;
		}
	}
	@Override
	public String toString(){
		switch (this) {
		case Fender:
			return "芬达";
		case Gibson:
			return "吉普森";
		default:
			return "unspecified";
		}
	}

}
