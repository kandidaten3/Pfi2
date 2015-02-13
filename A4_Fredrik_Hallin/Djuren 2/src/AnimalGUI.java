import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;


public class AnimalGUI {
	

	public static void main(String[] args){
	JFrame frame = new JFrame("Djuren 2");
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel lblAnimals = new JLabel("Animals");
	lblAnimals.setBounds(10, 11, 89, 20);
	frame.getContentPane().add(lblAnimals);
	
	JSeparator separator = new JSeparator();
	separator.setBounds(50, 21, 387, 9);
	frame.getContentPane().add(separator);
	
	JTextArea textArea = new JTextArea();
	textArea.setBounds(10, 35, 426, 223);
	frame.getContentPane().add(textArea);
	
	
	
	ArrayList<Animal> animals=new ArrayList<Animal>();
	animals.add(new Snake("Kaa", "Python regius", true));
	animals.add(new Dog("Rutger", "Canis latrans", 4, true));
	animals.add(new Cat("Katla", 22, 10, "Lynx lynx"));
	animals.add(new Dog("Rolf", "Canis Latrans", 2, false));
	animals.add(new Snake("Dicken", "Python regius", false));
	animals.add(new Cat("Kat", 11, 7, "Lynx lynx"));
	
	for (Animal i: animals){
		textArea.append(i.getInfo() + "\n");
	}
	}
}
