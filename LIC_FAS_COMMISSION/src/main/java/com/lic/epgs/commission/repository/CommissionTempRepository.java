package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.commission.model.CommissionTempEntity;
import com.lic.epgs.commission.model.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.model.CommissionNotesTempEntity;
import com.lic.epgs.commission.model.CommissionEntity;
import com.lic.epgs.commission.model.CommissionQuestionDetailsEntity;
import com.lic.epgs.commission.model.CommissionNotesEntity;

@Repository
public interface CommissionTempRepository extends JpaRepository<CommissionTempEntity, Long> {
    
    public CommissionTempEntity findByCommissionIdAndIsActive(Long commissionId, Boolean isActive);
    
    public CommissionTempEntity save(CommissionTempEntity commissionTempEntity);
}

@Repository
public interface CommissionQuestionDetailsTempRepository extends JpaRepository<CommissionQuestionDetailsTempEntity, Long> {
    
    public List<CommissionQuestionDetailsTempEntity> findByCommissionIdAndIsActive(Long commissionId, Boolean isActive);
    
    public List<CommissionQuestionDetailsTempEntity> saveAll(List<CommissionQuestionDetailsTempEntity> commissionQuestionDetailsTempEntities);
}

@Repository
public interface CommissionNotesTempRepository extends JpaRepository<CommissionNotesTempEntity, Long> {
    
    public List<CommissionNotesTempEntity> findByCommissionIdAndIsActive(Long commissionId, Boolean isActive);
    
    public List<CommissionNotesTempEntity> saveAll(List<CommissionNotesTempEntity> commissionNotesTempEntities);
}

@Repository
public interface CommissionRepository extends JpaRepository<CommissionEntity, Long> {
    
    public CommissionEntity save(CommissionEntity commissionEntity);
}

@Repository
public interface CommissionQuestionDetailsRepository extends JpaRepository<CommissionQuestionDetailsEntity, Long> {
    
    public List<CommissionQuestionDetailsEntity> saveAll(List<CommissionQuestionDetailsEntity> commissionQuestionDetailsEntities);
}

@Repository
public interface CommissionNotesRepository extends JpaRepository<CommissionNotesEntity, Long> {
    
    public List<CommissionNotesEntity> saveAll(List<CommissionNotesEntity> commissionNotesEntities);
}