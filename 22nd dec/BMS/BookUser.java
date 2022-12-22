package com.BookStrore.entity;

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
@Table(name="Book_Details")
public class BookUser {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String title,author;
	private double price;

}

