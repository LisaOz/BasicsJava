package com.qa.ifStatement;

public class Excercise5 {

	public static void main(String[] args) {
		int age = 60;
		int bpm = 150;

		if (age == 30) {
			if ((bpm >= 95) && (bpm <= 162)) {
				System.out.println("The heart rate is normal");
			} else if (bpm < 95) {
				System.out.println("The heart rate is too low");
			} else {
				System.out.println("The heart rate is too high");
			}
		} else if (age == 60) {
			if ((bpm >= 80) && (bpm <= 136)) {
				System.out.println("The heart rate is normal");
			} else if (bpm < 80) {
					System.out.println("The heart rate is too low");
				} else {
					System.out.println("The heart rate is too high");

				}
			}
		}
	}