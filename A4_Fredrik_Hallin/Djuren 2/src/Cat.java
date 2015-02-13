
public class Cat extends Mammal{

	private int numberOfLives;
	
	public Cat(String friendlyName, int gestationTime, int numberOfLives, String latinName){
		super(latinName, gestationTime);
		super.setFriendlyName(friendlyName);
		this.numberOfLives = numberOfLives;
	}	
	public int getNumberOfLives(){
		return numberOfLives;
	}
	public void setNumberOfLives(int i){
		
	}
	public String getFriendlyName(){
		return friendlyName;
	}
	@Override
	public String getInfo() {
		return "The cat " + super.getFriendlyName() + " lat: " + getLatinName() + " nurses for " + super.getGestationTime() + " months and has " + getNumberOfLives() + " lives";
	}
}
