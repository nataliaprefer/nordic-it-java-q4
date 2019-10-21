package com.zoo;

public class Zoo {
	private String name;
	private int age;
	private String color;

	public Zoo(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public void say() {
	}
}
