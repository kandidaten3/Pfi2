import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;


public class Human {
	
	public ArrayList<Dog> dogs = new ArrayList<Dog>();
	
	private Dog dog;
	private String name;
	
	public Human(String name) {
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void buyDog(Dog dog){
		dogs.add(new Dog(dogNameBox.getText()));
	}
	public String getInfo(){
//		return name + (" äger en hund som heter ") + dog.name;
		String s = "";
		if (dog != null) {

			s = getName() + " ager en hund som heter " + dog.name;

		} else {

			s = getName() + " ager inte en hund ";

		}
		return s;
	}
	private static JTextField humanNameBox;
	private static JTextField dogNameBox;
	private static JTextField infoBox;
	private static JTextField errorBox;
	

	public static void main(String[] args){
		JFrame frame = new JFrame("Djuren 1");
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		humanNameBox = new JTextField();
		humanNameBox.setBounds(97, 38, 86, 20);
		frame.getContentPane().add(humanNameBox);
		humanNameBox.setColumns(10);
		
		JButton btnNewHuman = new JButton("New human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Human human=new Human(humanNameBox.getText());
				System.out.println(human.name);
			}
		});
		btnNewHuman.setBounds(248, 37, 135, 23);
		frame.getContentPane().add(btnNewHuman);
		
		dogNameBox = new JTextField();
		dogNameBox.setBounds(97, 72, 86, 20);
		frame.getContentPane().add(dogNameBox);
		dogNameBox.setColumns(10);
		
		JButton btnBuyDog = new JButton("Buy dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dog dog=new Dog(dogNameBox.getText());
				System.out.println(dog.name);
			}
		});
		btnBuyDog.setBounds(248, 71, 135, 23);
		frame.getContentPane().add(btnBuyDog);
		
		infoBox = new JTextField();
		infoBox.setBounds(29, 161, 387, 53);
		frame.getContentPane().add(infoBox);
		infoBox.setColumns(10);
		
		errorBox = new JTextField();
		errorBox.setBounds(29, 228, 387, 32);
		frame.getContentPane().add(errorBox);
		errorBox.setColumns(10);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(29, 144, 46, 14);
		frame.getContentPane().add(lblInfo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(51, 150, 366, 6);
		frame.getContentPane().add(separator);
		
		JLabel lblError = new JLabel("Error:");
		lblError.setBounds(29, 215, 46, 14);
		frame.getContentPane().add(lblError);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and dogs");
		lblHumansAndDogs.setBounds(174, 12, 152, 15);
		frame.getContentPane().add(lblHumansAndDogs);
		frame.setVisible(true);
		
		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoBox.setText(human.getInfo());
			}
		});
		btnPrintInfo.setBounds(174, 99, 89, 23);
		frame.getContentPane().add(btnPrintInfo);
}
}