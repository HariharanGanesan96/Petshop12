package Class;

import java.util.Date;

public class Animalorders {
	 private int orderId;
	 private int cusId;
	 private String date;
	 private long Price;
	 private String status;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getPrice() {
		return Price;
	}
	public void setPrice(long price) {
		Price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Animalorders(int orderId, int cusId, String date, long price, String status) {
		super();
		this.orderId = orderId;
		this.cusId = cusId;
		this.date = date;
		Price = price;
		this.status = status;
	}
	public Animalorders(int orderId, int cusId, String date, long price) {
		super();
		this.orderId = orderId;
		this.cusId = cusId;
		this.date = date;
		this.Price = price;
		
	}
	public Animalorders() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}
