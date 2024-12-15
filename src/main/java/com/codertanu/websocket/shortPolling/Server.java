package com.codertanu.websocket.shortPolling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server {
	
	int count =0;
	
	@GetMapping("/fetch")
	public String fetchDataFromServer() {	
		return "short plling fetched" + count++;
	}

}
