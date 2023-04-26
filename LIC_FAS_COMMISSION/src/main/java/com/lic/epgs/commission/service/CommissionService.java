package com.lic.epgs.commission.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionDetailsDto;
import com.lic.epgs.commission.repository.CommissionRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommissionService.class);

    @Autowired
    private CommissionRepository commissionRepository;

    public CommonCommissionDto loadCommissionDetails(){
        CommonCommissionDto commonCommissionDto = new CommonCommissionDto();
        try{
            commonCommissionDto = commissionRepository.loadCommissionDetails();
        } catch (ConstraintViolationException cve){
            commonCommissionDto.setTransactionStatus("ERROR");
            commonCommissionDto.setTransactionMessage("FAIL");
            LOGGER.error("ConstraintViolationException while loading commission details.");
        } catch (PersistenceException pe){
            commonCommissionDto.setTransactionStatus("ERROR");
            commonCommissionDto.setTransactionMessage("INVALIDREQUEST");
            LOGGER.error("PersistenceException while loading commission details.");
        }
        return commonCommissionDto;
    }

}