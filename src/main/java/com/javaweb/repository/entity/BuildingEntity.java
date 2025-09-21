package com.javaweb.repository.entity;

public class BuildingEntity {
private String name;
private String street;
private String ward;
private Integer NumberOfBasement;
private Integer District_Id;
private String Direction;
private Integer Level;
private Double floor_Area;
private String Manager_Name;
private String Manager_Phone;
private Double rent_Price;
private Double Broker_Fee;
private Double Service_Fee;
private Double Free_Area;
private Double rent_Area;
public Double getRent_Area() {
	return rent_Area;
}
public void setRent_Area(Double rent_Area) {
	this.rent_Area = rent_Area;
}
public Double getFree_Area() {
	return Free_Area;
}
public void setFree_Area(Double free_Area) {
	Free_Area = free_Area;
}
public Double getFloor_Area() {
	return floor_Area;
}
public void setFloor_Area(Double floor_Area) {
	this.floor_Area = floor_Area;
}
public Double getRent_Price() {
	return rent_Price;
}
public void setRent_Price(Double rent_Price) {
	this.rent_Price = rent_Price;
}
public Double getBroker_Fee() {
	return Broker_Fee;
}
public void setBroker_Fee(Double broker_Fee) {
	Broker_Fee = broker_Fee;
}
public Double getService_Fee() {
	return Service_Fee;
}
public void setService_Fee(Double service_Fee) {
	Service_Fee = service_Fee;
}
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
public Integer getId() {
	return District_Id;
}
public void setId(Integer id) {
	this.District_Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public Integer getNumberOfBasement() {
	return NumberOfBasement;
}
public void setNumberOfBasement(Integer numberOfBasement) {
	NumberOfBasement = numberOfBasement;
}
}
