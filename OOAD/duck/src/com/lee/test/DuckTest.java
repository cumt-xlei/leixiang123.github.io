package com.lee.test;

import com.lee.model.Duck;
import com.lee.model.MallardDuck;
import com.lee.model.Squeak;

public class DuckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.setQuackBehavior(new Squeak());
		String quack = mallard.performQuack();
		System.out.println(quack);
	}

}
