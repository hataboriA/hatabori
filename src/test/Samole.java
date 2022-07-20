package test; //テストの下にいますよ

public class Samole {

	public static void main(String[] args) { // main -> 特別なメソッド。ここから動く。
		// TODO 自動生成されたメソッド・スタブ
//		int a = 3;
//		int b = 6;
//		int c =a * b;
//		System.out.println(c);
		System.out.println("ようこそ占いの館へ");
		System.out.println("名前を入力してね");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("年齢を教えてね");
		String agestoring = 
				new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(agestoring);
		int fortune = new java.util.Random().nextInt(4);

		System.out.println(age+ "歳の" + name + "さん、あなたの運勢は" + fortune+ "です");
		
	}

}
