package com.lic.epgs.commission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.model.CommissionEntity;
import com.lic.epgs.commission.model.CommissionTempEntity;
import com.lic.epgs.commission.repository.CommissionRepository;

@Service
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    //Method to update the commission status in CommissionTempEntity
    public void updateCommissionTempStatus(Long commissionId, String status) {
        commissionRepository.updateCommissionTempStatus(commissionId, status);
    }

    //Method to update the commission status in CommissionEntity
    public void updateCommissionStatus(Long commissionId, String status) {
        commissionRepository.updateCommissionStatus(commissionId, status);
    }

    //Method to add commission notes to the table
    public void addCommissionNotes(Long commissionId, String notes) {
        commissionRepository.addCommissionNotes(commissionId, notes);
    }

    //Method to add commission question details to the table
    public void addCommissionQuestionDetails(Long commissionId, String questionDetails) {
        commissionRepository.addCommissionQuestionDetails(commissionId, questionDetails);
    }

    //Method to handle constraint violation
    public void handleConstraintViolation(Long commissionId) {
        commissionRepository.handleConstraintViolation(commissionId);
    }

    //Method to handle persistence exception
    public void handlePersistenceException(Long commissionId) {
        commissionRepository.handlePersistenceException(commissionId);
    }
}