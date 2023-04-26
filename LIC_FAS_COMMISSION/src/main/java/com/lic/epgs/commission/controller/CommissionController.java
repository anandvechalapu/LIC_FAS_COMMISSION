package com.lic.epgs.commission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.entity.CommissionNotes;
import com.lic.epgs.commission.service.CommissionNotesService;
import com.lic.epgs.commission.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {

	@Autowired
	private CommissionService commissionService;
	
	@Autowired
	private CommissionNotesService commissionNotesService;
	
	@GetMapping("/{status}")
	public List<CommonCommissionDto> getCommissionByStatus(@PathVariable String status) {
		return commissionService.getCommissionByStatus(status);
	}
	
	@PutMapping("/{status}/{id}")
	public int updateStatus(@PathVariable String status, @PathVariable Long id) {
		return commissionService.updateStatus(status, id);
	}
	
	@GetMapping("/{status}/question-master")
	public List<CommonCommissionDto> loadQuestionMaster(@PathVariable String status) {
		return commissionService.loadQuestionMaster(status);
	}
	
	@GetMapping("/note/{commissionId}")
	public CommissionNotes findByCommissionId(@PathVariable long commissionId) {
		return commissionNotesService.findByCommissionId(commissionId);
	}
	
	@PutMapping("/note/{commissionId}")
	public CommissionNotes save(CommissionNotes commissionNotes) {
		return commissionNotesService.save(commissionNotes);
	}
	
	@PutMapping("/note/{commissionId}/delete")
	public void deleteByCommissionId(@PathVariable long commissionId) {
		commissionNotesService.deleteByCommissionId(commissionId);
	}
}