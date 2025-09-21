package com.javaweb.model;

import com.javaweb.repository.entity.BuildingEntity;

public class BuildingRecords {
	BuildingEntity buildingEntity;
	String District_Code;
	String Address;
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public BuildingRecords(BuildingEntity buildingEntity,String districtCode,String Address) {
		this.buildingEntity=buildingEntity;
		this.District_Code=districtCode;
		this.Address=Address;
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
