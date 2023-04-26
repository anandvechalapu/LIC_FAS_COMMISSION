package com.lic.epgs.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.common.model.CommonControllerCommonStatus;

public interface CommonControllerCommonStatusRepository extends JpaRepository<CommonControllerCommonStatus, Long> {
	
	public List<CommonControllerCommonStatus> findByIsActive(String isActive);
	
	public CommonControllerCommonStatus findByCode(String code);
	
	public CommonControllerCommonStatus findByType(String type);
	
	public CommonControllerCommonStatus findByName(String name);
	
	public CommonControllerCommonStatus findByIdAndIsActive(Long id, String isActive);
	
	public List<CommonControllerCommonStatus> findAllByIsActive(String isActive);
	
}