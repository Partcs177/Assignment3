package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contact;

import com.example.demo.service.ContactService;

@RestController
public class ContactController {
	@Autowired
	ContactService contactService;
	@PostMapping("/contact") // create
	@ResponseStatus(code = HttpStatus.CREATED)
	void createContact(@RequestBody @Valid Contact contact) {
		contactService.saveContact(contact);
	}
}
