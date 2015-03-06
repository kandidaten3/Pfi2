package se.mah.k3lara.skaneAPI.view;
import java.util.Calendar;

public class JourneysThread extends Thread{
	private GUI gui;
	private boolean on = true;

	public JourneysThread(GUI g){
		this.gui = g;
	}

	public void run() {
		while(on){
			try{
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			gui.UpdateLables();
		}

	}

}