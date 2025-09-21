package com.javaweb.service;

import java.util.List;

import com.javaweb.model.BuildingDTO;
import com.javaweb.model.buildingSearchRequest;


public interface BuildingService {
List<BuildingDTO> findAll(buildingSearchRequest filter);
}
