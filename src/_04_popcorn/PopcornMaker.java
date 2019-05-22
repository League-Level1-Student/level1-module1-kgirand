package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String input1 = JOptionPane.showInputDialog("What flavor popcorn would you like?");
	String input2 = JOptionPane.showInputDialog("How many minutes would you like it to be cooked? (In the microwave");
	int input2int = Integer.parseInt(input2);
	Popcorn popcorn = new Popcorn(input1);
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(popcorn);
	microwave.setTime(input2int);
	microwave.startMicrowave();
}
}
