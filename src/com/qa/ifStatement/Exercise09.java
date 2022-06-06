package com.qa.ifStatement;

public class Exercise09 {

	public static void main(String[] args) {
		int tempAdjustment = 0;
		String taste = "way too hot";

		switch (taste) {
		case "too cold":
			tempAdjustment += 1;
			break;

		case "way too hot":
			tempAdjustment -= 1;
		case "too hot":
			tempAdjustment -= 1;
			break;
		case "just right": // no adjustment
			break;

		}
		System.out.println("Adjust tempretature: " + tempAdjustment);

	}

}
