package com.lic.epgs.commission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.model.CommissionTempEntity;
import com.lic.epgs.commission.model.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.model.CommissionNotesTempEntity;
import com.lic.epgs.commission.model.CommissionEntity;
import com.lic.epgs.commission.model.CommissionQuestionDetailsEntity;
import com.lic.epgs.commission.model.CommissionNotesEntity;
import com.lic.epgs.commission.repository.CommissionTempRepository;
import com.lic.epgs.commission.repository.CommissionQuestionDetailsTempRepository;
import com.lic.epgs.commission.repository.CommissionNotesTempRepository;
import com.lic.epgs.commission.repository.CommissionRepository;
import com.lic.epgs.commission.repository.CommissionQuestionDetailsRepository;
import com.lic.epgs.commission.repository.CommissionNotesRepository;

@Service
public class CommissionService {
    
    @Autowired
    private CommissionTempRepository commissionTempRepository;
    
    @Autowired
    private CommissionQuestionDetailsTempRepository commissionQuestionDetailsTempRepository;
    
    @Autowired
    private CommissionNotesTempRepository commissionNotesTempRepository;
    
    @Autowired
    private CommissionRepository commissionRepository;
    
    @Autowired
    private CommissionQuestionDetailsRepository commissionQuestionDetailsRepository;
    
    @Autowired
    private CommissionNotesRepository commissionNotesRepository;
    
    public CommissionTempEntity getCommissionTemp(Long commissionId, Boolean isActive) {
        return commissionTempRepository.findByCommissionIdAndIsActive(commissionId, isActive);
    }
    
    public List<CommissionQuestionDetailsTempEntity> getCommissionQuestionDetailsTemp(Long commissionId, Boolean isActive) {
        return commissionQuestionDetailsTempRepository.findByCommissionIdAndIsActive(commissionId, isActive);
    }
    
    public List<CommissionNotesTempEntity> getCommissionNotesTemp(Long commissionId, Boolean isActive) {
        return commissionNotesTempRepository.findByCommissionIdAndIsActive(commissionId, isActive);
    }
    
    public CommissionEntity saveCommission(CommissionEntity commissionEntity) {
        return commissionRepository.save(commissionEntity);
    }
    
    public List<CommissionQuestionDetailsEntity> saveCommissionQuestionDetails(List<CommissionQuestionDetailsEntity> commissionQuestionDetailsEntities) {
        return commissionQuestionDetailsRepository.saveAll(commissionQuestionDetailsEntities);
    }
    
    public List<CommissionNotesEntity> saveCommissionNotes(List<CommissionNotesEntity> commissionNotesEntities) {
        return commissionNotesRepository.saveAll(commissionNotesEntities);
    }
    
    public CommissionTempEntity saveCommissionTemp(CommissionTempEntity commissionTempEntity) {
        return commissionTempRepository.save(commissionTempEntity);
    }
    
    public List<CommissionQuestionDetailsTempEntity> saveCommissionQuestionDetailsTemp(List<CommissionQuestionDetailsTempEntity> commissionQuestionDetailsTempEntities) {
        return commissionQuestionDetailsTempRepository.saveAll(commissionQuestionDetailsTempEntities);
    }
    
    public List<CommissionNotesTempEntity> saveCommissionNotesTemp(List<CommissionNotesTempEntity> commissionNotesTempEntities) {
        return commissionNotesTempRepository.saveAll(commissionNotesTempEntities);
    }
}