package com.safa.loan.rest.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.safa.loan.rest.ws.feigns.ConsumerByFeign;
import com.safa.loan.rest.ws.payload.requests.CustomerRequest;
import com.safa.loan.rest.ws.payload.responses.WsResponse;

@Service
public class ConsumerService {
	
	@Autowired
	private RestTemplate restTemplate;
	// port Rest WS : LoanEligebilityEndPoint
	private static final String URL ="http://localhost:8081/ws/loan/status";
	
	@Autowired
	private ConsumerByFeign feign ; 
	
	public WsResponse consume(CustomerRequest request) {
		WsResponse response = restTemplate.postForObject(URL, request, WsResponse.class);
		return response;
	}
	
	public WsResponse consumeByFeignService(CustomerRequest request) {
		WsResponse response = feign.consumeByFeign(request);
		return response ; 
	}

}
