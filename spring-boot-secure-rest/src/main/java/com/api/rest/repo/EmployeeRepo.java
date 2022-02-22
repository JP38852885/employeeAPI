package com.api.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.entity.EmployeeEntity;

/**
 *
 * @author Naga
 * @since 03 02 22
 */

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {

	public EmployeeEntity findByEmployeeId(Long empId);

}
