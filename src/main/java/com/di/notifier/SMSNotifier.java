package com.di.notifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("SMS")
@Component
public class SMSNotifier implements Notifier {

	@Override
	public void sendMessage(String message) {
		System.out.println("SMS => "+message);
	}
}
