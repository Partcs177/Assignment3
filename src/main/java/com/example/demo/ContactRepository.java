package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Integer> {

}
