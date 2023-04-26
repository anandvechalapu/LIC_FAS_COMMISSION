package com.lic.epgs.commission.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commission")
public class CommissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commissionId;
    private String commissionName;
    private String commissionStatus;
    private String commissionType;
    private String commissionNotes;
    private String commissionQuestionDetails;

    public Long getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Long commissionId) {
        this.commissionId = commissionId;
    }

    public String getCommissionName() {
        return commissionName;
    }

    public void setCommissionName(String commissionName) {
        this.commissionName = commissionName;
    }

    public String getCommissionStatus() {
        return commissionStatus;
    }

    public void setCommissionStatus(String commissionStatus) {
        this.commissionStatus = commissionStatus;
    }

    public String getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }

    public String getCommissionNotes() {
        return commissionNotes;
    }

    public void setCommissionNotes(String commissionNotes) {
        this.commissionNotes = commissionNotes;
    }

    public String getCommissionQuestionDetails() {
        return commissionQuestionDetails;
    }

    public void setCommissionQuestionDetails(String commissionQuestionDetails) {
        this.commissionQuestionDetails = commissionQuestionDetails;
    }

}

package com.lic.epgs.commission.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commission_temp")
public class CommissionTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commissionId;
    private String commissionTempStatus;

    public Long getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Long commissionId) {
        this.commissionId = commissionId;
    }

    public String getCommissionTempStatus() {
        return commissionTempStatus;
    }

    public void setCommissionTempStatus(String commissionTempStatus) {
        this.commissionTempStatus = commissionTempStatus;
    }
}