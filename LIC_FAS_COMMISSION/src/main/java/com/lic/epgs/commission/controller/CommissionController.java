package com.lic.epgs.commission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.model.CommissionModel;
import com.lic.epgs.commission.service.CheckerApproveService;
import com.lic.epgs.commission.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {

	@Autowired
	private CommissionService commissionService;
	
	@Autowired
	private CheckerApproveService checkerApproveService;

	@GetMapping("/details")
	public ResponseEntity<Object> getCommissionDetails() {
		return new ResponseEntity<>(commissionService.loadCommissionDetails(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> getCommissionById(@PathVariable Long id) {
		return new ResponseEntity<>(checkerApproveService.findByCommissionId(id), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updateCommissionStatus(@PathVariable Long id) {
		return new ResponseEntity<>(checkerApproveService.updateCommissionStatus(id), HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<Object> addCommission(@RequestBody CommissionModel commissionModel) {
		return new ResponseEntity<>(checkerApproveService.addCommissionToCommissionEntity(commissionModel.getCommissionId()), HttpStatus.CREATED);
	}

}