package com.courier_system.bean;

public class Product_info {
	
	private int  cid;
	private String  category;
	private String delivery_opt;
	 private String time_slot;
	 private int weight;
	 
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDelivery_opt() {
		return delivery_opt;
	}
	public void setDelivery_opt(String delivery_opt) {
		this.delivery_opt = delivery_opt;
	}
	public String getTime_slot() {
		return time_slot;
	}
	public void setTime_slot(String time_slot) {
		this.time_slot = time_slot;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	 
}
