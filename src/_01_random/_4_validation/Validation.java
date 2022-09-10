//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i<10; i++) {
			if (randomNumber==0) {
				JOptionPane.showMessageDialog(null,"You mean NOTHING to your parents, when they got pregnant with you they wanted to die.");
			}
			if (randomNumber==1) {
				JOptionPane.showMessageDialog(null,"Your grades are SO bad, I know you want to sob about it." );
			}
			if (randomNumber==2) {
				JOptionPane.showMessageDialog(null,"I dont want to see you again, you look so bad that I died when I saw your face.");
			}
			if (randomNumber==3) {
				JOptionPane.showMessageDialog(null,"When you grow up, I picture you to be a billionaire.");
			}
			if (randomNumber==4) {
				JOptionPane.showMessageDialog(null,"All your teachers despise you, when they see you walk into your class, they instantly wanna quit their jobs. ");
			}
			if (randomNumber==0) {
				JOptionPane.showMessageDialog(null,"You suck at EVERY GAME you play, I mean, you have to admit, you lose every game you play in a few seconds.");
			}
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}