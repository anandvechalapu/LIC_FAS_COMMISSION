package com.lic.epgs.commission.repository;

import com.lic.epgs.commision.dto.CommonCommissionDto;
import com.lic.epgs.commision.dto.CommissionDetailsDto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.PersistenceException;
import javax.validation.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CommissionRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommissionRepository.class);

    public CommonCommissionDto loadCommissionDetails() {
        CommonCommissionDto response = new CommonCommissionDto();
        List<CommissionDetailsDto> commissionDetailsList = new ArrayList<>();

        try {
            // Retrieve all commission details from the database where isActive is false.
            // Add retrieved details to commissionDetailsList
            response.setTransactionStatus("SUCCESS");
            response.setTransactionMessage("OK");
            response.setCommissionDetailsList(commissionDetailsList);
        } catch (ConstraintViolationException e) {
            LOGGER.info("Exception while retrieving commission details: {}", e.getMessage());
            response.setTransactionStatus("ERROR");
            response.setTransactionMessage("FAIL");
        } catch (PersistenceException e) {
            LOGGER.info("Exception while retrieving commission details: {}", e.getMessage());
            response.setTransactionStatus("ERROR");
            response.setTransactionMessage("INVALIDREQUEST");
        }

        if (commissionDetailsList.isEmpty()) {
            response.setTransactionStatus("WARN");
            response.setTransactionMessage("DENY");
        }

        return response;
    }
}