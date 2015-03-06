
public class Dog extends Mammal{

	private boolean stupid;
	
	public Dog(String latinName, int gestationTime, boolean stupid){
		super(latinName, gestationTime);
	}
	public Dog(String friendlyName, String latinName, int gestationTime, boolean stupid){
		super(latinName, gestationTime);
		super.setFriendlyName(friendlyName);
		this.stupid = stupid;
		
	}
	public boolean isStupid(){
		return stupid;
	}
	@Override
	public String getInfo() {
		String s;
		if (stupid) {
			s = "stupid";
		} else {
			s = "not stupid";
		}
		return "The dog " + super.getFriendlyName() + " lat: " + getLatinName() + " nurses for " + getGestationTime() + " months " + " is " + s;	}
}
