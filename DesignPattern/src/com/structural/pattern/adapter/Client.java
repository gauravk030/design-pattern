package com.structural.pattern.adapter;

/**
 *  So in our client, wherever we are calling this method, let's say this is called at multiple places.So what will happen.
	We have to change lot of code so that we can use the Sendgrid's email method.
	But instead of changing lot of code, what we can do is we can use adapter pattern to solve this kind of a problem.
	
	Problem: when two system or component have incompatible interfaces,they cannot work together directly.
	Solution: The adapter Pattern bridges the gap by converting the interface of one class into another that the client expects
	
	Real-world analogy:
	A power adapter that allows a device with a US power plug to fit and work with European power socket 
	
	Examples from the software world.So they are pretty much used in frameworks like GUI frameworks where we want to convert legacy 
	code into newer formats.Then in Java, the input stream reader works as an adapter to convert input stream to a reader.
 
 *
 * Benefits:
 * 1. Re-usablity : we reuse the existing even when interface is not compatible.
 * 2. Flexibility : helps integrate classes from different libraries or system that were not designed to work together.
 * 3. Decoupling : Decouple the client from the specific implementation of the adaptee.
 */
public class Client {

	public static void main(String[] args) {
		NotificationService notificationService1 = new EmailNotificationService();
		notificationService1.send("abc@gmail.com", "Order details", "Order has beeen dispatched to mentioned address.");
		
		//This leads problem bec SendGridService does not implement the NoticationService interface
		//NotificationService notificationService2 = new SendGridService();
		
		NotificationService notificationService2 = new SendGridAdapter(new SendGridService());
		notificationService2.send("abc@gmail.com", "Order details", "Order has beeen dispatched to mentioned address.");
	}

}

