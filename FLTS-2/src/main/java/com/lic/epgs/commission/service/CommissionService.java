package com.lic.epgs.commission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionTempEntity;
import com.lic.epgs.commission.repository.CommissionRepository;

@Service
public class CommissionService {

	@Autowired
	private CommissionRepository commissionRepository;

	public CommissionEntity findByCommissionId(Long commissionId) {
		return commissionRepository.findByCommissionId(commissionId);
	}

	public List<CommissionEntity> findAllCommissionEntities() {
		return commissionRepository.findAll();
	}

	public void saveCommissionEntity(CommissionEntity commissionEntity) {
		commissionRepository.saveCommissionEntity(commissionEntity);
	}

	public void saveCommissionTempEntity(CommissionTempEntity commissionTempEntity) {
		commissionRepository.saveCommissionTempEntity(commissionTempEntity);
	}

}