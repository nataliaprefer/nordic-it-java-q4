package com.sheep;

import com.zoo.Zoo;

public class Sheep extends Zoo {

	public Sheep(String name, int age, String color) {
		super(name, age, color);
	}

	public void say() {
		System.out.println("Овечка " + getName() + " блеет Беее");
		System.out.println(" Её цвет " + getColor());
	}

}
