package com.lee.test;

import com.lee.model.Duck;
import com.lee.model.MallardDuck;
import com.lee.model.Squeak;

public class DuckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建Duck并选择具体的子类对象
		Duck mallard = new MallardDuck();
		
		//给对象的QuackBehavior属性动态设置实现类
		mallard.setQuackBehavior(new Squeak());
		
		//调用performQuack方法
		String quack = mallard.performQuack();

		System.out.println(quack);
	}

}
