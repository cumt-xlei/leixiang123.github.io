package com.lee.model;

public abstract class Duck {
	public QuackBehavior quackBehavior;
	public FlyBehavior flyBehavior;
	
	public abstract void swim();
	public abstract void display();
	
	public String performQuack(){
		return quackBehavior.quack();
	}
	
	public String performFly(){
		return flyBehavior.fly();
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	
	
}
