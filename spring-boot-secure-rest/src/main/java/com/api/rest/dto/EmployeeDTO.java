package com.api.rest.dto;

public class EmployeeDTO {

	private Integer employeeId;

	private String employeeFirstName;

	private String employeeLastName;

	private String employeeGender;

	private String employeePhone;

	private Boolean isNewEmployee;


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

	public Boolean getIsNewEmployee() {
		return isNewEmployee;
	}

	public void setIsNewEmployee(Boolean isNewEmployee) {
		this.isNewEmployee = isNewEmployee;
	}
}
