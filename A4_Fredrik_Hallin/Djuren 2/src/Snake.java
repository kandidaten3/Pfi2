
public class Snake extends Animal{

	private boolean poisonous;
	String latinName;
	
	public Snake(String friendlyName, String latinName, boolean poisonous){
		super(latinName);
		super.setFriendlyName(friendlyName);
		this.poisonous = poisonous;
	}
	public boolean isPoisonous(){
		return poisonous;
	}
	@Override
	public String getInfo() {
		String s;
		if (poisonous) {
			s = "poisonous";
		} else {
			s = "not poisonous";
		}
		return "The snake " + super.getFriendlyName() + " lat: " + getLatinName() + " is " + s;
	}
}
