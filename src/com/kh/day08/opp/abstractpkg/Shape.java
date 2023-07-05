package com.kh.day08.opp.abstractpkg;

abstract class Line extends Shape {
	// The type Line must implement the inherited abstract method Shape.draw()
	// =>
	@Override
	public void draw() {
		
	}

}

public abstract class Shape {
	public Shape() {
	}

	public void paint() {
	}

	abstract public void draw();

	// Abstract methods do not specify a body =>{}없애
	// The abstract method draw in type Shape can only be defined by an abstract
	// class =>class에 Abstract 붙여

}
