package com.lic.epgs.commission.controller;

import com.lic.epgs.commission.dto.CommissionDto;
import com.lic.epgs.commission.dto.CommissionDetailsDto;
import com.lic.epgs.commission.entity.Commission;
import com.lic.epgs.commission.entity.CommissionDetailsEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.entity.CommissionNotesTempEntity;
import com.lic.epgs.commission.service.CommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    @Autowired
    private CommissionService commissionService;

    @PostMapping("/save")
    public Commission saveCommission(@RequestBody CommissionDto commissionDto) {
        return commissionService.saveCommission(commissionDto);
    }

    @PostMapping("/details/save")
    public CommissionDetailsEntity saveCommissionDetails(@RequestBody CommissionDetailsDto commissionDetailsDto) {
        return commissionService.saveCommissionDetails(commissionDetailsDto);
    }

    @PostMapping("/questiondetails/save")
    public List<CommissionQuestionDetailsTempEntity> saveCommissionQuestionDetailsTemp(@RequestBody CommissionQuestionDetailsTempEntity commissionQuestionDetailsTempEntity) {
        return commissionService.saveCommissionQuestionDetailsTemp(commissionQuestionDetailsTempEntity);
    }

    @PostMapping("/notes/save")
    public List<CommissionNotesTempEntity> saveCommissionNotesTemp(@RequestBody CommissionNotesTempEntity commissionNotesTempEntity) {
        return commissionService.saveCommissionNotesTemp(commissionNotesTempEntity);
    }

}