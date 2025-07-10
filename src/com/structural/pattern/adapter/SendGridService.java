package com.structural.pattern.adapter;

public class SendGridService {

	public void sendEmail(String recipient, String title,String content) {
		System.out.println("Sening mail via send grid to: "+ recipient);
		System.out.println("Subject: "+ title);
		System.out.println("Body: "+ content);
	}
}
