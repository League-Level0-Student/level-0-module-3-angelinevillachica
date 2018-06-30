import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
	
	
	String Score=JOptionPane.showInputDialog("What did you get on your test?");
	
	double a=Double.parseDouble(Score);
	
	if(a>75){JOptionPane.showMessageDialog(null, "Great job you must have really studied.");}
	else if(a<75&&a>50){JOptionPane.showMessageDialog(null, "Maybe try to study more.");}
	else if(a<50&&a>25) {JOptionPane.showMessageDialog(null, "Try to actually study next time.");}
	else if(a<25) {JOptionPane.showMessageDialog(null, "Are you sure that you take that class?");}

	
	}
}
