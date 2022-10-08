package com.xworkz.musicAndFood.dto;

import java.io.Serializable;

public class FoodDto implements Serializable{

	private String itemName;
	private String price;
	private String hotalName;
	private String hotalType;
	private String hotalLocation;
	private String orderd;
	private String quantity;
	
	public FoodDto() {
		System.out.println("FoodDto constructor started");
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getHotalName() {
		return hotalName;
	}

	public void setHotalName(String hotalName) {
		this.hotalName = hotalName;
	}

	public String getHotalType() {
		return hotalType;
	}

	public void setHotalType(String hotalType) {
		this.hotalType = hotalType;
	}

	public String getHotalLocation() {
		return hotalLocation;
	}

	public void setHotalLocation(String hotalLocation) {
		this.hotalLocation = hotalLocation;
	}

	public String getOrderd() {
		return orderd;
	}

	public void setOrderd(String orderd) {
		this.orderd = orderd;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "FoodDto [itemName=" + itemName + ", price=" + price + ", hotalName=" + hotalName + ", hotalType="
				+ hotalType + ", hotalLocation=" + hotalLocation + ", orderd=" + orderd + ", quantity=" + quantity
				+ "]";
	}
	
	
}
