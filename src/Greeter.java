import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null, "Hi I'm human, you? ");
			String who = JOptionPane.showInputDialog(null, "Hello fellow " + answer + ". How are you today");
}
}
