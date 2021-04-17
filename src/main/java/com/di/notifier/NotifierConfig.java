package com.di.notifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//The @Configuration is used to configure a bean when it requires some especial parameters like smtp on example.
@Configuration
public class NotifierConfig {
	
	@Value("${di.email.smtp}")
	private String smtp;

	@Bean
	public EmailNotifier emailNotifier() {
		EmailNotifier emailNotifier = new EmailNotifier(smtp);
		
		return emailNotifier;
	}
	
}
