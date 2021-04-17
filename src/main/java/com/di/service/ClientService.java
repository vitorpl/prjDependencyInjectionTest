package com.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.di.model.Client;
import com.di.notifier.Notifier;

@Service
public class ClientService {

	@Qualifier("EMAIL") //SMS / EMAIL
	@Autowired
	private Notifier notifier;
	
	public void activateClient(Client client) {
		client.setActive(true);
		notifier.sendMessage("Hello "+client.getName() + " your account was activated.");		
	}
	
	public void disableClient(Client client) {
		client.setActive(false);
		notifier.sendMessage("Hello "+client.getName() + " your account was disabled.");		
	}
}
