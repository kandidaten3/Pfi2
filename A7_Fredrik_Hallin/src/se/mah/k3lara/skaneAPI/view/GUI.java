package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import java.awt.Font;
import java.util.Calendar;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JourneysThread thread;
	private final JLabel försening = new JLabel("Sen (min)");

	JLabel buss1 = new JLabel("");
	JLabel buss2 = new JLabel("");
	JLabel buss3 = new JLabel("");
	JLabel buss4 = new JLabel("");
	
	JLabel destination1 = new JLabel("");
	JLabel destination2 = new JLabel("");
	JLabel destination3 = new JLabel("");
	JLabel destination4 = new JLabel("");
	
	JLabel avgång = new JLabel("");
	JLabel avgång2 = new JLabel("");
	JLabel avgång3 = new JLabel("");
	JLabel avgång4 = new JLabel("");
	
	JLabel sen1 = new JLabel("");
	JLabel sen2 = new JLabel("");
	JLabel sen3 = new JLabel("");
	JLabel sen4 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setResizable(false);
		setFont(new Font("Calibri", Font.BOLD, 20));
		setTitle("Ub\u00E5tshallen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 199);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel linje = new JLabel("Linje");
		linje.setForeground(Color.BLACK);
		linje.setFont(new Font("Calibri", Font.PLAIN, 20));
		linje.setBounds(10, 11, 49, 26);
		contentPane.add(linje);
		
		JLabel destination = new JLabel("Destination");
		destination.setFont(new Font("Calibri", Font.PLAIN, 20));
		destination.setForeground(Color.BLACK);
		destination.setBounds(71, 11, 106, 26);
		contentPane.add(destination);
		
		JLabel avgår = new JLabel("Avg\u00E5r");
		avgår.setForeground(Color.BLACK);
		avgår.setFont(new Font("Calibri", Font.PLAIN, 20));
		avgår.setBounds(311, 14, 56, 21);
		contentPane.add(avgår);
		
		
		buss1.setForeground(Color.ORANGE);
		buss1.setFont(new Font("Orator Std", Font.PLAIN, 15));
		buss1.setBounds(10, 35, 84, 31);
		contentPane.add(buss1);
		
		
		buss2.setForeground(Color.ORANGE);
		buss2.setFont(new Font("Orator Std", Font.PLAIN, 15));
		buss2.setBounds(10, 65, 84, 31);
		contentPane.add(buss2);
		
		
		buss3.setForeground(Color.ORANGE);
		buss3.setFont(new Font("Orator Std", Font.PLAIN, 15));
		buss3.setBounds(10, 92, 84, 31);
		contentPane.add(buss3);
		
		
		buss4.setForeground(Color.ORANGE);
		buss4.setFont(new Font("Orator Std", Font.PLAIN, 15));
		buss4.setBounds(10, 119, 84, 31);
		contentPane.add(buss4);
		
		
		destination1.setForeground(Color.ORANGE);
		destination1.setFont(new Font("Orator Std", Font.PLAIN, 15));
		destination1.setBounds(71, 36, 240, 31);
		contentPane.add(destination1);
		
		
		destination2.setForeground(Color.ORANGE);
		destination2.setFont(new Font("Orator Std", Font.PLAIN, 15));
		destination2.setBounds(71, 65, 240, 31);
		contentPane.add(destination2);
		
		
		destination3.setForeground(Color.ORANGE);
		destination3.setFont(new Font("Orator Std", Font.PLAIN, 15));
		destination3.setBounds(71, 92, 240, 31);
		contentPane.add(destination3);
		
		
		destination4.setForeground(Color.ORANGE);
		destination4.setFont(new Font("Orator Std", Font.PLAIN, 15));
		destination4.setBounds(71, 119, 240, 31);
		contentPane.add(destination4);
		
		
		avgång.setForeground(Color.ORANGE);
		avgång.setFont(new Font("Orator Std", Font.PLAIN, 15));
		avgång.setBounds(311, 35, 84, 31);
		contentPane.add(avgång);
		
		
		avgång2.setForeground(Color.ORANGE);
		avgång2.setFont(new Font("Orator Std", Font.PLAIN, 15));
		avgång2.setBounds(311, 65, 84, 31);
		contentPane.add(avgång2);
		
		
		avgång3.setForeground(Color.ORANGE);
		avgång3.setFont(new Font("Orator Std", Font.PLAIN, 15));
		avgång3.setBounds(311, 92, 84, 31);
		contentPane.add(avgång3);
		
		
		avgång4.setForeground(Color.ORANGE);
		avgång4.setFont(new Font("Orator Std", Font.PLAIN, 15));
		avgång4.setBounds(311, 119, 84, 31);
		contentPane.add(avgång4);
		
		  sen1.setForeground(Color.ORANGE);
		  sen1.setFont(new Font("Orator Std", Font.PLAIN, 15));
		  sen1.setBounds(385, 35, 70, 31);
		  contentPane.add(sen1);
		  
		  sen2.setForeground(Color.ORANGE);
		  sen2.setFont(new Font("Orator Std", Font.PLAIN, 15));
		  sen2.setBounds(385, 65, 70, 31);
		  
		  contentPane.add(sen2);
		  sen3.setForeground(Color.ORANGE);
		  sen3.setFont(new Font("Orator Std", Font.PLAIN, 15));
		  sen3.setBounds(385, 92, 70, 31);
		  
		  contentPane.add(sen3);
		  sen4.setForeground(Color.ORANGE);
		  sen4.setFont(new Font("Orator Std", Font.PLAIN, 15));
		  sen4.setBounds(385, 119, 70, 31);
		  
		  contentPane.add(sen4);
		  försening.setForeground(Color.BLACK);
		  försening.setFont(new Font("Calibri", Font.PLAIN, 20));
		  försening.setBounds(386, 11, 82, 26);
		  
		  contentPane.add(försening);
		  
		  	UpdateLables();
		  	Thread t = new JourneysThread (this); 
		  	t.start();
			  
	}
	
	public void UpdateLables(){
		Lines lines = Parser.getStationResults(new Station("80046"));

		  buss1.setText(lines.getLines().get(0).getLine());
		  buss2.setText(lines.getLines().get(1).getLine());
		  buss3.setText(lines.getLines().get(2).getLine());
		  buss4.setText(lines.getLines().get(3).getLine());
		  
		  destination1.setText(lines.getLines().get(0).getDestination());
		  destination2.setText(lines.getLines().get(1).getDestination());
		  destination3.setText(lines.getLines().get(2).getDestination());
		  destination4.setText(lines.getLines().get(3).getDestination());
		  
		  avgång.setText(correctTime(lines.getLines().get(0).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + correctTime(lines.getLines().get(0).getDepTime().get(Calendar.MINUTE)));
		  avgång2.setText(correctTime(lines.getLines().get(1).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + correctTime(lines.getLines().get(1).getDepTime().get(Calendar.MINUTE)));
		  avgång3.setText(correctTime(lines.getLines().get(2).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + correctTime(lines.getLines().get(2).getDepTime().get(Calendar.MINUTE)));
		  avgång4.setText(correctTime(lines.getLines().get(3).getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + correctTime(lines.getLines().get(3).getDepTime().get(Calendar.MINUTE)));
		
		  sen1.setText(lines.getLines().get(0).getDepTimeDeviation());
		  sen2.setText(lines.getLines().get(1).getDepTimeDeviation());
		  sen3.setText(lines.getLines().get(2).getDepTimeDeviation());
		  sen4.setText(lines.getLines().get(3).getDepTimeDeviation());
	}
	
	public String correctTime(int time){
		  // Some variables that will create a '0' if a number is single digit, to
		  // make it nicer.
		  String zero = "";

		  if (time < 10) {
		   zero = "0";
		  }

		  // Compiles the values to nice, readable strings.
		  String finalTimeString = zero + Integer.toString(time);

		  zero = "";
		  
		  return finalTimeString;
		 }
	
}