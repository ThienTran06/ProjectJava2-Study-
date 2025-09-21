package com.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaweb.model.BuildingDTO;
import com.javaweb.model.buildingSearchRequest;
import com.javaweb.service.BuildingService;

@RestController
public class Building {
	@Autowired
	private BuildingService buildingService ;
	@GetMapping(value = "/api/building/")
	public List<BuildingDTO> getBuilding(buildingSearchRequest request) {
		List<BuildingDTO> res=buildingService.findAll(request);
		return res;
	}
}
