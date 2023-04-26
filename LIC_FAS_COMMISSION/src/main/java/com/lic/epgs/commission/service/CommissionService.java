package com.lic.epgs.commission.service;

import com.lic.epgs.commission.dto.CommissionDto;
import com.lic.epgs.commission.dto.CommissionDetailsDto;
import com.lic.epgs.commission.entity.Commission;
import com.lic.epgs.commission.entity.CommissionDetailsEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.entity.CommissionNotesTempEntity;
import com.lic.epgs.commission.repository.CommissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public Commission saveCommission(CommissionDto commissionDto) throws ConstraintViolationException, PersistenceException {
        return commissionRepository.saveCommission(commissionDto);
    }

    public CommissionDetailsEntity saveCommissionDetails(CommissionDetailsDto commissionDetailsDto) throws ConstraintViolationException, PersistenceException {
        return commissionRepository.saveCommissionDetails(commissionDetailsDto);
    }

    public List<CommissionQuestionDetailsTempEntity> saveCommissionQuestionDetailsTemp(CommissionQuestionDetailsTempEntity commissionQuestionDetailsTempEntity) throws ConstraintViolationException, PersistenceException {
        return commissionRepository.saveCommissionQuestionDetailsTemp(commissionQuestionDetailsTempEntity);
    }

    public List<CommissionNotesTempEntity> saveCommissionNotesTemp(CommissionNotesTempEntity commissionNotesTempEntity) throws ConstraintViolationException, PersistenceException {
        return commissionRepository.saveCommissionNotesTemp(commissionNotesTempEntity);
    }

}