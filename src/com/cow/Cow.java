package com.cow;

import com.zoo.Zoo;

public class Cow extends Zoo {

	public Cow(String name, int age, String color) {
		super(name, age, color);
	}

	public void say() {
		System.out.println("Корова " + getName() + " мычит Мууу");
		System.out.println (" Её цвет " + getColor());
	}

}
