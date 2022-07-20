package janken;

public class JankenBase {
	final private String G = "ぐー";
	final private String T = "ちょき";
	final private String P = "ぱー";
	private String[] hands = { G, T, P };
	
	public String getHandtypeG(){
		System.out.println("てすと");
		return this.G;
	}
	public String getHandtypeT(){
		return this.T;
	}
	public String getHandtypeP(){
		return this.P;
	}
	public String[] getHands(){
		return hands;
	}
}