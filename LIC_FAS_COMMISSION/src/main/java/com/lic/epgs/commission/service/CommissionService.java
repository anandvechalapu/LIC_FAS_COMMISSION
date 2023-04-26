package com.lic.epgs.commission.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.model.Commission;
import com.lic.epgs.commission.repository.CommissionRepository;

@Service
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public Optional<Commission> getCommissionById(Long commissionId) {
        return commissionRepository.getCommissionById(commissionId);
    }

    public Commission save(Commission commission) {
        return commissionRepository.save(commission);
    }

    public Commission saveAndFlush(Commission commission) {
        return commissionRepository.saveAndFlush(commission);
    }

    public Commission update(Commission commission) {
        return commissionRepository.update(commission);
    }

    public Commission addCommissionDetails(Commission commission) {
        return commissionRepository.addCommissionDetails(commission);
    }

    public Commission addCommissionNotesAndQuestions(Commission commission) {
        return commissionRepository.addCommissionNotesAndQuestions(commission);
    }

    public void setTransactionMessage(String message) {
        commissionRepository.setTransactionMessage(message);
    }

    public void setTransactionStatus(String status) {
        commissionRepository.setTransactionStatus(status);
    }

}