package cn.edu.cumt.ec.dao;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.guitar1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class guitardaojdbc implements guitardao{
	@Override
	public boolean add(guitar1 guitar1) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into guitar values(?,?,?,?,?,?,?)", new Object[]{guitar1.getSerialNumber(),guitar1.getPrice(),guitar1.getBuilder(),guitar1.getModel(),guitar1.getType(),guitar1.getBackWood(),guitar1.getTopWood()});		
	}
	@Override
	public List<guitar1> getAll(double price, String serialNumber, String builder, String model, String type,
			String backWood, String topWood) {
		// TODO Auto-generated method stub
		String stmtsql= "select * from guitar where 1 = 1 ";
		if(type.length() > 0){
			stmtsql+=String.format("and type='"+type+"'");
		}
		if(backWood.length() > 0){
			stmtsql+=String.format("and backWood='"+backWood+"'");
		}
		if(model.length() > 0){
			stmtsql+=String.format("and model='"+model+"'");
		}
		if(price!=0){
			stmtsql+=String.format("and price='"+price+"'");
	   }
		if(serialNumber.length() > 0){
			stmtsql+=String.format("and serialNumber='"+serialNumber+"'");
	   }	
		if(topWood.length() > 0){
			stmtsql+=String.format("and topWood='"+topWood+"'");
       }	
	    if(type.length() > 0){
	    	stmtsql+=String.format("and type='"+type+"'");
       }
		List<guitar1> guitarList=new ArrayList<guitar1>();
		guitar1 guitar1=null;
		try{
			ResultSet rs= DbUtil.executeQuery(stmtsql, new Object[]{});
			while(rs.next()){
				guitar1=new guitar1();
				guitar1.setSerialNumber(rs.getString(1));
				guitar1.setPrice(rs.getDouble(2));
				guitar1.setBuilder(rs.getString(3));
				guitar1.setModel(rs.getString(4));
				guitar1.setType(rs.getString(5));
				guitar1.setBackWood(rs.getString(6));
				guitar1.setTopWood(rs.getString(7));
				guitarList.add(guitar1);
			}					
		}catch(SQLException e){
			e.printStackTrace();
		}
		return guitarList;
}
}