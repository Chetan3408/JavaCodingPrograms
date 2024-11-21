package com.inheritance.examples;

public class Main {

	public static void main(String[] args) {

//		SingleInheritanceParent s = new SingleInheritanceChild();
//		s.Propertie();
//
//		MultilevelInheritanceDogPuppy dog = new MultilevelInheritanceDogPuppy();
//		dog.eat();

		HierachicalAnimal a = new HierachicalAnimal();
		HierachicalDog d = new HierachicalDog();
		HierachicalCat c = new HierachicalCat();
		HierachicalMouse m = new HierachicalMouse();
		a.eat();
		d.breed();
		c.sound();
		m.size();

	}
}
