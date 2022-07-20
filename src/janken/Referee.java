package janken;

public class Referee extends JankenBase {
	Player A;
	Player B;
	String WINA;
	String WINB;
	String DRAW;
	
	public Referee(Player A, Player B) {
		this.A = A;
		this.B = B;
		this.WINA = this.A.getName() + "さんの勝ち！";
		this.WINB = this.B.getName() + "さんの勝ち！";
		this.DRAW = "引き分け！";

	}
	public void returnMssage(String message) {
		System.out.println(message);
	}
	public void StatusMessage() {
		System.out.println(this.A.getName() + "さん：" + this.A.getHandStatus());
		System.out.println(this.B.getName() + "さん：" + this.B.getHandStatus());
	}
	public void resultMessage() {
		if(isDraew(A.getHandStatus(), B.getHandStatus())) {
			returnMssage(DRAW);
		}else if(isWinA(A.getHandStatus(), B.getHandStatus())) {
			returnMssage(WINA);
		}else if(isWinB(A.getHandStatus(), B.getHandStatus())) {
			returnMssage(WINB);
		}
	}
	public boolean isDraew(String A, String B) {
		boolean result = false;
		if(A == this.getHandtypeG() && B == this.getHandtypeG()
				|| A == this.getHandtypeT() && B == this.getHandtypeT()
				|| A == this.getHandtypeP() && B == this.getHandtypeP() ) {
			
			result = true;
		}
		return result;
	}
	public boolean isWinA(String A, String B) {
		boolean result = false;
		if(A == this.getHandtypeG() && B == this.getHandtypeT()
				|| A == this.getHandtypeT() && B == this.getHandtypeP()
				|| A == this.getHandtypeP() && B == this.getHandtypeG() ) {
			
			result = true;
		}
		return result;
	}
	public boolean isWinB(String A, String B) {
		boolean result = false;
		if(A == this.getHandtypeT() && B == this.getHandtypeG()
				|| A == this.getHandtypeP() && B == this.getHandtypeT()
				|| A == this.getHandtypeG() && B == this.getHandtypeP() ) {
			
			result = true;
		}
		return result;
	}
}