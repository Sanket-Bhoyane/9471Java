package com.FirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	      objB.setMessage("I'm object B");
	      objB.getMessage();
	      
	      HelloWorld objC = (HelloWorld) context.getBean("helloWorld");
	    
	      objC.setMessage("Hello World");
	      objC.getMessage();
	      }}


