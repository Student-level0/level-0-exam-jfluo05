

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	
	String age= JOptionPane.showInputDialog("How old are you?");
	int intage=Integer.parseInt(age);
	int year= 2017-intage;
	JOptionPane.showMessageDialog(null, "You were born in "+ year );	
	
	
	if(intage>30) {
		JOptionPane.showMessageDialog(null, "You are too old to play this game.");
	}else {
		JOptionPane.showMessageDialog(null, "You are young enough to play this game!");
	}
	
}
}



