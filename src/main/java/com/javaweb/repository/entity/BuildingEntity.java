package com.javaweb.repository.entity;

public class BuildingEntity {
private String name;
private String street;
private String ward;
private Integer NumberOfBasement;
private Integer District_Id;
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
