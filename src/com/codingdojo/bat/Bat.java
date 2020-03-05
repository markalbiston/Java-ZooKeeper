package com.codingdojo.bat;

import com.codingdojo.zookeeper.Mammal;

public class Bat extends Mammal {

	public Bat() {
		// TODO Auto-generated constructor stub
		this.energyLevel = 300;
	}
	public Bat fly() {
		System.out.println("vvvvvvvvvvVVVVVVVVVVWWWWWWWWWWWooooooooOOOOOOSSSSSHHHH");
		this.energyLevel -= 50;
		return this;
	}
	public Bat eatHumans() {
		this.energyLevel += 25;
		return this;
	}
	public Bat attackTown() {
		System.out.println("AAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhh I'm on fire!");
		this.energyLevel -= 100;
		return this;
	}
}
