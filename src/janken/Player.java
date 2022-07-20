package janken;

import java.util.Random;

public class Player extends JankenBase {
	private String name;
	private String handStatus;
	
	public Player(String name){
		setName(name);
	}
	void makeHandStatus(){
		Random rand = new Random(); 
		int handFlagIndex = rand.nextInt(this.getHands().length);
		setHandStatus(handFlagIndex);
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHandStatus(int handFlagIndex) {
		this.handStatus = this.getHands()[handFlagIndex];
	}
	public String getHandStatus() {
		return this.handStatus;
	}
}