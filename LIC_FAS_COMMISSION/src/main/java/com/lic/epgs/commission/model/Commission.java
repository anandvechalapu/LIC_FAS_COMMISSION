package com.lic.epgs.commission.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commissions")
public class Commission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commission_id")
    private Long commissionId;

    @Column(name = "commission_details")
    private String commissionDetails;

    @Column(name = "commission_notes")
    private String commissionNotes;

    @Column(name = "commission_questions")
    private String commissionQuestions;

    @Column(name = "transaction_message")
    private String transactionMessage;

    @Column(name = "transaction_status")
    private String transactionStatus;

    public Long getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Long commissionId) {
        this.commissionId = commissionId;
    }

    public String getCommissionDetails() {
        return commissionDetails;
    }

    public void setCommissionDetails(String commissionDetails) {
        this.commissionDetails = commissionDetails;
    }

    public String getCommissionNotes() {
        return commissionNotes;
    }

    public void setCommissionNotes(String commissionNotes) {
        this.commissionNotes = commissionNotes;
    }

    public String getCommissionQuestions() {
        return commissionQuestions;
    }

    public void setCommissionQuestions(String commissionQuestions) {
        this.commissionQuestions = commissionQuestions;
    }

    public String getTransactionMessage() {
        return transactionMessage;
    }

    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

}