import java.awt.EventQueue;
import java.util.Calendar;
//import java.util.Thread;

public class ClockThread implements Runnable{
	private Calendar cal;
	private ClockInterface clockInterface;
	public boolean run = true;
	
	public ClockThread(ClockInterface ci) { // constructor
		this.clockInterface= ci;
	
	}
	
	public void run(){

		System.out.println("hallo");
		while(run){
			
			cal=Calendar.getInstance();
			System.out.println(String.format("%02d",cal.get(11)) + ":" + String.format("%02d",cal.get(12))  + ":" + String.format("%02d",cal.get(13)) );
			clockInterface.update(cal.get(11), cal.get(12), cal.get(13));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
	}
	
	
}
