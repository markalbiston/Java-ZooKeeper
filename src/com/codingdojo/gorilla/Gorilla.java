package com.codingdojo.gorilla;

import com.codingdojo.zookeeper.Mammal;

public class Gorilla extends Mammal {

	public Gorilla() {
		// TODO Auto-generated constructor stub
	}
	
	public Gorilla throwSomething() {
		System.out.println("Gorilla has thrown feces at humans again");
		this.energyLevel -= 5;
		return this;
	}
	public Gorilla eatBananas() {
		System.out.println("Gorilla has eaten a bunch of bananas");
		this.energyLevel += 10;
		return this;
	}
	public Gorilla climb() {
		System.out.println("Gorilla has climbed a tree");
		this.energyLevel -= 10;
		return this;
	}

}
