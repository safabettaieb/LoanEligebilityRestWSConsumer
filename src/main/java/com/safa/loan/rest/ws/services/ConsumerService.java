package com.safa.loan.rest.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.safa.loan.rest.ws.payload.requests.CustomerRequest;
import com.safa.loan.rest.ws.payload.responses.WsResponse;

@Service
public class ConsumerService {
	
	@Autowired
	private RestTemplate restTemplate;
	// port Rest WS : LoanEligebilityEndPoint
	private static final String URL ="http://localhost:8081/ws/loan/status";
	
	public WsResponse consume(CustomerRequest request) {
		WsResponse response = restTemplate.getForObject(URL, WsResponse.class);
		return response;
	}

}
