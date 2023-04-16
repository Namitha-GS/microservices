package com.contact_service.service;

import java.util.List;

import com.contact_service.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContactsOfUser(Long userId);

}
