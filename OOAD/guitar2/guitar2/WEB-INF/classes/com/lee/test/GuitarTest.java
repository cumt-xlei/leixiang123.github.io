package com.lee.test;

import java.util.LinkedList;
import java.util.List;

import com.lee.domain.Builder;
import com.lee.domain.Guitar;
import com.lee.domain.GuitarSpec;
import com.lee.domain.Inventory;
import com.lee.domain.Model;
import com.lee.domain.Type;
import com.lee.domain.Wood;

public class GuitarTest {
	public static void main(String[] args) {
		
		//加载数据
		List<Guitar> list = new LinkedList<>();
		list.add(new Guitar("1", 100.00, new GuitarSpec.Creater().builder(Builder.BuilderOne).model(Model.Gibson).type(Type.Acoustic).backWood(Wood.Teak).topWood(Wood.Teak).creat()));
		list.add(new Guitar("2", 100.00, new GuitarSpec.Creater().builder(Builder.BuilderOne).model(Model.Gibson).type(Type.Acoustic).backWood(Wood.Maple).topWood(Wood.Maple).creat()));
		list.add(new Guitar("1", 100.00, new GuitarSpec.Creater().builder(Builder.BuilderOne).model(Model.Gibson).type(Type.Electric).backWood(Wood.Teak).topWood(Wood.Teak).creat()));
		list.add(new Guitar("1", 100.00, new GuitarSpec.Creater().builder(Builder.BuilderOne).model(Model.Gibson).type(Type.Electric).backWood(Wood.Maple).topWood(Wood.Maple).creat()));
		list.add(new Guitar("1", 100.00, new GuitarSpec.Creater().builder(Builder.BuilderTwo).model(Model.Fender).type(Type.Acoustic).backWood(Wood.Teak).topWood(Wood.Teak).creat()));
		list.add(new Guitar("1", 100.00, new GuitarSpec.Creater().builder(Builder.BuilderTwo).model(Model.Fender).type(Type.Electric).backWood(Wood.Maple).topWood(Wood.Maple).creat()));
		list.add(new Guitar("1", 100.00, new GuitarSpec.Creater().builder(Builder.BuilderTwo).model(Model.Fender).type(Type.Acoustic).backWood(Wood.Teak).topWood(Wood.Teak).creat()));
		list.add(new Guitar("1", 100.00, new GuitarSpec.Creater().builder(Builder.BuilderTwo).model(Model.Fender).type(Type.Electric).backWood(Wood.Maple).topWood(Wood.Maple).creat()));
		
		//查询条件		
		GuitarSpec spec = new GuitarSpec.Creater().builder(Builder.BuilderOne).type(Type.Acoustic).model(Model.Gibson).creat();
		
		Inventory inventory = new Inventory();
		inventory.setGuitars(list);
		
		List<Guitar> result = inventory.search(spec);
		System.out.print("builder---"+"model---"+"type---"+"backWood---"+"topWood---"+"price");
		System.out.println();
		for (Guitar guitar : result) {
			System.out.print(guitar.getGuitarSpec().getBuilder().toString()+"------"
					+guitar.getGuitarSpec().getModel().toString()+"------"
					+guitar.getGuitarSpec().getType().toString()+"------"
					+guitar.getGuitarSpec().getBackWood().toString()+"------"
					+guitar.getGuitarSpec().getTopWood().toString()+"------"
					+guitar.getPrice());
			System.out.println();
		}
		
		
	}
}
