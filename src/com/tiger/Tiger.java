package com.tiger;

import com.zoo.Zoo;

public class Tiger extends Zoo {

	public Tiger(String name, int age, String color) {
		super(name, age, color);
	}

	public void say() {
		System.out.println("Тигр " + getName() + " рычит РРРР");
		System.out.println (" Его цвет " + getColor());
	}

}
