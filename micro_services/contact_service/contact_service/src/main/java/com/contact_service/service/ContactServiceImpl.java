package com.contact_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact_service.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> list = List.of(
			   new Contact(1L,"AA","aa@gmail.com",101L),
			   new Contact(2L,"BB","bb@gmail.com",101L),
			   new Contact(3L,"CC","cc@gmail.com",102L),
			   new Contact(4L,"DD","dd@gmail.com",103L)
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).toList();
	}

}
