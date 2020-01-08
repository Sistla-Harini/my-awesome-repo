package com.deloitte.fourthmvn.firstspringapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component*/

public class Person 
{
  int ssn;
  String name;
 /* @Autowired
  @Qualifier("add2")*/
  Address address;
  public Person() {}
  public Person(Address address) {this.address=address;}
  public Person(int ssn, String name, Address address) {
	
	this.ssn = ssn;
	this.name = name;
	this.address = address;
}
public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
  
}
