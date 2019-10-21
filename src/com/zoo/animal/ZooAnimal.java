package com.zoo.animal;

import com.cow.Cow;
import com.medved.Medved;
import com.monkey.Monkey;
import com.sheep.Sheep;
import com.tiger.Tiger;

public class ZooAnimal {

	public static void main(String[] args){ 
		var tiger = new Tiger("Шархан", 5, "желтый");
		tiger.say();
		System.out.println("Возраст тигра " + tiger.getAge());

		var medved = new Medved("Балу", 7, "бурый");
		medved.say();
		System.out.println("Возраст медведя " + medved.getAge());

		var cow = new Cow("Буренка", 8, "рыжий");
		cow.say();
		System.out.println("Возраст коровы " + cow.getAge());
		
		var sheep = new Sheep("Долли", 2, "белый");
		sheep.say();
		System.out.println("Возраст овечки " + sheep.getAge());
		
		var monkey = new Monkey("Чи-Чи", 15, "серый");
		monkey.say();
		System.out.println("Возраст обезьяны " + monkey.getAge());
	}

}
