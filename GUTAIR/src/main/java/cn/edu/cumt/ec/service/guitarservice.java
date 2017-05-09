package cn.edu.cumt.ec.service;

import java.util.List;

import cn.edu.cumt.ec.dao.guitardao;
import cn.edu.cumt.ec.dao.guitardaojdbc;
import cn.edu.cumt.ec.entity.guitar1;

public class guitarservice {

	private static guitardaojdbc guitardao=new guitardaojdbc();
	public boolean add(guitar1 guitar1){
	    return	guitardao.add(guitar1);		
	}
	
	public static guitardaojdbc getGuitarDao() {
		return guitardao;
	}

	public static void setGuitarDao(guitardaojdbc guitarDao) {
		guitarservice.guitardao = guitardao;
	}

	public List<guitar1> getAll(double price, String serialNumber, String builder, String model, String type,
			String backWood, String topWood) {
		// TODO Auto-generated method stub
		return guitardao.getAll(price,serialNumber, builder, model, type, backWood, topWood);
	}	

}