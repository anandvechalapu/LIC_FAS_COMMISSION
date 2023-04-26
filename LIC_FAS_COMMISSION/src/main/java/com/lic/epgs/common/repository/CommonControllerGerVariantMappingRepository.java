package com.lic.epgs.common.repository;

import com.lic.epgs.dtos.ProductVariantDetailsDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonControllerGerVariantMappingRepository extends JpaRepository<ProductVariantDetailsDto, Long> {

    Logger logger = LoggerFactory.getLogger(CommonControllerGerVariantMappingRepository.class);

    @Query("SELECT new com.lic.epgs.dtos.ProductVariantDetailsDto(pv.variantId, pv.variantName, pv.productId, pv.productName, pv.productCode, pv.isLeadVariant, pv.isActive, pv.createdOn, pv.createdBy, pv.modifiedOn, pv.modifiedBy) FROM ProductVariantDetailsDto pv WHERE pv.sourceVariant = ?1")
    List<ProductVariantDetailsDto> getProductVariantDetailsBySourceVariant(String sourceVariant);

    default List<ProductVariantDetailsDto> getProductVariantDetails(String sourceVariant) {
        logger.info("Start getProductVariantDetails method");
        List<ProductVariantDetailsDto> details = getProductVariantDetailsBySourceVariant(sourceVariant);
        logger.info("End getProductVariantDetails method");
        return details;
    }

}