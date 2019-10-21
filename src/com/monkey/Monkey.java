package com.monkey;

import com.zoo.Zoo;

public class Monkey extends Zoo {

	public Monkey(String name, int age, String color) {
		super(name, age, color);

	}

	public void say() {
		System.out.println("Обезьяна " + getName() + " говорит Уауа" );
		System.out.println (" Её цвет " + getColor());
	}
}
