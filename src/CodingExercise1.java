import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw
    	Robot bob= new Robot();
    	bob.penDown();
    	bob.setSpeed(50);
String robotColor= JOptionPane.showInputDialog("Out of red, gray, white, yellow, pink, orange, magenta, green, or blue, which color do you want to color the lines?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
if(robotColor.equalsIgnoreCase("red")) {
	bob.setPenColor(Color.red);
}else if(robotColor.equalsIgnoreCase("green")) {
	bob.setPenColor(Color.green);
}else if(robotColor.equalsIgnoreCase("blue")) {
	bob.setPenColor(Color.blue);
}else if(robotColor.equalsIgnoreCase("yellow")) {
		bob.setPenColor(Color.yellow);
}else if(robotColor.equalsIgnoreCase("pink")) {
			bob.setPenColor(Color.pink);
}else if(robotColor.equalsIgnoreCase("orange")) {
				bob.setPenColor(Color.ORANGE); 
}else if(robotColor.equalsIgnoreCase("gray")) {
	bob.setPenColor(Color.gray); 
}else if(robotColor.equalsIgnoreCase("white")) {
	bob.setPenColor(Color.white); 
}else if(robotColor.equalsIgnoreCase("magenta")) {
	bob.setPenColor(Color.MAGENTA); 
}else {
	JOptionPane.showMessageDialog(null, "I am sorry, that is not a valid color. Since you could not decide, I have chosen for you. You will be using plain old black.");
}
   	 // 2. set the pen width to 10
bob.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	 bob.move(100);
   	 bob.turn(72);
   	 bob.move(100);
   	 bob.turn(72);
   	 bob.move(100);
   	 bob.turn(72);
   	 bob.move(100);
   	 bob.turn(72);
   	 bob.move(100);
   	 bob.turn(72);
    }

}
