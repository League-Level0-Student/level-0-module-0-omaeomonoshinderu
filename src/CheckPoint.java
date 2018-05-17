import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Whats your fvorite color");
		String nope = JOptionPane.showInputDialog(answer + " is my favorite color too.");
		Robot dot = new Robot();
		dot.setSpeed(100);
		dot.penDown();
		if (answer.equals("Green")) {
			robotsetPenColor(Color.green);
		}
		else {
			dot.setRandomPenColor();
		}
		dot.move(120);
		dot.turn(120);
		dot.move(120);
		dot.turn(120);
		dot.move(120);
		dot.turn(120);
	}
}
