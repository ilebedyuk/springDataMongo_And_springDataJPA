package com.manishchhabra.blog.service;

import com.manishchhabra.blog.dao.repository.UserRepository;
import com.manishchhabra.blog.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("personService")
public class PersonService {

	@Autowired
	private UserRepository userRepository;

	public PersonService() {}

	public void addPerson(Person person) {
		userRepository.save(person);
	}

	public List<Person> listPerson() {
		return userRepository.findAll();
	}

	public void deletePerson(String name) {
		Person person = userRepository.findByName(name);
		userRepository.delete(person);
	}
}
