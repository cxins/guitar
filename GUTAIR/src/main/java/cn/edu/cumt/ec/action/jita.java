package cn.edu.cumt.ec.action;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.entity.guitar1;
import cn.edu.cumt.ec.service.guitarservice;

public class jita extends ActionSupport {
	  private String serialNumber, builder, model, type, backWood, topWood;
	  private double price;
	 
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBackWood() {
		return backWood;
	}
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	public String getTopWood() {
		return topWood;
	}
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	public String CHAXUN() throws Exception{
		guitarservice a=new guitarservice();
		List<guitar1> list =a.getAll(price,serialNumber, builder, model, type, backWood, topWood);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("GuitarList", list);
		//ActionContext.getContext().getSession().put("GuitarList", list);
		return SUCCESS;
		
	}
}