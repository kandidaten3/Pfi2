import java.awt.Color;

import javax.swing.text.StyledEditorKit.FontSizeAction;


public class ClockLogic implements ClockInterface{
	public DigitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinute;
	public Thread thread;
	public boolean alOn;
	
	public ClockLogic(DigitalClockGUI clockIn){
		this.clockGUI=clockIn;
		clockGUI.lblTime.setText("hejsan");
		System.out.println(clockGUI.lblTime.getText());
		
		 thread= new Thread(new ClockThread(this));
		thread.start();
	}
	
	public void setAlarm(int hour, int minute) {
		this.alarmHour = hour;
		this.alarmMinute = minute;
	}
	
	public int getHour(){
		return alarmHour;
	}
	
	public int getMinute(){
		return alarmMinute;
	}

	@Override
	public void update(int hour, int minute, int second) { // från interface	
		clockGUI.lblTime.setText(String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second));	
		if(alOn && hour==this.getHour()){
			if(minute==this.getMinute()){
				
				clockGUI.contentPane.setBackground(Color.red);
			}
			
		}
		
	}
	
	public String clearAlarm(){
		return "--";
	}


	
}
