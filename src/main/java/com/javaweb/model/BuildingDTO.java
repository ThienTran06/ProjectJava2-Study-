package com.javaweb.model;

public class BuildingDTO {
	private String name;
	private Integer NumberOfBasement;
	private String street;
	private String ward;
	private Integer District_Id;

	public int getId() {
		return District_Id;
	}

	public void setId(int id) {
		this.District_Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		name = Name;
	}

	public Integer getNumber() {
		return NumberOfBasement;
	}

	public void setNumber(Integer numberOfBasement) {
		NumberOfBasement = numberOfBasement;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String Street) {
		street = Street;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

}
