package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.commission.model.CommissionEntity;
import com.lic.epgs.commission.model.CommissionTempEntity;

@Repository
public interface CommissionRepository extends JpaRepository<CommissionEntity, Long> {
    //Method to update the commission status in CommissionTempEntity
    public void updateCommissionTempStatus(Long commissionId, String status);

    //Method to update the commission status in CommissionEntity
    public void updateCommissionStatus(Long commissionId, String status);

    //Method to add commission notes to the table
    public void addCommissionNotes(Long commissionId, String notes);

    //Method to add commission question details to the table
    public void addCommissionQuestionDetails(Long commissionId, String questionDetails);

    //Method to handle constraint violation
    public void handleConstraintViolation(Long commissionId);

    //Method to handle persistence exception
    public void handlePersistenceException(Long commissionId);
}