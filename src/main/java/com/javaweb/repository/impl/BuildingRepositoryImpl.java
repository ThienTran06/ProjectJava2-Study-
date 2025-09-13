package com.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
@Repository
public class BuildingRepositoryImpl implements BuildingRepository {
	static final String DB_URL = "jdbc:mysql://localhost:3306/real_estate_web";
	static final String USER = "root";
	static final String PASS = "211006";
	@Override
	public List<BuildingEntity> findAll(String name,Integer id) {
		StringBuilder sql =new StringBuilder("SELECT*FROM building where 1=1 ");
		if(name!=null&&!name.equals(""))sql.append("AND name like '%"+name+"%' ");
		if(id!=null)sql.append("AND District_Id ="+id+" ");
		List<BuildingEntity> result = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());) {
			while (rs.next()) {
				BuildingEntity buildingEntity = new BuildingEntity();
				buildingEntity.setName(rs.getString("name"));
				buildingEntity.setStreet(rs.getString("street"));
				buildingEntity.setWard(rs.getString("ward"));
				buildingEntity.setNumberOfBasement(rs.getInt("NumberOfBasement"));
				buildingEntity.setId(rs.getInt("District_Id"));
				result.add(buildingEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connected database failed!");
		}
		return result;
	}
	@Override
	public void DeleteByID(Integer id) {
	}
}
