package com.jmk.message.sender.impl;

import com.jmk.message.model.Message;
import com.jmk.message.sender.MessageSender;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderImpl implements MessageSender {

	@Override
	public String sendMessage(Message message) {
		return "Message Sent";
	}

}
