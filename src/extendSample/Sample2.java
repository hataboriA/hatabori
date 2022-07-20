package extendSample;

class Sample2 extends Dog {
	String name = "ぽち";
	String skill = "散歩";
	
	Sample2(){
		this.name = "未設定(name)";
		this.skill = "未設定(skill)";
	}
	Sample2(String v){
		super(v);
		this.name = "未設定(name)";
		this.skill = "未設定(skill)";
	}
	Sample2(String n, String s, String v){
		super(v);
		this.name = n;
		this.skill = s;
	}
	public void print() {
		System.out.println("趣味は散歩です");
	}
}