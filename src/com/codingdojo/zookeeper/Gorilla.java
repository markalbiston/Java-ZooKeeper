package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {
		// TODO Auto-generated constructor stub
	}
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("Gorilla has thrown feces at humans again");
	}
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("Gorilla eats tons of bananas");
	}
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("Gorilla has climbed a tree");
	}

}
