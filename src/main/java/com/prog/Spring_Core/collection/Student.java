package com.prog.Spring_Core.collection;
//Setter injction colloection type
import java.util.List;
import java.util.Set;
import java.util.Map;



public class Student {
	
	private String name;
	   
	private List<String>address;
	
	private Set<String>phone;
	private Map<String,String> courses;
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phone=" + phone + ", courses=" + courses + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Set<String> getPhone() {
		return phone;
	}
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	public Map<String,String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
	
	

}
