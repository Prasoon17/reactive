package com.fms.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table("answers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answers {
	@Id
	private Long id;
	
	@Column("name")
	private String name;
	
	@Column("q_id")

	private Long questionId;


}
