package com.lic.epgs.commission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.entity.CommissionDetails;
import com.lic.epgs.commission.service.CommissionDetailsService;

@RestController
@RequestMapping("/commission")
public class CommissionDetailsController {

    @Autowired
    private CommissionDetailsService commissionDetailsService;

    @PostMapping("/save")
    public CommissionDetails saveCommissionDetails(@RequestBody CommissionDetails commissionDetails) {
        return commissionDetailsService.saveCommissionDetails(commissionDetails);
    }

    @GetMapping("/get")
    public List<CommissionDetails> getAllCommissionDetails() {
        return commissionDetailsService.getAllCommissionDetails();
    }
}