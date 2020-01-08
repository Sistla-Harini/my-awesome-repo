package com.deloitte.fourthmvn.firstspringapp.beans;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

public class Wisher
{
	String message;
  public Wisher() {System.out.println("Bean is created");}
  public void setMessage(String message)
  {
	  this.message=message;
  }
  public String getMessage()
  {
	  return message;
  }
  public void initWisher()
  {
	  System.out.println("Bean is Initialized");
  
  }
  public void destWisher()
  {
	  System.out.println("Bean is about to be destroyed");
  }
}
