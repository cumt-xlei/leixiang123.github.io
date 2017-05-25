package com.lee.domain;

public class GuitarSpec {
	
	private int id;
	private Builder builder;
	private Model model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	

	
	//使用构建器创建对象
	
	public static class Creater{
		private Builder builder = null;
		private Model model = null;
		private Type type = null;
		private Wood backWood = null;
		private Wood topWood = null;
		
		public Creater builder(Builder val){
			builder = val;
			return this;
		}
		public Creater model(Model val){
			model = val;
			return this;
		}
		public Creater type(Type val){
			type = val;
			return this;
		}
		public Creater backWood(Wood val){
			backWood = val;
			return this;
		}
		public Creater topWood(Wood val){
			topWood = val;
			return this;
		}
		
		public GuitarSpec creat(){
			return new GuitarSpec(this);
		}
		
	}

	public GuitarSpec(Creater creater){
		builder = creater.builder;
		model = creater.model;
		type = creater.type;
		backWood = creater.backWood;
		topWood = creater.topWood;
	}
	
	public boolean mactches(GuitarSpec otherSpec){
		if(otherSpec.builder != null && builder != otherSpec.builder){
			return false;
		}
		if(otherSpec.model != null && model != otherSpec.model){
			return false;
		}
		if(otherSpec.type != null && type != otherSpec.type){
			return false;
		}
		if(otherSpec.backWood != null && backWood != otherSpec.backWood){
			return false;
		}
		if(otherSpec.topWood != null && topWood != otherSpec.topWood){
			return false;
		}
		return true;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

}
