package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class GUI extends JFrame {

	private JPanel contentPane;
	JTextField textFieldSearch;
	JTextField textFieldFrom;
	JTextField textFieldTo;

	JTextArea textAreaStations = new JTextArea();
	JTextArea textAreaJourney = new JTextArea();

	GUI g = this;
	private Parser p = new Parser();

	Thread tJ = new JourneysThread(p, this);
	Thread tS = new StationsThread(p, this);

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 5, 508, 125);
		contentPane.add(panel);
		panel.setLayout(null);

		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(12, 50, 124, 20);
		panel.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		textAreaJourney.setEditable(false);
		textAreaStations.setEditable(false);

		JButton btnSearchStation = new JButton("Search");
		btnSearchStation.setBounds(148, 49, 89, 23);
		btnSearchStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Thread tS = new StationsThread(p, g);
				tS.start();

			}
		});
		panel.add(btnSearchStation);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(247, 4, 251, 110);
		panel.add(scrollPane_1);
		scrollPane_1.setViewportView(textAreaStations);

		JLabel lblSearchStations = new JLabel("Search Stations");
		lblSearchStations.setBounds(12, 34, 153, 14);
		panel.add(lblSearchStations);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 139, 508, 142);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		textFieldFrom = new JTextField();
		textFieldFrom.setBounds(10, 39, 126, 20);
		panel_1.add(textFieldFrom);
		textFieldFrom.setColumns(10);

		textFieldTo = new JTextField();
		textFieldTo.setBounds(10, 76, 126, 20);
		panel_1.add(textFieldTo);
		textFieldTo.setColumns(10);

		JLabel lblFrom = new JLabel("From:");
		lblFrom.setBounds(10, 22, 46, 14);
		panel_1.add(lblFrom);

		JLabel lblTo = new JLabel("To:");
		lblTo.setBounds(10, 59, 46, 14);
		panel_1.add(lblTo);

		JButton btnSearchJourney = new JButton("Search");
		btnSearchJourney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Thread tJ = new JourneysThread(p, g);
				tJ.start();

			}
		});
		btnSearchJourney.setBounds(146, 55, 89, 23);
		panel_1.add(btnSearchJourney);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(247, 7, 251, 124);
		panel_1.add(scrollPane);
		scrollPane.setViewportView(textAreaJourney);
	}
}