package com.di.notifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Qualifier("EMAIL")
public class EmailNotifier implements Notifier {

	@Value("${di.email.smtp}")
	private String smtp;
	
	public EmailNotifier(String smtp) {
		this.smtp = smtp;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("EMAIL => "+message+" using: "+this.smtp);
	}
}
