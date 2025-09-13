package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.model.BuildingDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;
@Service
public class BuildingServiceImpl implements BuildingService{
@Autowired
	private BuildingRepository buildingRepository;
@Override
	public List<BuildingDTO> findAll(String name,Integer District_Id) {
		List<BuildingEntity> buildingEntities =buildingRepository.findAll(name,District_Id);
		List<BuildingDTO> result=new ArrayList<>();
		for(BuildingEntity item:buildingEntities) {
			BuildingDTO buildingDTO=new BuildingDTO();
			buildingDTO.setName(item.getName());
			buildingDTO.setNumber(item.getNumberOfBasement());
			buildingDTO.setStreet(item.getStreet());
			buildingDTO.setWard(item.getWard());
			buildingDTO.setId(item.getId());
			result.add(buildingDTO);
		}
		return result;
	}
	@Override
	public void DeleteByID(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
