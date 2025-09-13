package com.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.javaweb.model.BuildingDTO;
import com.javaweb.service.BuildingService;

@RestController
public class Building {
	@Autowired
	private BuildingService buildingService ;
	@GetMapping(value = "/api/building/")
	public List<BuildingDTO> getBuilding(@RequestParam(name = "name",required=false) String name,
			@RequestParam(name = "District_Id",required=false) Integer District_Id) {
		List<BuildingDTO> res=buildingService.findAll(name,District_Id);
		return res;
	}
//	public void validate(BuildingDTO buildingDTO){
//		if(buildingDTO.getName()==null||buildingDTO.getName().isEmpty()||buildingDTO.getNumber()==null) {
//			throw new Field_Required_Exception("THONG TIN KHONG DUOC NULL HOAC RONG");
//		}
//	}

//	@DeleteMapping(value="/api/building/{id}/{name}")
//	public void DeleteBuilding(@PathVariable Integer id,
//			@PathVariable String name) {
//		System.out.println("Da xoa toa nha "+id+" roi nhe"+" Toa nha ten la "+name);
//	}
}
