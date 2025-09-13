package com.javaweb.repository;

import java.util.List;

import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingRepository {
List<BuildingEntity> findAll(String name,Integer District_Id);
void DeleteByID(Integer id);
}
