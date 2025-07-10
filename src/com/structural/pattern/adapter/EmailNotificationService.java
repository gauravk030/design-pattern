package com.structural.pattern.adapter;

/**
 *  Imagin Now we will discuss adapter design pattern where we will see it's a structural design pattern that allows
	objects with incompatible interfaces to work together. 
	so just like we use a real life adapter so that we can plug in our mobile or laptop into a socket or into an interface that is 
	incompatible with our device. 
	So this adapter solves the problem of providing compatibility between two objects which are incompatible to work together.
	
	Scenario
	let's see a scenario where we are building a e-commerce application that needs to send email notification to its customers.
	So currently we are using a in our in house email notification service.
	But later on, we realize that using a third party email service like SendGrid is cheaper, and we want
	to shift our code from using this notification service to using SendGrid.
	
	Problem 
	But the problem that may arise is that the SendGrid interface might have different methods that we need
	to call to send emails. So in this case we can easily use adapter pattern to solve this problem.
	
	E.g: 
	let's say our email notification service has a method called as send. And it takes in a bunch of parameters, whereas the SendGrid service 
	has a method called as send email.And it also takes in a bunch of parameters.Now these two methods are different.
	
	So in our client, wherever we are calling this method, let's say this is called at multiple places.So what will happen.
	We have to change lot of code so that we can use the Sendgrid's email method.
	But instead of changing lot of code, what we can do is we can use adapter pattern to solve this kind of a problem.
 */


/*Legecy system*/
public class EmailNotificationService implements NotificationService {

	@Override
	public void send(String to, String subject,String body) {
		System.out.println("Sening mail To: "+to);
		System.out.println("Subject: "+subject);
		System.out.println("Body: "+body);
	}

}
