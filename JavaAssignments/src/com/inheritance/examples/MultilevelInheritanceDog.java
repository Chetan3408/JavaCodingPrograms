package com.inheritance.examples;

public class MultilevelInheritanceDog extends MultilevelInheritanceAnimal {

	@Override
	public void eat() {
		super.eat();
		System.out.println("Dog is eating");
	}
}
