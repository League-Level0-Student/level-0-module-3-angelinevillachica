package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Are you happy?");

		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what ever you're doing");
		} else if (answer.equals("no")) {
			String ok = JOptionPane.showInputDialog("Do you want to be happy?");
			if (ok.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Then change something");
			} else if (ok.equals("no")) {
				JOptionPane.showMessageDialog(null, "Then keep doing what ever you're doing");
			}

		}

	}
}
