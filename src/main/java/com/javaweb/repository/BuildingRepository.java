package com.javaweb.repository;

import java.util.List;

import com.javaweb.model.BuildingRecords;
import com.javaweb.model.buildingSearchRequest;

public interface BuildingRepository {
List<BuildingRecords> findAll(buildingSearchRequest filter);
}
