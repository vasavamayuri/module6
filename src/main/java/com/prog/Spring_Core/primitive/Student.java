package com.prog.Spring_Core.primitive; // setter injection primiive datstypyi

public class Student
{

	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Setter injection : id");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Setter injection : name");
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		System.out.println("Setter injection : address");
	}
	
	
	
	
}
