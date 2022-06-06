package com.qa.ifStatement;

public class IfStatement {

	public static void main(String[] args) {
		boolean happy = true; // initialize a Boolean variable as tru
		boolean sad = false;
		if (happy) // check if happy is true
			System.out.println("I am happy.");
		// usually put the conditional code into a block.
		if (sad) {
		// you will not see this
			System.out.println("The variable sad is true");
		}
     
	}
	
}
