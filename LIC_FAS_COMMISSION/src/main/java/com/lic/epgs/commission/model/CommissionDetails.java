package com.lic.epgs.commission.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommissionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private double commissionAmount;
    private double commissionPercentage;
    private boolean isActive;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(double commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

}