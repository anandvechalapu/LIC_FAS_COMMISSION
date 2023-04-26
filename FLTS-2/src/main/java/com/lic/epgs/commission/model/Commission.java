package com.lic.epgs.commission.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commission")
public class Commission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long commissionId;

	private String commissionName;
	private String commissionDescription;
	private boolean isActive;
	
	//getters and setters
	
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
	
	public String getCommissionDescription() {
		return commissionDescription;
	}
	
	public void setCommissionDescription(String commissionDescription) {
		this.commissionDescription = commissionDescription;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
		
}