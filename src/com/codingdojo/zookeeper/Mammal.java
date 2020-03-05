package com.codingdojo.zookeeper;

public class Mammal {
	protected int energyLevel = 100;
	public Mammal() {
		
	}
	
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
}
