import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot r2d2 = new Robot();

	public static void main(String[] args) {

		// 2. Have the robot draw a square
		drawSquare();

		// 3. Extract this code into a drawSquare() method.

		// 4. Have the robot draw a triangle.
		drawTriangle();
		// 5. Extract this code into a drawTriangle() method.

		// 6. Have the robot draw a circle.
		drawCircle();
		// 7. Extract this code into a drawCircle() method.

		// 8. Ask the user which shape they want. Draw the appropriate shape depending
		// on their answer.

		// 9. Ask the user which color they want. Color the the shape depending on their
		// answer.

	}

	public static void drawSquare() {
		r2d2.setPenColor(Color.black);
		r2d2.penDown();
		r2d2.sparkle();
		for (int i = 0; i < 4; i++) {
			r2d2.move(100);
			r2d2.turn(360 / 4);
		}

	}

	public static void drawTriangle() {

		r2d2.setPenColor(Color.black);
		r2d2.penDown();
		r2d2.sparkle();
		for (int i = 0; i < 3; i++) {
			r2d2.move(100);
			r2d2.turn(360 / 3);
		}
	}

	public static void drawCircle() {

		r2d2.setPenColor(Color.black);
		r2d2.penDown();
		r2d2.sparkle();
		for (int i = 0; i < 360; i++) {
			r2d2.move(100);
			r2d2.turn(360 / 360);
		}
	}
}
