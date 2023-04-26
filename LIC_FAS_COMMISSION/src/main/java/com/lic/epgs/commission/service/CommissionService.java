package com.lic.epgs.commission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.repository.CommissionRepository;

@Service
public class CommissionService {

	@Autowired
	private CommissionRepository commissionRepository;
	
	public List<CommonCommissionDto> getCommissionByStatus(String status){
		return commissionRepository.findByStatus(status);
	}
	
	@Transactional
	public int updateStatus(String status, Long id){
		return commissionRepository.updateStatus(status, id);
	}
	
	@Transactional
	public int deleteByStatus(String status){
		return commissionRepository.deleteByStatus(status);
	}
	
	@Transactional
	public List<CommonCommissionDto> loadQuestionMaster(String status){
		return commissionRepository.loadQuestionMaster(status);
	}
	
}