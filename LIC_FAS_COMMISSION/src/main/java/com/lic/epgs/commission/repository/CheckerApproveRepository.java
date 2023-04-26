package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommonCommissionDto;

@Repository
public interface CheckerApproveRepository extends JpaRepository<CommonCommissionDto, Long>{

	@Query("SELECT c FROM CommissionEntity c WHERE c.commissionId = :commissionId")
    public CommonCommissionDto findByCommissionId(@Param("commissionId") Long commissionId);

	@Modifying
    @Query("UPDATE CommissionEntity c SET c.status = 'approved' WHERE c.commissionId = :commissionId")
    public int updateCommissionStatus(@Param("commissionId") Long commissionId);

	@Query("INSERT INTO CommissionEntity (commissionId, status) VALUES (:commissionId, 'approved')")
    public CommonCommissionDto addCommissionToCommissionEntity(@Param("commissionId") Long commissionId);

	@Query("INSERT INTO CommissionNotes (commissionId) VALUES (:commissionId)")
    public CommonCommissionDto addCommissionNotes(@Param("commissionId") Long commissionId);

	@Query("INSERT INTO CommissionQuestions (commissionId) VALUES (:commissionId)")
    public CommonCommissionDto addCommissionQuestions(@Param("commissionId") Long commissionId);
}