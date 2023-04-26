package com.lic.epgs.common.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.model.CommonControllerCommonStatus;
import com.lic.epgs.common.model.ProductVariantDetails;
import com.lic.epgs.common.dtos.ProductVariantDetailsDto;
import com.lic.epgs.common.service.CommonControllerCommonStatusService;
import com.lic.epgs.common.service.CommonControllerGerVariantMappingService;

@RestController
@RequestMapping("/common")
public class CommonController {
	
	Logger logger = LoggerFactory.getLogger(CommonController.class);
	
	@Autowired
	private CommonControllerCommonStatusService commonControllerCommonStatusService;
	
	@Autowired
	private CommonControllerGerVariantMappingService commonControllerGerVariantMappingService;
	
	@GetMapping("/status/{isActive}")
    public ResponseEntity<List<CommonControllerCommonStatus>> getAllStatus(@PathVariable String isActive) {
        logger.info("Start getAllStatus method");
        List<CommonControllerCommonStatus> statusList = commonControllerCommonStatusService.findByIsActive(isActive);
        logger.info("End getAllStatus method");
        return new ResponseEntity<>(statusList, HttpStatus.OK);
    }
	
	@GetMapping("/variant/{sourceVariant}")
    public ResponseEntity<List<ProductVariantDetailsDto>> getProductVariantDetails(@PathVariable String sourceVariant) {
        logger.info("Start getProductVariantDetails method");
        List<ProductVariantDetailsDto> details = commonControllerGerVariantMappingService.getProductVariantDetails(sourceVariant);
        logger.info("End getProductVariantDetails method");
        return new ResponseEntity<>(details, HttpStatus.OK);
    }
}