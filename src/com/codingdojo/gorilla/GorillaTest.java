package com.codingdojo.gorilla;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla coco = new Gorilla();
		coco.throwSomething().throwSomething().throwSomething().eatBananas().eatBananas().climb();
		System.out.println("Total Energy Level: " + coco.displayEnergy());
	}

}
