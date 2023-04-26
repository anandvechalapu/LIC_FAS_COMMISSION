package com.lic.epgs.common.service;

import com.lic.epgs.dtos.ProductVariantDetailsDto;
import com.lic.epgs.common.repository.CommonControllerGerVariantMappingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonControllerGerVariantMappingService {

    Logger logger = LoggerFactory.getLogger(CommonControllerGerVariantMappingService.class);

    @Autowired
    private CommonControllerGerVariantMappingRepository commonControllerGerVariantMappingRepository;

    public List<ProductVariantDetailsDto> getProductVariantDetails(String sourceVariant) {
        logger.info("Start getProductVariantDetails method");
        List<ProductVariantDetailsDto> details = commonControllerGerVariantMappingRepository.getProductVariantDetails(sourceVariant);
        logger.info("End getProductVariantDetails method");
        return details;
    }
}