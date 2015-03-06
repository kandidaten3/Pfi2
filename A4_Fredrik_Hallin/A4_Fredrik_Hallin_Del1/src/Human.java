import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;


public class Human {
	
//	public ArrayList<Dog> dogs = new ArrayList<Dog>();
	
	private Dog dog;
	private String name;
	
	public Human(String name) {
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public Dog buyDog(Dog dog){
		return this.dog = dog;		
	}
	public String getInfo(){
		String s = "";
		if (dog != null) {
			s = getName() + " äger en hund som heter " + dog.name;

		} else {

			s = getName() + " äger inte en hund ";

		String a = "";

		}
		
		return s;
	}
}