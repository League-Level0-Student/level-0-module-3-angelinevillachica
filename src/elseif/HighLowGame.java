//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
		String guess =JOptionPane.showInputDialog("Guess a number");
		// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int number = Integer.parseInt(guess);
		
			// 5. if the guess is correct
				if(number==random) {JOptionPane.showMessageDialog(null,"YOU LOST !!!!! HAHAHAHA Im kidding you sadly won wooooo im so proud of you (that was suppused to be sarcastic)");}
		
		// 6. win
			// 7. if the guess is high
				else if(number>random) {JOptionPane.showMessageDialog(null, "Too high guess again loser ");}
				
				// 8. tell them it's too high
			
				// 9. if the guess is low
				else if (number<random) {JOptionPane.showMessageDialog(null, "too low try again loser");}
				
				// 10. tell them it's too low
		}
		// 12. tell them they lose
		JOptionPane.showMessageDialog(null, "HAHAHAHAHAHAHAHAHAHAAHAHHHHAAHhahAHHAAHAHAHAHAHAHAHAHHAHAAHAHAHHAAHHAHAHAHAHAHAHAAHHAAHAHHAAHHA YOU LOST LOSER AHAHAHHAAHAHAHAHAHAHHAAHAHHAHAAHHAHAHHAAHHAHAHAAHAHHAHAAHAHAHHAHAHAAHAHAAHAHAHHAAHAHAHAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHAHAHHAAHHAHAHAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHAAHHAHAHAAHHAHAAHAHAHAHAHAHAHAHAHHAHAAHHAAHAHAHAHHAHAAHAHHAHAAHAHAHAHAHAHAHAH");
	}
	
	

}


