package com.lic.epgs.commission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionTempEntity;
import com.lic.epgs.commission.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {
	
	@Autowired
	private CommissionService commissionService;
	
	@GetMapping("/byId")
	public CommissionEntity findByCommissionId(@RequestParam("commissionId") Long commissionId) {
		return commissionService.findByCommissionId(commissionId);
	}
	
	@GetMapping("/all")
	public List<CommissionEntity> findAllCommissionEntities() {
		return commissionService.findAllCommissionEntities();
	}
	
	@PostMapping("/save")
	public void saveCommissionEntity(@RequestBody CommissionEntity commissionEntity) {
		commissionService.saveCommissionEntity(commissionEntity);
	}
	
	@PostMapping("/temp/save")
	public void saveCommissionTempEntity(@RequestBody CommissionTempEntity commissionTempEntity) {
		commissionService.saveCommissionTempEntity(commissionTempEntity);
	}

}