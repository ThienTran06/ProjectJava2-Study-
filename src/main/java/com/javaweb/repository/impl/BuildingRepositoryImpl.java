package com.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.model.BuildingRecords;
import com.javaweb.model.buildingSearchRequest;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
@Repository
public class BuildingRepositoryImpl implements BuildingRepository {
	static final String DB_URL = "jdbc:mysql://localhost:3306/real_estate_web";
	static final String USER = "root";
	static final String PASS = "211006";
	@Override
	public List<BuildingRecords> findAll(buildingSearchRequest filter) {
		
		StringBuilder sql =new StringBuilder("SELECT DISTINCT b.*,");
		sql.append("GROUP_CONCAT(r.Area ORDER BY r.Area SEPARATOR', ')AS rent_Areas, ");
		sql.append("d.District_Code ");
		sql.append("FROM building b ");
		sql.append("LEFT JOIN rent_area r on r.Building_Id = b.Building_Id ");
		sql.append("LEFT JOIN district d on d.District_Id=b.District_Id ");
		sql.append(" LEFT JOIN user_building ub on ub.Building_Id=b.Building_Id ");
		sql.append("WHERE 1 = 1 ");
		if(filter.getName()!=null&&!filter.getName().equals(""))sql.append("AND name like '%"+filter.getName()+"%' ");
		if(filter.getDistrict_Id()!=null)sql.append("AND District_Id ="+filter.getDistrict_Id()+" ");
		if(filter.getNumberOfBasement()!=null)sql.append("AND NumberOfBasement ="+filter.getNumberOfBasement()+" ");
		if(filter.getFloor_Area()!=null)sql.append("AND Floor_Area = "+filter.getFloor_Area()+" ");
		if(filter.getStreet()!=null&&!filter.getStreet().equals(""))sql.append("AND street like '%"+filter.getStreet()+"%' ");
		if(filter.getWard()!=null&&!filter.getWard().equals(""))sql.append("AND ward like '%"+filter.getWard()+"%' ");
		if(filter.getDirection()!=null&&!filter.getDirection().equals(""))sql.append("AND Direction like '%"+filter.getDirection()+"%' ");
		if(filter.getLevel()!=null)sql.append("AND Building_Level =" +filter.getLevel()+" ");
		if(filter.getRent_Price_Start()!=null)sql.append("AND Rent_Price >= "+filter.getRent_Price_Start()+" ");
		if(filter.getRent_Price_End()!=null)sql.append("AND Rent_Price <= "+filter.getRent_Price_End()+" ");
		if(filter.getManager_Name()!=null&&!filter.getManager_Name().equals(""))sql.append("AND Manager_Name like'%"+filter.getManager_Name()+"%' ");
		if(filter.getManager_Phone()!=null&&!filter.getManager_Phone().equals(""))sql.append("AND Manager_Phone like'%"+filter.getManager_Phone()+"%' ");
		if(filter.getRent_Area_Start()!=null)sql.append("AND Area >="+filter.getRent_Area_Start()+" ");
		if(filter.getRent_Area_End()!=null)sql.append("AND Area<="+filter.getRent_Area_End()+" ");
		if(filter.getStaff_id()!=null)sql.append("AND User_Id="+filter.getStaff_id()+" ");
		sql.append("GROUP BY b.Building_Id");
		List<BuildingRecords> result = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString());) {
			while (rs.next()) {
				BuildingEntity buildingEntity = new BuildingEntity();
				buildingEntity.setName(rs.getString("name"));
				buildingEntity.setStreet(rs.getString("street"));
				buildingEntity.setWard(rs.getString("ward"));
				buildingEntity.setNumberOfBasement(rs.getInt("NumberOfBasement"));
				buildingEntity.setDistrict_Id(rs.getInt("District_Id"));
				buildingEntity.setDirection(rs.getString("Direction"));
				buildingEntity.setFloor_Area(rs.getDouble("Floor_Area"));
				buildingEntity.setLevel(rs.getInt("Building_Level"));
				buildingEntity.setManager_Name(rs.getString("Manager_Name"));
				buildingEntity.setManager_Phone(rs.getString("Manager_Phone"));
				buildingEntity.setRent_Price(rs.getDouble("Rent_Price"));
				buildingEntity.setBroker_Fee(rs.getDouble("Broker_Fee"));
				buildingEntity.setService_Fee(rs.getDouble("Service_Fee"));
				buildingEntity.setRentFree_Area(rs.getDouble("RentFree_Area"));
				String District_Code=rs.getString("District_Code");
				String rent_Areas=rs.getString("rent_Areas");
				BuildingRecords buildingrecords=new BuildingRecords(buildingEntity,District_Code,rent_Areas);
				result.add(buildingrecords);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connected database failed!");
		}
		return result;
	}
}
