package com.lic.epgs.commission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.entity.CommissionDetails;
import com.lic.epgs.commission.repository.CommissionDetailsRepository;

@Service
public class CommissionDetailsService {
    @Autowired
    private CommissionDetailsRepository commissionDetailsRepository;

    public CommissionDetails saveCommissionDetails(CommissionDetails commissionDetails) {
        return commissionDetailsRepository.save(commissionDetails);
    }

    public List<CommissionDetails> getAllCommissionDetails() {
        return commissionDetailsRepository.findAll();
    }
}