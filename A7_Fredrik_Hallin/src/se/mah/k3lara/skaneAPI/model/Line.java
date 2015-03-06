package se.mah.k3lara.skaneAPI.model;

import java.util.Calendar;

import se.mah.k3lara.skaneAPI.xmlparser.Parser;



public class Line {
	private Parser parser = new Parser();
	private String line;
	private Calendar depTime;
	public String depTimeDeviation;
	private String toStationName;
	private String newDepTime;
	public Line() {
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public Calendar getDepTime() {
		return depTime;
	}
	public void setDepTime(Calendar depTime) {
		this.depTime = depTime;
	}
	public String getDepTimeDeviation() {
		return depTimeDeviation;
	}
	public void setDepTimeDeviation(String depTimeDeviation) {
		this.depTimeDeviation = depTimeDeviation;
	}
	public String getDestination(){
		return this.toStationName;
	}
	public void setDestination(String toStationName){
		this.toStationName = toStationName;
	}
	public String getNewDepTime (){
		return newDepTime;
	}
	public void setNewDepTime(String newDepTime){
		this.newDepTime = newDepTime;
	}
	//More methods here for the rest of the tags
	//And perhaps some special methods ????
	
}	