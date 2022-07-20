package janken;

public class Janken {	
	public static void main(String[] args) {
		Player A = new Player(args[0]);
		Player B = new Player(args[1]);
		
		Referee referee = new Referee(A, B);
		referee.returnMssage("じゃーんけーんぽーん");
		
		A.makeHandStatus();
		B.makeHandStatus();

		referee.returnMssage("結果は。。。");
		referee.StatusMessage();
		referee.resultMessage();
	}
}