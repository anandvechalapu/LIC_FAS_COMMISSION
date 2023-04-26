package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.commission.entity.CommissionNotes;

@Repository
public interface CommissionNotesRepository extends JpaRepository<CommissionNotes, Long> {
	
	@Query("SELECT cn FROM CommissionNotes cn WHERE cn.commissionId = ?1")
	public CommissionNotes findByCommissionId(long commissionId);
	
	@Query("DELETE FROM CommissionNotes cn WHERE cn.commissionId = ?1")
	public void deleteByCommissionId(long commissionId);
	
}