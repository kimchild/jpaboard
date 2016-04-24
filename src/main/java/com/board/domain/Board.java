package com.board.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Board {

	@Id
	@GeneratedValue
	private long bo_seq;
	private String bo_title;
	
	
	
	
}
