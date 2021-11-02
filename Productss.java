package com.abc.hiberapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productss 
{
	@Id
   private int id;
   private String name;
   private int price;
   private String brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Productss [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
	   
}
