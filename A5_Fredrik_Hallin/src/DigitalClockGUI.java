import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;

public class DigitalClockGUI extends JFrame {
	public JPanel contentPane;
	public static ClockLogic clocklogic ;
	public JLabel lblTime;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblAlarmAt;
	public JLabel lblAlarm;
	private JButton btnClearAlarm;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					DigitalClockGUI frame = new DigitalClockGUI();
					clocklogic= new ClockLogic(frame);
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
	public DigitalClockGUI() {
		setTitle("Alarmclock\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\kandidaten3\\Documents\\Eclipse\\Alarmclock\\src\\klockikon.png"));
		setFont(new Font("Dialog", Font.PLAIN, 12));
		
		System.out.println("start program");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane= new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTime = new JLabel("time");
		lblTime.setFont(new Font("Segoe UI", Font.BOLD, 50));
		lblTime.setBounds(107, 21, 276, 88);
		contentPane.add(lblTime);
		
		JButton stop = new JButton("stop thread");
		stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clocklogic.thread.stop();
			}
		});
		stop.setBounds(301, 214, 98, 23);
		contentPane.add(stop);
		
		JLabel lblHour = new JLabel("Hour");
		lblHour.setBounds(112, 174, 46, 14);
		contentPane.add(lblHour);
		
		JLabel lblMinute = new JLabel("Minute");
		lblMinute.setBounds(199, 174, 50, 14);
		contentPane.add(lblMinute);
		
		textField = new JTextField();
		textField.setBounds(143, 174, 43, 16);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(252, 174, 40, 16);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblAlarm = new JLabel();
		lblAlarm.setText("--");
		lblAlarm.setBounds(209, 140, 51, 19);
		contentPane.add(lblAlarm);
		
		JButton btnSetAlarm = new JButton("Set alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//sätter alarm och ändrar bakgrundsfärg om angivna siffror är OK
				
				clocklogic.alOn = true;
				if (textField.getText().length() < 3 && textField.getText().length() > 0 && textField_1.getText().length() < 3 && textField_1.getText().length() > 0){
					
					if (Integer.parseInt(textField.getText()) < 25 && (Integer.parseInt(textField.getText()) > 0 && 
							Integer.parseInt(textField_1.getText()) < 60 && (Integer.parseInt(textField_1.getText()) > -1 )))
						
					clocklogic.setAlarm(Integer.parseInt(textField.getText()), Integer.parseInt(textField_1.getText()));
					lblAlarm.setText(String.format("%02d",clocklogic.getHour()) + ":" + String.format("%02d",clocklogic.getMinute()));
					
				}else {
					clocklogic.alOn = false;
					
						if (contentPane.getBackground() == SystemColor.activeCaption){
							contentPane.setBackground(SystemColor.WHITE);
						} else{
							contentPane.setBackground(SystemColor.activeCaption);;
						}
						
				}
				
				
			}
		});
		btnSetAlarm.setBounds(170, 214, 89, 23);
		contentPane.add(btnSetAlarm);
		
		lblAlarmAt = new JLabel("Alarm at:");
		lblAlarmAt.setBounds(145, 142, 61, 14);
		contentPane.add(lblAlarmAt);
		
		btnClearAlarm = new JButton("Clear alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				clocklogic.alOn = false;
				lblAlarm.setText(clocklogic.clearAlarm());
			}
		});
		btnClearAlarm.setBounds(281, 138, 107, 23);
		contentPane.add(btnClearAlarm);
		

	}
}
