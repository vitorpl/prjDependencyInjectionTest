package com.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.di.model.Client;
import com.di.service.ClientService;

@Controller
public class MainController {

	@Autowired
	ClientService clientService;
	
	@Autowired
	Client client;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		//Client client = new Client();
		client.setName("Vitor");
		client.setEmail("vitor.lazarotto@gmail.com");
		
		clientService.activateClient(client);
		
		clientService.disableClient(client);
		
		
		return "ok";
	}
	
}
