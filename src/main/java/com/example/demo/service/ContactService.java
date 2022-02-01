package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ContactRepository;
import com.example.demo.entity.Contact;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;
	@Transactional
	public void saveContact(Contact contact) {
		contactRepository.save(contact);
	}
}
