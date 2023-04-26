package com.lic.epgs.commission.service;

import com.lic.epgs.commision.dto.CommonCommissionDto;
import com.lic.epgs.commission.repository.CommissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public CommonCommissionDto getCommissionDetails() {
        return commissionRepository.loadCommissionDetails();
    }

}