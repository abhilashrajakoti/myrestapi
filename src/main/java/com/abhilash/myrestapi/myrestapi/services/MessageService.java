package com.abhilash.myrestapi.myrestapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.abhilash.myrestapi.myrestapi.database.DataBaseClass;
import com.abhilash.myrestapi.myrestapi.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DataBaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1,"Hello world","Abhilash"));
		messages.put(2L, new Message(2,"Hello jersey","Abhilash"));
	}

	public List<Message> getAllMessages() {

		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(Long id) {
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if(message.getId()<=0) {
			return null;
		}
		messages.put(message.getId(),message);
		return message;
	}
	
	public Message removeMessage(Long id) {
		return messages.remove(id);
	}

}
