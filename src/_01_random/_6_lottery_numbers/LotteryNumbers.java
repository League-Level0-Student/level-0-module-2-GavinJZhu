package _01_random._6_lottery_numbers;

import javax.swing.*;
import java.util.Random;

public class LotteryNumbers {
    public static void main(String[] args) {
           Random ran = new Random();
           int rn = ran.nextInt(99 - 10 + 1) + 10;
           int rn2 = ran.nextInt(99 - 10 + 1) + 10;
           int rn3 = ran.nextInt(99 - 10 + 1) + 10;
           int rn4 = ran.nextInt(99 - 10 + 1) + 10;
           int rn5 = ran.nextInt(99 - 10 + 1) + 10;
           int rn6 = ran.nextInt(99 - 10 + 1) + 10;
       String hm = String.valueOf(rn);
       hm+=" "+String.valueOf(rn2);
           JOptionPane.showMessageDialog(null, hm );

    }
}
