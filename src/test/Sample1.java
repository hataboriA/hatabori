package test;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {

	private static final String FEMALE = "めす";
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//整数 int 小数点 double

//		char youbi = '土';
//		boolean isSotu = true ;
//		System.out.println(youbi);
//		System.out.println(isSotu);
//		
//		//整数を数値に
//		String x = "10";
//		int y = Integer.parseInt(x);
//		
//		char[] singou = new char[3];
//		char b = singou[1];
//		System.out.println(x);
//		
//		char[] a = new char[] {
//				'赤', '青', 'き'
//		};
//		System.out.println(a);
////		System.out.println(args[1]);
//		
//		String[][] animal = {
//				{"はむ", "じゃんがりあん"},
//				{"犬", "とい"},
//				{"ねじ", "みけ"}
//		};
//		System.out.println(animal[0][1]);
//		
//		String[][][] animar2 = {
//				{
//					{"ぶた", "東京", "たろう"},
//					{"犬", "北海道", "はなこ"},
//					{"ねこ", "群馬", "きち"}
//				}
//		};
//		System.out.println(animar2[0][2][1]);
		
//		int number = Integer.parseInt(args[0]);
//		String display = "";
//
//		for(int i = 0; i < number; i++) {
//			display += "*";
//		};
//		
//		System.out.println(display);
			

//		
//		String[][] animal3 = {
//				{"モコ", "といぷー", "４歳", "メス"},
//				{"ぽち", "しばいぬ", "５歳", "メス"},
//				{"むぎ", "ぱぴよん", "２歳", "オス"},
//				{"しろ", "秋田県", "６歳", "メス"},
//				{"しろta", "秋田県nn", "7歳", "メス"},
//		};
//		
//		String t = "";
//		for(int i = 0; i < animal3.length; i++) {
//			t = animal3[i][0];
//			
//			for(int j = 1; j < animal3[i].length; j++) {
//				t += " / " + animal3[i][j];
//			}
//			System.out.println(t);
//		}
		
//		int n = 0;
//		while(n < 6) {
//			n = 1 + (int)(Math.random()*6);
//			System.out.println(n);
//		}
//		System.out.println("6がでたので終了");
		
//		int n2 = 0;
//		do {
//			n2 = 1 + (int)(Math.random()*6);
//			System.out.println(n2);
//		}while(n2 < 6);
//
//		System.out.println("6がでたので終了");
//		
//		int score = Integer.parseInt(args[0]);
//		if(score < 0 || score > 100) {
//			System.out.println("不正なです");
//		}else if(score > 0 && score < 60){
//			System.out.println("赤点です");
//		}else if(score >= 60 && score < 80){
//			System.out.println("普通です");
//		}else if(score >= 80 && score <= 100){
//			System.out.println("優秀です");
//		}else if(score == 100) {
//			System.out.println("宿題免除");
//		}

	
//		String[] coins = args;
//		int useCoins = 0;
//		
//		for(int i = 0; i < coins.length -1; i++) {
//			switch(Integer.parseInt(coins[i])){
//				case 1:
//					System.out.println("１円は使えません");
//					break;
//				case 10:
//					System.out.println("１0円は使えません");
//					break;
//				case 100:
//					useCoins += 100;
//					break;
//				case 500:
//					useCoins += 500;
//					break;
//				default:
//					System.out.println(Integer.parseInt(coins[i]) + "円は不正な硬貨です！");		
//			}
//		}
//		int last = Integer.parseInt(coins[coins.length - 1]);
//		int oturi = useCoins - last;
//		System.out.println(oturi + "円のおつりです。ありがとうござました");
		

//		String cakeName = "";
//		int cakeLength = 0;
//		int cakePrice = 0;
//		int totalPrice = 0;
//		final double tax = 1.08;
//		
//		cakeFor:for(int i = 0; i < args.length; i+=2) {
//			cakeName = args[i];
//			cakeLength = Integer.parseInt(args[i+1]);
//			
//			switch(cakeName) {
//				case "Aけーき":
//					cakePrice = 100;
//					break;
//				case "Bけーき":
//					cakePrice = 200;
//					break;
//				case "Cけーき":
//					cakePrice = 300;
//					break;
//				default:
//					System.out.println(args[i] +"は存在しません");
//					break cakeFor;
//			}
//			cakePrice *= (int)cakeLength * tax;
//			totalPrice += cakePrice;		}
//		System.out.println("お会計は" + totalPrice + "円です");
//		
//		int totalPrice = 0;
//		
//		for(int i = 0; i < args.length; i++) {
//			//コマンドライン引数から、購入した商品の合計金額を取得
//			totalPrice += Integer.parseInt(args[i]);
//			
//		}
//		//ディスカウントメソッドを使用し割引を適用、割引後の金額を取得
//		int discoutedPrice = discount(totalPrice);
//		
//		int taxPayment = calcTaxPayment(discoutedPrice);
//		
//		System.out.println(taxPayment);
		
		
		
		
//		List<String> testList = new ArrayList<String>();
//		testList.add("たろう");
//		testList.add("ごろう");
//		testList.add("まあ");
//		
//		for(int i = 0; i < testList.size(); i++) {
//			System.out.println(testList.get(i));
//		}
		
		
//		BigDecimal a = new BigDecimal("0.2");
//		BigDecimal b = new BigDecimal("83");
//		BigDecimal c = new BigDecimal("10.6");
//		
//		System.out.println(c.subtract(a.multiply(b)));
		
		
		
//		BigDecimal a = new BigDecimal("0.2");
//		BigDecimal b = new BigDecimal("83");
//		BigDecimal c = new BigDecimal("10.6");
//		BigDecimal d = new BigDecimal("3");
//		
//		BigDecimal result = (a.multiply(b)).subtract(c.divide(d, 4, BigDecimal.ROUND_HALF_UP));
//		
//		System.out.println(result);
		
		
		
		
		String[][] dogs = {
			{"もこ","4歳", "めす"},
			{"たろ","6歳", "おす"},
			{"じろ","2歳", "おす"},
			{"だい","4歳", "めす"},
		};

		final String FEMALE = "めす";
		String age = "";
		String gender = "";
		List<String> newDogs = new ArrayList<String>();
		
		for(int i = 0; i < dogs.length; i++) {
			//4sai
			age = dogs[i][1].replaceAll("[^0-9]", "");
			gender = dogs[i][2];
			
			boolean isOver4 = isOver4(Integer.parseInt(age));
			boolean isFemale = isFemale(gender);

			if(isOver4 && isFemale) {
				newDogs.add(dogs[i][0]);
			}
		}
		System.out.println(newDogs);
	
		

		
	}
	private static boolean isFemale (String gender) {
		System.out.println(FEMALE);
		return gender == FEMALE;
	}
	private static boolean isOver4 (int age) {
		return age >= 4;
	}
	
	
	
	
	
	
//	static int calcTaxPayment(int discoutedPrice) {
//		return (int) (discoutedPrice * 1.08);
//	}
//	static int discount(int totalPrice) {
//		int over5000 = 0;
//		int under5000 = 5000;
//		
//		if(totalPrice >= 1000 && totalPrice <= 5000) {
//			totalPrice *= 0.9;
//			
//		}else if(totalPrice >= 5000) {
//			over5000 = (int)((totalPrice - 5000) * 0.8);
//			under5000 *= 0.9;
//			totalPrice = over5000 + under5000;
//		}
//		
//		return totalPrice;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
