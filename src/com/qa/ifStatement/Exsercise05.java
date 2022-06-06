package com.qa.ifStatement;

public class Exsercise05 {

	public static void main(String[] args) {
		boolean red = true;
		boolean blue = false;
		if ((red) && (blue)) {
			System.out.println("Both red AND blue are true.");
		} else {
			System.out.println("not true");
		}
		if ((red) || (blue)) {
			System.out.println("Either red OR blue Or both are true");
		} else {
			System.out.println("No true");

		}
		if (!blue) {
			System.out.println("The variable blue is false");
		}
	}

}
