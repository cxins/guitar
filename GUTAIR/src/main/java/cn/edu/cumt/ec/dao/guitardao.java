package cn.edu.cumt.ec.dao;

import java.util.List;

import cn.edu.cumt.ec.entity.guitar1;


public interface guitardao {

	public boolean add(guitar1 guitar1);
	public List<guitar1> getAll(double price, String serialNumber, String builder, String model, String type,
			String backWood, String topWood);
}
