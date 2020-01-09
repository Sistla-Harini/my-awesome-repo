package com.spring.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book 
{
 @Id
 int bid;
 String bname;
 double price;
 String author;
public Book() {}
public Book(int bid, String bname, double price, String author) {
	
	this.bid = bid;
	this.bname = bname;
	this.price = price;
	this.author = author;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}

 
}
