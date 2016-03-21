package com.manishchhabra.blog.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
@Document(collection = "users")
public class Person {

	@javax.persistence.Transient
	@org.springframework.data.annotation.Id
	private String mongoId;

	@org.springframework.data.annotation.Transient
	@javax.persistence.Id
	@SequenceGenerator(name="seq", sequenceName="PERSON_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person() {}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMongoId() {
		return mongoId;
	}

	public void setMongoId(String mongoId) {
		this.mongoId = mongoId;
	}
}
