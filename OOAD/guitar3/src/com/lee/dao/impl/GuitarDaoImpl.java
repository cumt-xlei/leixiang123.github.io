package com.lee.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.lee.dao.DataAccess;
import com.lee.dao.GuitarDao;
import com.lee.domain.Builder;
import com.lee.domain.Guitar;
import com.lee.domain.GuitarSpec;
import com.lee.domain.Model;
import com.lee.domain.Type;
import com.lee.domain.Wood;
import com.lee.util.DataAccessUtil;

public class GuitarDaoImpl implements GuitarDao {
	
	public DataAccess dataAccess = DataAccessFactory.creatDateAcess();

	@Override
	public void addInventory(Guitar guitar) {
		// TODO Auto-generated method stub
		String inventorySql = "insert into inventory(serial_number,price,spec_id) values(?,?,?)";
		
		DataAccessUtil.update(inventorySql, new Object[]{guitar.getSerialNumber(),guitar.getPrice(),guitar.getGuitarSpec().getId()});
	}

	@Override
	public void deleteInventory(int id) {
		// TODO Auto-generated method stub
		String inventorySql = "delete inventory where id = ?";
		DataAccessUtil.update(inventorySql, new Object[]{id});
	}

	@Override
	public List<Guitar> getGuitarList() {
		// TODO Auto-generated method stub
		String sql = "select * from inventory inner join spec on inventory.spec_id = spec.id";
		ResultSet rs = null;
		List<Guitar> list = new LinkedList<>();
		try {
			rs = DataAccessUtil.getResult(sql, new Object[]{});
			while(rs.next()){
				Builder builder = Builder.valueOf(rs.getString("builder"));
				Type type = Type.valueOf(rs.getString("type"));
				Wood backWood = Wood.valueOf(rs.getString("back_wood"));
				Wood topWood = Wood.valueOf(rs.getString("top_wood"));
				Model model = Model.valueFrom(rs.getString("model"));
				//创建guitarSpec对象
				GuitarSpec spec = new GuitarSpec.Creater()
										.builder(builder)
										.type(type)
										.backWood(backWood)
										.topWood(topWood)
										.model(model)
										.creat();
				
				String serialNumber = rs.getString("serial_number");
				double price = rs.getDouble("price");
				//创建guitar对象
				Guitar guitar1 = new Guitar(serialNumber, price, spec);
				
				//存入库存集合
				list.add(guitar1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int getSpecId(GuitarSpec spec) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		int id = -1;
		try {
			String sql = "select * from spec where builder = ? and model = ? and type = ? and back_wood = ? and top_wood = ?";
			rs = DataAccessUtil.getResult(sql, new Object[]{spec.getBuilder().name(),spec.getModel().name(),spec.getType().name(),
					spec.getBackWood().name(),spec.getTopWood().name()});
			while(rs.next()){
				id = rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}

}
