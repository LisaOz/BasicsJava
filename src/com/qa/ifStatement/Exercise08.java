package com.qa.ifStatement;

public class Exercise08 {

	public static void main(String[] args) {
		int season = 2;
		String message = null;
		
		switch(season) {
		
		case 1: message = "Spring";
		break;
		
		case 2: message = "Summer";
		break;
		
		case 3: message = "Fall";
		break;
		
		case 4: message = "Winter";
		break;
		}
		
		System.out.println(message);
		
		}

	}


