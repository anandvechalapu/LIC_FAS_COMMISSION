package com.lic.epgs.commission.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.model.Commission;
import com.lic.epgs.commission.model.CommissionTempEntity;
import com.lic.epgs.commission.model.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.model.CommissionNotesTempEntity;
import com.lic.epgs.commission.model.CommissionEntity;
import com.lic.epgs.commission.model.CommissionQuestionDetailsEntity;
import com.lic.epgs.commission.model.CommissionNotesEntity;
import com.lic.epgs.commission.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    @Autowired
    private CommissionService commissionService;

    @GetMapping("/{commissionId}")
    public Optional<Commission> getCommissionById(@PathVariable(name = "commissionId") Long commissionId) {
        return commissionService.getCommissionById(commissionId);
    }

    @PostMapping
    public Commission save(@RequestBody Commission commission) {
        return commissionService.save(commission);
    }

    @PostMapping("/saveandflush")
    public Commission saveAndFlush(@RequestBody Commission commission) {
        return commissionService.saveAndFlush(commission);
    }

    @PostMapping("/update")
    public Commission update(@RequestBody Commission commission) {
        return commissionService.update(commission);
    }

    @PostMapping("/details")
    public Commission addCommissionDetails(@RequestBody Commission commission) {
        return commissionService.addCommissionDetails(commission);
    }

    @PostMapping("/notesandquestions")
    public Commission addCommissionNotesAndQuestions(@RequestBody Commission commission) {
        return commissionService.addCommissionNotesAndQuestions(commission);
    }

    @PostMapping("/transactionmessage")
    public void setTransactionMessage(@RequestBody String message) {
        commissionService.setTransactionMessage(message);
    }

    @PostMapping("/transactionstatus")
    public void setTransactionStatus(@RequestBody String status) {
        commissionService.setTransactionStatus(status);
    }
    
    @GetMapping("/temp/{commissionId}/{isActive}")
    public CommissionTempEntity getCommissionTemp(@PathVariable(name = "commissionId") Long commissionId, @PathVariable(name = "isActive") Boolean isActive) {
        return commissionService.getCommissionTemp(commissionId, isActive);
    }
    
    @GetMapping("/questiondetails/temp/{commissionId}/{isActive}")
    public List<CommissionQuestionDetailsTempEntity> getCommissionQuestionDetailsTemp(@PathVariable(name = "commissionId") Long commissionId, @PathVariable(name = "isActive") Boolean isActive) {
        return commissionService.getCommissionQuestionDetailsTemp(commissionId, isActive);
    }
    
    @GetMapping("/notes/temp/{commissionId}/{isActive}")
    public List<CommissionNotesTempEntity> getCommissionNotesTemp(@PathVariable(name = "commissionId") Long commissionId, @PathVariable(name = "isActive") Boolean isActive) {
        return commissionService.getCommissionNotesTemp(commissionId, isActive);
    }
    
    @PostMapping("/save")
    public CommissionEntity saveCommission(@RequestBody CommissionEntity commissionEntity) {
        return commissionService.saveCommission(commissionEntity);
    }
    
    @PostMapping("/questiondetails/save")
    public List<CommissionQuestionDetailsEntity> saveCommissionQuestionDetails