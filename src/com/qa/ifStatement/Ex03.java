package com.qa.ifStatement;

public class Ex03 {

	public static void main(String[] args) {
		int speed = 60;
		int maxSpeed = 60;
		int speedForFine = 70;
		
		if (speed < maxSpeed) {
			System.out.println("Your speed is less than the max. speed limit");
		} else if (speed > maxSpeed) {
				System.out.println("Your speed is greater than the max. speed limit");
				
			} else {
				System.out.println("Your speed is equal to the max. speed limit");
		}
	}
}

