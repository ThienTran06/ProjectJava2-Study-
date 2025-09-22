package com.javaweb.model;

public class BuildingDTO {
	private String name;
	private Integer NumberOfBasement;
	private String street;
	private String ward;
	private String District_Code;
	private Double Rent_Price;
	private String Manager_Name;
	private String Manager_Phone;
	private Double floor_Area;
	private String rent_Areas;
	private Double service_Fee;
	private Double broker_Fee;
	private Double RentFree_Area;
	private Integer Level;
	private String Direction;
	private String Address;
	public String getDirection() {
		return Direction;
	}

	public void setDirection(String direction) {
		Direction = direction;
	}

	public Integer getLevel() {
		return Level;
	}

	public void setLevel(Integer level) {
		Level = level;
	}

	public Double getRentFree_Area() {
		return RentFree_Area;
	}

	public void setRentFree_Area(Double rentFree_Area) {
		RentFree_Area = rentFree_Area;
	}

	public Integer getNumberOfBasement() {
		return NumberOfBasement;
	}

	public void setNumberOfBasement(Integer numberOfBasement) {
		NumberOfBasement = numberOfBasement;
	}
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
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

	public String getRent_Areas() {
		return rent_Areas;
	}

	public void setRent_Areas(String rent_Areas) {
		this.rent_Areas = rent_Areas;
	}

	public Double getService_Fee() {
		return service_Fee;
	}

	public void setService_Fee(Double service_Fee) {
		this.service_Fee = service_Fee;
	}

	public Double getBroker_Fee() {
		return broker_Fee;
	}

	public void setBroker_Fee(Double broker_Fee) {
		this.broker_Fee = broker_Fee;
	}

	public String getDistrict_Code() {
		return District_Code;
	}

	public void setDistrict_Code(String district_Code) {
		District_Code = district_Code;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		name = Name;
	}


	public String getStreet() {
		return street;
	}

	public void setStreet(String Street) {
		street = Street;
	}

	public Double getRent_Price() {
		return Rent_Price;
	}

	public void setRent_Price(Double rent_Price) {
		Rent_Price = rent_Price;
	}

	public Double getFloor_Area() {
		return floor_Area;
	}

	public void setFloor_Area(Double floor_Area) {
		this.floor_Area = floor_Area;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

}
