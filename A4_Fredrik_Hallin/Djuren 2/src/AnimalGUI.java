import java.util.ArrayList;

import javax.swing.JFrame;


public class AnimalGUI {
	

	public static void main(String[] args){
	JFrame frame = new JFrame("Djuren 2");
	frame.setResizable(false);
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	ArrayList<Animal> animals=new ArrayList<Animal>();
	animals.add(new Snake("Ormen", true));
	animals.add(new Dog("Rutger", 27, true);
	}
}
