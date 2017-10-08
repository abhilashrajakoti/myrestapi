package com.abhilash.myrestapi.myrestapi.database;

import java.util.HashMap;
import java.util.Map;

import com.abhilash.myrestapi.myrestapi.model.Message;
import com.abhilash.myrestapi.myrestapi.model.Profile;

public class DataBaseClass {

	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<Long, Profile> profiles = new HashMap<Long, Profile>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
}
