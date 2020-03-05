package com.codingdojo.zookeeper;

public class Mammal {
	protected int energyLevel = 100;
	
	public Mammal(){
		
	}
	
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	public void setEnergyLevel(int value) {
		this.energyLevel = value;
	}
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
}
