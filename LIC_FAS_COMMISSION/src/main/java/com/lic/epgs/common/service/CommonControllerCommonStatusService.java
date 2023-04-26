package com.lic.epgs.common.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.common.model.CommonControllerCommonStatus;
import com.lic.epgs.common.repository.CommonControllerCommonStatusRepository;

@Service
public class CommonControllerCommonStatusService {

	@Autowired
	private CommonControllerCommonStatusRepository commonControllerCommonStatusRepository;
	
	public List<CommonControllerCommonStatus> findByIsActive(String isActive) {
		return commonControllerCommonStatusRepository.findByIsActive(isActive);
	}
	
	public CommonControllerCommonStatus findByCode(String code) {
		return commonControllerCommonStatusRepository.findByCode(code);
	}
	
	public CommonControllerCommonStatus findByType(String type) {
		return commonControllerCommonStatusRepository.findByType(type);
	}
	
	public CommonControllerCommonStatus findByName(String name) {
		return commonControllerCommonStatusRepository.findByName(name);
	}
	
	public CommonControllerCommonStatus findByIdAndIsActive(Long id, String isActive) {
		return commonControllerCommonStatusRepository.findByIdAndIsActive(id, isActive);
	}
	
	public List<CommonControllerCommonStatus> findAllByIsActive(String isActive) {
		return commonControllerCommonStatusRepository.findAllByIsActive(isActive);
	}
	
}