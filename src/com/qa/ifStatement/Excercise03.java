package com.qa.ifStatement;

public class Excercise03 {

	public static void main(String[] args) {
		int speed = 75;
		int maxSpeed = 60;
		int speedForFine = 70;
		
		// Nested if statements
		
		if (speed > maxSpeed) {
			System.out.println("You are over the speed limit!");
					if (speed > speedForFine) {
						System.out.println("You are eligible for a fine!");
						
			}
					
		}

	}

}
