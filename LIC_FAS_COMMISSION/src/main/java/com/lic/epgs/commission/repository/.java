import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionDetailsDto;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CommissionRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommissionRepository.class);

    @PersistenceContext
    private EntityManager em;

    @Autowired
    public CommissionRepository(){}

    public CommonCommissionDto loadCommissionDetails(){
        CommonCommissionDto commonCommissionDto = new CommonCommissionDto();
        List<CommissionDetailsDto> commissionDetailsDtoList = new ArrayList<>();
        try{
            commissionDetailsDtoList = em.createQuery("SELECT c FROM CommissionDetailsDto c WHERE c.isActive = false").getResultList();
            if(commissionDetailsDtoList.size() > 0){
                commonCommissionDto.setTransactionStatus("SUCCESS");
                commonCommissionDto.setTransactionMessage("ALLOW");
            } else {
                commonCommissionDto.setTransactionStatus("WARN");
                commonCommissionDto.setTransactionMessage("DENY");
            }
            commonCommissionDto.setCommissionDetailsDtoList(commissionDetailsDtoList);
            LOGGER.info("Successfully loaded commission details.");
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