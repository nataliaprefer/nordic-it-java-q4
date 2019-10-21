package com.medved;

import com.zoo.Zoo;

public class Medved extends Zoo {

	public Medved(String name, int age, String color) {
		super(name, age, color);
	}

	public void say() {
		System.out.println("Медведь " + getName() + " ревёт ЭЭЭЭ");
		System.out.println (" Его цвет " + getColor());
	}
}
