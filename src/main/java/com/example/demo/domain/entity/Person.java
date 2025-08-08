package com.example.demo.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Person {

	private Long id;
	private String firstname;
	private String lastname;

	// … getters and setters omitted
}