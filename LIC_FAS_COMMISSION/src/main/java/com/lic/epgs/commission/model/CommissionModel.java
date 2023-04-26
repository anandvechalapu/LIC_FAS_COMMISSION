package com.lic.epgs.commission.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CommissionModel {

	@Id
	private Long commissionId;
	private String status;

	public Long getCommissionId() {
		return commissionId;
	}

	public void setCommissionId(Long commissionId) {
		this.commissionId = commissionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}