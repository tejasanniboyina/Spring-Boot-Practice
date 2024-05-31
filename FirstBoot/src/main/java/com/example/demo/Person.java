package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private int pid;
	private String pname;
	
	public Person() {
		System.out.println("Object created");
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void show() {
		System.out.println("Showing.......");
	}
}
