package com.javaweb.model;

public class buildingSearchRequest {
	private String Direction;
	private String name;
	private Integer NumberOfBasement;
	private String street;
	private String ward;
	private Integer District_Id;
	private Double rent_Price_Start;
	private Double rent_Price_End;
	private Double rent_Area_Start;
	private Double rent_Area_End;
	private Integer Level;
	private Double floor_Area;
	private String Manager_Name;
	private String Manager_Phone;
	private Integer Staff_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfBasement() {
		return NumberOfBasement;
	}

	public void setNumberOfBasement(Integer numberOfBasement) {
		NumberOfBasement = numberOfBasement;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public Integer getDistrict_Id() {
		return District_Id;
	}

	public void setDistrict_Id(Integer district_Id) {
		District_Id = district_Id;
	}

	public Double getRent_Price_Start() {
		return rent_Price_Start;
	}

	public void setRent_Price_Start(Double rent_Price_Start) {
		this.rent_Price_Start = rent_Price_Start;
	}

	public Double getRent_Price_End() {
		return rent_Price_End;
	}

	public void setRent_Price_End(Double rent_Price_End) {
		this.rent_Price_End = rent_Price_End;
	}

	public Double getRent_Area_Start() {
		return rent_Area_Start;
	}

	public void setRent_Area_Start(Double rent_Area_Start) {
		this.rent_Area_Start = rent_Area_Start;
	}

	public Double getRent_Area_End() {
		return rent_Area_End;
	}

	public void setRent_Area_End(Double rent_Area_End) {
		this.rent_Area_End = rent_Area_End;
	}

	public Integer getLevel() {
		return Level;
	}

	public void setLevel(Integer level) {
		Level = level;
	}

	public Double getFloor_Area() {
		return floor_Area;
	}

	public void setFloor_Area(Double floor_Area) {
		this.floor_Area = floor_Area;
	}

	public String getManager_Name() {
		return Manager_Name;
	}

	public void setManager_Name(String manager_Name) {
		Manager_Name = manager_Name;
	}

	public String getManager_Phone() {
		return Manager_Phone;
	}

	public void setManager_Phone(String manager_Phone) {
		Manager_Phone = manager_Phone;
	}

	public Integer getStaff_id() {
		return Staff_id;
	}

	public void setStaff_id(Integer staff_id) {
		Staff_id = staff_id;
	}

	public String getDirection() {
		return Direction;
	}

	public void setDirection(String direction) {
		Direction = direction;
	}
}
