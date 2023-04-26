package com.lic.epgs.commission.repository;

import com.lic.epgs.commission.dto.CommissionDto;
import com.lic.epgs.commission.dto.CommissionDetailsDto;
import com.lic.epgs.commission.entity.Commission;
import com.lic.epgs.commission.entity.CommissionDetailsEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.entity.CommissionNotesTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommissionRepository extends JpaRepository<Commission, Long> {

    public Commission saveCommission(CommissionDto commissionDto) throws ConstraintViolationException, PersistenceException;
    public CommissionDetailsEntity saveCommissionDetails(CommissionDetailsDto commissionDetailsDto) throws ConstraintViolationException, PersistenceException;
    public List<CommissionQuestionDetailsTempEntity> saveCommissionQuestionDetailsTemp(CommissionQuestionDetailsTempEntity commissionQuestionDetailsTempEntity) throws ConstraintViolationException, PersistenceException;
    public List<CommissionNotesTempEntity> saveCommissionNotesTemp(CommissionNotesTempEntity commissionNotesTempEntity) throws ConstraintViolationException, PersistenceException;

}