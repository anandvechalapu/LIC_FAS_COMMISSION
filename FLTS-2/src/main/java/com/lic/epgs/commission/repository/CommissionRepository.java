package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionTempEntity;

@Repository
public interface CommissionRepository extends JpaRepository<CommissionEntity, Long> {

	public CommissionEntity findByCommissionId(Long commissionId);

	public void saveCommissionEntity(CommissionEntity commissionEntity);

	public void saveCommissionTempEntity(CommissionTempEntity commissionTempEntity);

}