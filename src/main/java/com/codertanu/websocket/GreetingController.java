//package com.codertanu.websocket;
//
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class GreetingController {
//	
//	
//	@MessageMapping("/hello")
//	@SendTo("/topic/greetings")
//	public  Greeting greeting(HelloMessage helloMessage) {
//		
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		Greeting greet = new Greeting();
//		greet.setContent("hello, Tanu");
//		return greet;
//		
//	}
//
//}
