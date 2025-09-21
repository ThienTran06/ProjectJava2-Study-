package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.model.BuildingDTO;
import com.javaweb.model.BuildingRecords;
import com.javaweb.model.buildingSearchRequest;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;
@Service
public class BuildingServiceImpl implements BuildingService{
@Autowired
	private BuildingRepository buildingRepository;
@Override
	public List<BuildingDTO> findAll(buildingSearchRequest filter) {
		List<BuildingRecords> buildingRecords =buildingRepository.findAll(filter);
		List<BuildingDTO> result=new ArrayList<>();
		for(BuildingRecords item:buildingRecords) {
			BuildingDTO buildingDTO=new BuildingDTO();
			BuildingEntity entity =item.getBuildingEntity();
			String address = item.getAddress();
			buildingDTO.setName(entity.getName());
			buildingDTO.setNumber(entity.getNumberOfBasement());
			buildingDTO.setFloor_Area(entity.getFloor_Area());
			buildingDTO.setManager_Name(entity.getManager_Name());
			buildingDTO.setManager_Phone(entity.getManager_Phone());
			buildingDTO.setRent_Price(entity.getRent_Price());
			buildingDTO.setBroker_Fee(entity.getBroker_Fee());
			buildingDTO.setService_Fee(entity.getService_Fee());
			buildingDTO.setAddress(address);
			buildingDTO.setFree_Area(entity.getFree_Area());
			result.add(buildingDTO);
		}
		return result;
	}
}
