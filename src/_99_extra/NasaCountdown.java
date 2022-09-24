
package _99_extra;

/* NASA wants to shoot a rocket into orbit.
 * Somebody has to do the countdown or the rocket won't launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0.
 * 
 * (example for '11': 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

import game_tools.Sound;

import javax.swing.*;

public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {
		// 2. Use a pop-up to ask the user where to start counting from
		String countdown = JOptionPane.showInputDialog(null,"What number should we count down from?");
		// 3. Change the countdown to use the new starting point

		// 1. Print a countdown from 10 to 0 on the console
		int countdownInt = Integer.parseInt(countdown);
		while (countdownInt > 0) {
			countdownInt = countdownInt-1;
			System.out.println(countdownInt);
		}
		// 4. Use the Sound.speak method to hear the countdown.
		Sound.speak(countdown);
		// 6. Use the following code to make the program wait one second for each
		Thread.sleep(1000);

		// 5. when the counting is done, speak "blastoff!"
		if (countdownInt == 0) {
			Sound.speak("blastoff!");
		}
	}
}
