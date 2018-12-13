package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class TheRiddler 
{public static void main(String[] args) {
	

int Points = 0;
String Answer = JOptionPane.showInputDialog("#ThisIsARiddle 564/100x500/1/760x4/6x700 ( / = dividing also use paper only if ur solving the equation)");
if (Answer.equals("quick maths")){
	JOptionPane.showMessageDialog(null, "CORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRECT");
	Points = Points +1;
	JOptionPane.showMessageDialog(null, "YAY YOU EARNED "+ Points+" POINTS 2 QUESTIONS MORE TO GO");
}
else {
	JOptionPane.showMessageDialog(null, "Ur not good at ur 'quick maths'");
JOptionPane.showMessageDialog(null, "Your score is "+ Points);
}
JOptionPane.showMessageDialog(null, "YAY YOU EARNED "+ Points+" SCORE 2 QUESTIONS MORE TO GO");
String Answer2 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner? Make sure in each word in your answer should be in caps like 'I Can'and the first word in your answer is 'A'");
if (Answer2.equals("A Stamp")) {
	JOptionPane.showMessageDialog(null, "CORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRECT");
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect (hint definition: impress a pattern or mark, especially an official one, on (a surface, object, or document) using an engraved or inked block or die or other instrument.");
}
}
}
