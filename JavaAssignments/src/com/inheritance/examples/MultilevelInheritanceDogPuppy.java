package com.inheritance.examples;

public class MultilevelInheritanceDogPuppy extends MultilevelInheritanceDog {

	@Override
	public void eat() {
		super.eat();
		System.out.println("Dog puppy eating");
	}
}
