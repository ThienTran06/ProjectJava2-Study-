package com.javaweb.model;

import com.javaweb.repository.entity.BuildingEntity;

public class BuildingRecords {
	BuildingEntity buildingEntity;
	String District_Code;
	String Address;
	String rent_Areas;
	public String getRent_Areas() {
		return rent_Areas;
	}

	public void setRent_Areas(String rent_Areas) {
		this.rent_Areas = rent_Areas;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public BuildingRecords(BuildingEntity buildingEntity,String districtCode,String rent_Areas) {
		this.buildingEntity=buildingEntity;
		this.District_Code=districtCode;
		this.rent_Areas=rent_Areas;
	}

	public BuildingEntity getBuildingEntity() {
		return buildingEntity;
	}

	public void setBuildingEntity(BuildingEntity buildingEntity) {
		this.buildingEntity = buildingEntity;
	}

	public String getDistrict_Code() {
		return District_Code;
	}

	public void setDistrict_Code(String district_Code) {
		District_Code = district_Code;
	}
}
