package com.safa.loan.rest.ws.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.safa.loan.rest.ws.payload.requests.CustomerRequest;
import com.safa.loan.rest.ws.payload.responses.WsResponse;

@FeignClient(url = "localhost:8081" , value = "localhost:8081")
public interface ConsumerByFeign {
	
	//endpoint server
	@PostMapping("/ws/loan/status")
	public WsResponse consumeByFeign(@RequestBody CustomerRequest request) ;
}
