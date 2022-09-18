package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you? (in years)");
	int ageInt = Integer.parseInt(age);
	if (ageInt>=18) {
		JOptionPane.showMessageDialog(null, "You're old enough to vote!");
		}
	else {
		JOptionPane.showMessageDialog(null, "Sadly, you aren't old enough to vote yet. Wait until you're 18!");
	}
}
}
