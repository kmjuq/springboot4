package com.example.demo.infra.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("PERSON")
public class PersonDO {

	@Id
	private Long id;
	private String firstname;
	private String lastname;

	// … getters and setters omitted
}