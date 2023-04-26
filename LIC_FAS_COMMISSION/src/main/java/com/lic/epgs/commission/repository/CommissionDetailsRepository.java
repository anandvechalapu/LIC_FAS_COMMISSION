package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.commission.entity.CommissionDetails;

public interface CommissionDetailsRepository extends JpaRepository<CommissionDetails, Long> {
    
    CommissionDetails save(CommissionDetails commissionDetails);

}