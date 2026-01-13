package com.example.demo.infra.persist.po;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("person")
public class PersonPO {

	@Id
	private Long id;
	private String firstname;
	private String lastname;

	// … getters and setters omitted
}