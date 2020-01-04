package com.del.courses.entity;

public class Courses 
{
int cid;
String cname;
int cdura;
int cfee;
public Courses() {}
public Courses(int cid, String cname, int cdura, int cfee) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cdura = cdura;
	this.cfee = cfee;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getCdura() {
	return cdura;
}
public void setCdura(int cdura) {
	this.cdura = cdura;
}
public int getCfee() {
	return cfee;
}
public void setCfee(int cfee) {
	this.cfee = cfee;
}

}
