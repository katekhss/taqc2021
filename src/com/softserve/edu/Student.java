package com.softserve.edu;

public class Student {
	private String lastName;
	private String firstName;
	private int age;

	public Student(String lastName, String firstName, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if ((firstName != null) && !firstName.isEmpty()) {
			this.firstName = firstName;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if ((age > 0) && (age < 150)) {
			this.age = age;
		}
	}

	@Override
	public String toString() {
		return "Student lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "";
	}
	
	public void print() {
		System.out.print("asd");
	}
	
	public void print(String s) {
		System.out.print(s + "asd");
	}

}
