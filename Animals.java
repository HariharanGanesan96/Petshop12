package Class;

import java.util.Date;

public class Animals {

	private int animalId;
	private String type;
	private String name;
	private String gender;
	private String dob;
	private String dsc;
	private String color;
	private int price;
	private String status;
	private int cusId;
	private Date regDate;

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDsc() {
		return dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Animals() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animals(int animalId) {
		super();
		this.animalId = animalId;
	}

	public Animals(int animalId, String status) {
		super();
		this.animalId = animalId;
		this.status = status;
	}

	public Animals(int animalId, String type, String name, String gender, String dob, String dsc, String color,
			int price, String status, int cusId) {
		super();
		this.animalId = animalId;
		this.type = type;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.dsc = dsc;
		this.color = color;
		this.price = price;
		this.status = status;
		this.cusId = cusId;
	}
	public Animals(int animalId, String type, String name, String gender, String dob, String dsc, String color,
			int price, int cusId) {
		super();
		this.animalId = animalId;
		this.type = type;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.dsc = dsc;
		this.color = color;
		this.price = price;
		this.cusId = cusId;
	}


}
