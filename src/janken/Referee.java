package janken;

public class Referee extends JankenBase {
    Player A;
    Player B;
    String winA;
    String winB;
    String draw;

    public Referee(Player A, Player B) {
        this.A = A;
        this.B = B;
        this.winA = this.A.getName() + "さんの勝ち！";
        this.winB = this.B.getName() + "さんの勝ち！";
        this.draw = "引き分け！";

    }
    public void returnMssage(String message) {
        System.out.println(message);
    }
    public void StatusMessage() {
        System.out.println(this.A.getName() + "さん：" + this.A.getHandStatus());
        System.out.println(this.B.getName() + "さん：" + this.B.getHandStatus());
    }
    public void resultMessage() {
        if (isDraw(A.getHandStatus(), B.getHandStatus())) {
            returnMssage(draw);
        } else if (isWinA(A.getHandStatus(), B.getHandStatus())) {
            returnMssage(winA);
        } else if (isWinB(A.getHandStatus(), B.getHandStatus())) {
            returnMssage(winB);
        }
    }
    public boolean isDraw(String A, String B) {
        boolean result = false;
        if (A.equals(getHandtypeG()) && B.equals(this.getHandtypeG())
                || A.equals(this.getHandtypeT()) && B.equals(this.getHandtypeT())
                || A.equals(this.getHandtypeP()) && B.equals(this.getHandtypeP()) ) {

            result = true;
        }
        return result;
    }
    public boolean isWinA(String A, String B) {
        boolean result = false;
        if (A.equals(this.getHandtypeG()) && B.equals(this.getHandtypeT())
                || A.equals(this.getHandtypeT()) && B.equals(this.getHandtypeP())
                || A.equals(this.getHandtypeP()) && B.equals(this.getHandtypeG()) ) {

            result = true;
        }
        return result;
    }
    public boolean isWinB(String A, String B) {
        boolean result = false;
        if (A.equals(this.getHandtypeT()) && B.equals(this.getHandtypeG())
                || A.equals(this.getHandtypeP()) && B.equals(this.getHandtypeT())
                || A.equals(this.getHandtypeG()) && B.equals(this.getHandtypeP()) ) {

            result = true;
        }
        return result;
    }
}
