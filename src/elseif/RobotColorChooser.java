
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the robot to draw

		// 4. use an if/else statement to set the pen color that the user requested

		// 5. if the user doesn’t enter anything, choose a random color

		// 6. put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 2. set the pen width to 10

		// 1. make the robot draw a shape (this will take more than one line of code)
		for (int i = 0; i < args.length; i++) {
			String color = JOptionPane.showInputDialog("Choose a color(Red,Cyan,Black or random)");
			Robot r2d2 = new Robot();
			if (color.equals("red")) {
				r2d2.setPenColor(Color.RED);
			} else if (color.equals("cyan")) {
				r2d2.setPenColor(Color.cyan);
			} else if (color.equals("black")) {
				r2d2.setPenColor(Color.black);
			} else {
				r2d2.setRandomPenColor();
			}

			r2d2.setPenWidth(10);
			r2d2.penDown();
			r2d2.move(80);
			r2d2.turn(90);
			r2d2.move(80);
			r2d2.turn(90);
			r2d2.move(80);
			r2d2.turn(90);
			r2d2.move(80);
			r2d2.turn(90);
		}
	}
}
