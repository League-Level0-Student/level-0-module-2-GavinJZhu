package _03_string_conversion._1_intro;

import javax.swing.*;

public class Intro {
    public static void main(String[] args) {
        String quantity= JOptionPane.showInputDialog("Enter in a number.");
        int num = Integer.parseInt(quantity);
        num=num+1;
        JOptionPane.showMessageDialog(null, "Your number plus 1 equals " + num + ".");
    }
}
