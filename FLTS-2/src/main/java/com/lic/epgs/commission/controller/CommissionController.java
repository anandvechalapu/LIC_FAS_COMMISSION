package com.lic.epgs.commission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.service.CommissionService;

@RestController
public class CommissionController {

    @Autowired
    private CommissionService commissionService;

    @PostMapping("/updateCommissionTempStatus")
    public void updateCommissionTempStatus(@RequestParam Long commissionId, @RequestParam String status) {
        commissionService.updateCommissionTempStatus(commissionId, status);
    }

    @PostMapping("/updateCommissionStatus")
    public void updateCommissionStatus(@RequestParam Long commissionId, @RequestParam String status) {
        commissionService.updateCommissionStatus(commissionId, status);
    }

    @PostMapping("/addCommissionNotes")
    public void addCommissionNotes(@RequestParam Long commissionId, @RequestParam String notes) {
        commissionService.addCommissionNotes(commissionId, notes);
    }

    @PostMapping("/addCommissionQuestionDetails")
    public void addCommissionQuestionDetails(@RequestParam Long commissionId, @RequestParam String questionDetails) {
        commissionService.addCommissionQuestionDetails(commissionId, questionDetails);
    }

    @PostMapping("/handleConstraintViolation")
    public void handleConstraintViolation(@RequestParam Long commissionId) {
        commissionService.handleConstraintViolation(commissionId);
    }

    @PostMapping("/handlePersistenceException")
    public void handlePersistenceException(@RequestParam Long commissionId) {
        commissionService.handlePersistenceException(commissionId);
    }

}