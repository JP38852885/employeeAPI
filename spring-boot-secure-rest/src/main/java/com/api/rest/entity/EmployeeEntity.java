package com.api.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Naga
 * @since 03 02 22
 */

@Entity
@Table(name = "employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Size(max = 5, min = 1, message = "employee id must be equal or less than '{max}'")
	@Column(name = "emp_id", updatable = true, nullable = false)
	private Integer employeeId;

	@Size(max = 10, min = 2, message = "employee first name must be equal or less than '{max}'")
	@Column(name = "emp_firstname", updatable = true, nullable = false)
	private String employeeFirstName;

	@Size(max = 10, min = 2, message = "employee last name must be equal or less than '{max}'")
	@Column(name = "emp_lastname", updatable = true, nullable = true)
	private String employeeLastName;

	@Size(max = 6, min = 4, message = "employee gender must be equal or less than '{max}'")
	@Column(name = "emp_gender", updatable = true, nullable = false)
	private String employeeGender;

	@Size(max = 10, min = 10, message = "employee phone must be equal or less than '{max}'")
	@Column(name = "emp_phone", unique = true, nullable = false)
	private String employeePhone;

	@Column(name = "isNewEmployee", unique = true, nullable = false)
	private Boolean isNewEmployee;

	public Boolean getIsNewEmployee() {
		return isNewEmployee;
	}

	public void setIsNewEmployee(boolean isNewEmployee) {
		this.isNewEmployee = isNewEmployee;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public String getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

}
