package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.commission.model.Commission;

@Repository
public interface CommissionRepository extends JpaRepository<Commission, Long> {

    @Query("SELECT c FROM Commission c WHERE c.commissionId = :commissionId")
    Commission getCommissionById(@Param("commissionId") Long commissionId);

    Commission save(Commission commission);

    Commission saveAndFlush(Commission commission);

    Commission update(Commission commission);

    Commission addCommissionDetails(Commission commission);

    Commission addCommissionNotesAndQuestions(Commission commission);

    void setTransactionMessage(String message);

    void setTransactionStatus(String status);

}