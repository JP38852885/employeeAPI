package com.api.rest.controller;

import java.util.List;

import javax.validation.Valid;

import com.api.rest.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.api.rest.common.messages.BaseResponse;
import com.api.rest.service.EmployeeService;

@Validated
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/find")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
		List<EmployeeDTO> list = employeeService.findEmployeeList();
		return new ResponseEntity<List<EmployeeDTO>>(list, HttpStatus.OK);
	}

	@GetMapping(value = "/find/by-id")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@RequestParam Long id) {
		EmployeeDTO list = employeeService.findByEmployeeId(id);
		return new ResponseEntity<EmployeeDTO>(list, HttpStatus.OK);
	}

	@PostMapping(value = { "/add" })
	public ResponseEntity<BaseResponse> createEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
		BaseResponse response = employeeService.createEmployee(employeeDTO);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	@PutMapping(value = {  "/update" })
	public ResponseEntity<BaseResponse> UpdateEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
		BaseResponse response = employeeService.UpdateEmployee(employeeDTO);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<BaseResponse> deleteEmployeeById(@PathVariable("id") Long id) {
		BaseResponse response = employeeService.deleteEmployeeById(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
