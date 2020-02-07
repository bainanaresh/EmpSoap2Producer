package com.baina.spring.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.baina.spring.soap.api.empreg.Employee;
import com.baina.spring.soap.api.empreg.EmployeeDetails;
import com.baina.spring.soap.api.service.EmployeeRegService;
@Endpoint
public class EmployeeRegisterEndpoint {

	private static final String NAMESPACE = "http://www.baina.com/spring/soap/api/empreg";
	@Autowired
	private EmployeeRegService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "Employee")
	@ResponsePayload
	public EmployeeDetails getLoanStatus(@RequestPayload Employee empReq) {
		return service.regEmp(empReq);
	}

}
