package com.CMS.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Clg_Student")
public class ClgUser {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String firstName,lastName,email,address,course;
	private long phone,registration;
	
}
