package com.shippingservice.component.entities;

public class Order {

	private Integer code;
	private Double basic;
	private Double discount;
	
	public Order(Integer code, Double basic, Double discount) {
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Double getBasic() {
		return basic;
	}
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Order [code=" + code + ", basic=" + basic + ", discount=" + discount + "]";
	}
	
	
}
