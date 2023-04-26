package com.lic.epgs.commission.controller;

import com.lic.epgs.commision.dto.CommonCommissionDto;
import com.lic.epgs.commission.service.CommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    @Autowired
    private CommissionService commissionService;

    @GetMapping
    public CommonCommissionDto getCommissionDetails() {
        return commissionService.getCommissionDetails();
    }

}