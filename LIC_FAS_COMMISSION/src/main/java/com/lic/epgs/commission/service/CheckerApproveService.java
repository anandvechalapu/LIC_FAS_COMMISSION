package com.lic.epgs.commission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.entity.CommonCommissionDto;
import com.lic.epgs.commission.repository.CheckerApproveRepository;

@Service
public class CheckerApproveService {

	@Autowired
	private CheckerApproveRepository checkerApproveRepository;

	public CommonCommissionDto findByCommissionId(Long commissionId) {
		return checkerApproveRepository.findByCommissionId(commissionId);
	}

	public int updateCommissionStatus(Long commissionId) {
		return checkerApproveRepository.updateCommissionStatus(commissionId);
	}

	public CommonCommissionDto addCommissionToCommissionEntity(Long commissionId) {
		return checkerApproveRepository.addCommissionToCommissionEntity(commissionId);
	}

	public CommonCommissionDto addCommissionNotes(Long commissionId) {
		return checkerApproveRepository.addCommissionNotes(commissionId);
	}

	public CommonCommissionDto addCommissionQuestions(Long commissionId) {
		return checkerApproveRepository.addCommissionQuestions(commissionId);
	}

}