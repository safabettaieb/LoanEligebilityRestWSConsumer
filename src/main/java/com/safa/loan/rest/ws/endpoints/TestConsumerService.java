package com.safa.loan.rest.ws.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safa.loan.rest.ws.payload.requests.CustomerRequest;
import com.safa.loan.rest.ws.payload.responses.WsResponse;
import com.safa.loan.rest.ws.services.ConsumerService;

@RestController
public class TestConsumerService {

	@Autowired
	ConsumerService service;

	@GetMapping("/")
	public WsResponse testConsumer(/* @RequestBody CustomerRequest request */) {
		CustomerRequest request = CustomerRequest.builder().
				customerName("SAFA")
				.age(30)
				.cibilScore(600)
				.yearlyIncome(30000)
				.employmentMode("FULL TIME")
				.build();
		return service.consume(request);
	}

	@GetMapping("/feign") 
	public WsResponse testconsumeByFeignService() {
		CustomerRequest request = CustomerRequest.builder()
				 .customerName("BETTAIEB")
				 .age(25)
				 .cibilScore(500)
				 .yearlyIncome(30000)
				 .employmentMode("FULL TIME")
				 .build();
       return service.consumeByFeignService(request);
}
}