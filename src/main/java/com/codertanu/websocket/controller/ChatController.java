package com.codertanu.websocket.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.codertanu.websocket.model.ChatMessage;

@Controller
public class ChatController {
	
	@MessageMapping("/sendMessage")
	@SendTo("/topic/messages")
	public ChatMessage sendMessage(ChatMessage message) {
		if (message.getTimestamp() == null) {
	        long timestamp = System.currentTimeMillis(); // Current time in milliseconds
	        message.setTimestamp(timestamp);
	    }
		return message;
	}

}
