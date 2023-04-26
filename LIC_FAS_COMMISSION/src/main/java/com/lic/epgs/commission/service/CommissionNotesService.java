package com.lic.epgs.commission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.entity.CommissionNotes;
import com.lic.epgs.commission.repository.CommissionNotesRepository;

@Service
public class CommissionNotesService {

	@Autowired
	private CommissionNotesRepository commissionNotesRepository;
	
	public CommissionNotes findByCommissionId(long commissionId) {
		return commissionNotesRepository.findByCommissionId(commissionId);
	}
	
	public List<CommissionNotes> findAll() {
		return commissionNotesRepository.findAll();
	}
	
	public CommissionNotes save(CommissionNotes commissionNotes) {
		return commissionNotesRepository.save(commissionNotes);
	}
	
	public void deleteByCommissionId(long commissionId) {
		commissionNotesRepository.deleteByCommissionId(commissionId);
	}
}