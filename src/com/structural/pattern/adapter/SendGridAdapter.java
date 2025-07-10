package com.structural.pattern.adapter;

public class SendGridAdapter implements NotificationService {

	private SendGridService sendGridService;
	
	public SendGridAdapter(SendGridService sendGridService) {
		this.sendGridService = sendGridService;
	}
	
	@Override
	public void send(String to, String subject, String body) {
		//Convert the parameters and method call w.r.t SendGridService
		sendGridService.sendEmail(to, subject, body);
	}
}
