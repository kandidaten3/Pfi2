package se.mah.k3lara.skaneAPI.view;

import java.util.ArrayList;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class StationsThread extends Thread {

	private Parser parser;
	private GUI gui;

	public StationsThread(Parser p, GUI g) {

		this.parser = p;
		this.gui = g;
	}

	public void run() {

		gui.textAreaStations.setText(null);
		gui.textAreaStations.setText("Loading...");
		ArrayList<Station> searchStations = new ArrayList<Station>();
		searchStations.addAll(Parser.getStationsFromURL(gui.textFieldSearch
				.getText()));
		gui.textAreaStations.setText(null);
		for (Station s : searchStations) {
			gui.textAreaStations.append(s.getStationName() + " number:"
					+ s.getStationNbr() + " Latitude: " + s.getLatitude()
					+ " Longitude: " + s.getLongitude() + "\n");
		}

	}

}