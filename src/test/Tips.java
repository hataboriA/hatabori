package test;

import java.util.ArrayList;

//--------------------- Tips1
public class Tips {
	public static void main(String[] args) {
//		int argsNum = (int)Math.signum(Integer.parseInt(args[0]));	
//
//		switch(argsNum) {
//			case (int)1.0:
//				System.out.println("正です");
//				break;
//			case (int)-1.0:
//				System.out.println("負です");
//				break;
//			case (int)0.0:
//				System.out.println("0です");
//				break;	
//		}
		
		//--------------------- Tips2
//		int count = 0;
//		for(int i = 1; i <= 10; i++) {
//			count += i;
//		}
//		System.out.println(count);

		//--------------------- Tips3
//		int num = 8;
//		if(num % 2 == 0) {
//			System.out.println("numは偶数");
//		}else {
//			System.out.println("numは奇数");
//		}
		
		//--------------------- Tips4
//		int n = -5;
//		
//		if(n > 0) {
//			for(int i = n; i >= 0; i--) {
//				System.out.println(n = i);
//			}
//			
//		}else if(n < 0) {
//			for(int i = n; i <= 0; i++) {
//				System.out.println(n = i);
//			}	
//		}else if(n == 0) {
//			System.out.println("0です");
//		}
		//--------------------- Tips5
//		List<String> arry = new ArrayList<String>();
//		int n = 5;
//
//		for(int i = 1; i <= n; i++) {
//			arry.add(String.valueOf(i));
//		}
//		String result = String.join(",", arry);
//		System.out.println(result);
		
		//--------------------- Tips6
//		int[] arry = {64, 3, 45, 291, 178};
//		int min = arry[0];
//		
//		for(int i = 0; i < arry.length; i++) {
//			if(min > arry[i]) min = arry[i];
//		}
//		
//		System.out.println(min);
		//--------------------- Tips7
//		int n = -105;
//		System.out.println(n);
		
		//--------------------- Tips8
//		int x = -8;
//		int y = -8;
//		
//		if(x > y) {
//			System.out.println(x - y);
//		}else if(y > x) {
//			System.out.println(y - x);
//		}else if(y == x) {
//			System.out.println("差分なし");
//		}		
		
		//--------------------- Tips9
//		int n = 5;
//		for(int i = 0; i < n; i++) {
//			String displayMark = createMark(n);
//			System.out.println(displayMark);
//		}
		//--------------------- Tips10
//		int n = 5;
//		for(int i = 1; i <= n; i++) {
//			String displayMark = createMark(i);
//			System.out.println(displayMark);
//		}
		
		//--------------------- Tips11
//		int n = 5;
//		for(int i = n; i > 0; i--) {
//			String displayMark = createMark(i);
//			System.out.println(displayMark);
//		}
		
		//--------------------- Tips12
//		int n = 5;
//		for(int i = n; i > 0; i--) {
//			String displayMark = createMark(i);
//			String displaySpace = createSpace(i, n);
//			System.out.println(displaySpace + displayMark);
//		}
		
		//--------------------- Tips13
//		int n = 5;
//		for(int i = 0; i < n; i++) {
//			String displayMark = createMark(i);
//			System.out.println(displayMark);
//		}
		
		//--------------------- Tips14
//		int a = 5;
//		int b = 1;
//		int c = 9;
//		
//		int[] arry = {a, b, c};
//		
//		int max = arry[0];
//		for(int i = 0; i < arry.length; i++) {
//			if(max < arry[i]) max = arry[i];
//		}
//		System.out.println(max);
			
		//--------------------- Tips15
//		String n = "あいうえお";
//		String[] arryN = n.split("");
//	
//		String save = "";
//		for(int i = arryN.length - 1; i >= 0; i--) {
//			save += arryN[i];
//		}
//		System.out.println(save);
		
		//--------------------- Tips16

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("文字列を入力してください（10文字まで）");
//		String text = scanner.nextLine();
//		
//		if(text.length() >= 10) {
//			System.out.println("10文字を超えています。再入力してください");
//			text = scanner.nextLine();
//		}
//		
//		System.out.println(text);
//		
		//--------------------- Tips17
		
//		int n = 5;
//		int sum = 0;
//		StringBuilder val = new StringBuilder();
//		
//		for(int i = 1; i <= n; i++) {
//			sum += i;
//			
//			val.append(i);
//			if(i != n) val.append("+");
//		}
//		val.append("=" + sum);
//		String result = val.toString();
//				
//		System.out.println(result);
		
		//--------------------- Tips18
		
//		String a = "あ";
//		String b = "i";
//		
//		if(a.equals(b)) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		
		//--------------------- Tips19
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("yesと入力してください");
//		String text = scanner.nextLine();
//		final String YES = "yes";
//		
//		do {
//			System.out.println("もう一回入力しますか？");
//			text = scanner.nextLine();
//		}while(text.equals(YES));
		
		
		//--------------------- Tips20
//		String strObj = "abcabc";
//		String str = "o";
//		System.out.println(strObj.indexOf(str));
		
		//--------------------- Tips21
//		String str = "abc,123,あいう";
//		str = str.replaceAll(",", "");
//		System.out.println(str);
		
		//--------------------- Tips22
//        int sum = sumOf(1, 2);
//        System.out.println(sum);
        
		//--------------------- Tips23
//        int bigger = bigger(2, 22);
//        System.out.println(bigger);
        
		//--------------------- Tips24
//        int diff1 = diff(5, 2);
//        System.out.println(diff1); // 3と表示
// 
//        int diff2 = diff(2, 5);
//        System.out.println(diff2); // 3と表示
        
		//--------------------- Tips25
//        int total = total(3);
//        System.out.println(total);
        
		//--------------------- Tips26
//        int[] nums = { 1, 2, 3, 4, 5 };
//        
//        int sum = sumOfArray(nums);
//        System.out.println(sum);
        
		//--------------------- Tips27
//	       int[] nums = { 1, 2, 3, 4 };
//	     
//	        System.out.println(averageOfArray(nums)); // 2.5と表示
		
		//--------------------- Tips28
//		List<Integer> num = new ArrayList<Integer>();
//		
//		for(int i = 0; i < 10; i++) {
//			num.add(i + 1);
//		}
//
//		Collections.sort(num, Collections.reverseOrder());
//		System.out.println(num);
		
		//--------------------- Tips29
//		int count = 1;
//		
//		do {
//			if(count % 3 == 0) {
//				System.out.println(count);	
//			}
//			count++;
//		}while(count <= 30);
		
		//--------------------- Tips30
		
//		String[] strData = {
//			"ぼぼ",
//			"ぼぼ",
//			"ぼ"
//		};
//		List<String> strArray = new ArrayList<String>();
//		int maxStrSize = strData[0].length();
//	
//		for(int i = 0; i < strData.length; i++) {
//			strArray.add(strData[i]);
//			if(maxStrSize < strArray.get(i).length()) {
//				maxStrSize = strArray.get(i).length();
//			}	
//		}
//		
//		String displayStr = "";
//		for(int i = 0; i < strArray.size(); i++) {
//			if(strArray.get(i).length() == maxStrSize) {
//				displayStr += strArray.get(i) + ",";
//			}
//		}
//		
//		System.out.println(displayStr);
		
		//--------------------- Tips31
//		String[] arry = {"aki", "huyu", null, "ako"};
//		
//		String target = "";
//		for(String el: arry) {
//			if(el == null) continue;
//			if(el.charAt(0) == 'a') System.out.println(el);
//		}
		
		//--------------------- Tips32
//		int num = 124;
//		String target = String.valueOf(num);
//		if(target.contains("3")) {
//			System.out.println("3があります");
//		}else {
//			System.out.println("3がありません");
//		}
		//--------------------- Tips33
//		int num = 1227723;
//		
//		String target = String.valueOf(num);
//		boolean isSameChar = false;
//		
//		for(int i = 0; i < target.length(); i++) {
//			isSameChar = checkSameChar(target, target.charAt(i), i);
//			if(isSameChar) break;
//		}
//		
//		if(isSameChar) {
//			System.out.println("同じ数値があります");
//		}else {
//			System.out.println("同じ数値がありません");
//		}
	
	
		//--------------------- Tips34
//		char[] chars = {'a', 'p', 'p', 'l', 'e'};
//		String newCharArray = new String(chars);
//		int matchIndex = 0;
//		
//		matchIndex = newCharArray.indexOf("l");
//		System.out.println(matchIndex);
		

		//--------------------- Tips35
		
//		char[] chars = {'a', 'p', 'p', 'l', 'e'};
//		char serchText = 'p';
//		int matchSize = 0;
//		
//		for(int i = 0; i < chars.length; i++) {
//			if(chars[i] == serchText) matchSize++;
//		}
//		System.out.println(matchSize);
		
		//--------------------- Tips36
//		char[] chars = {'a', 'p', 'd', 'l', 'e'};
//		String resultText = "重複していません";
//		
//		for(int i = 0; i < chars.length - 1; i++) {
//			boolean isSameChar = checkSameChar(chars, chars[i], i);
//			if(isSameChar) {
//				resultText = "重複しています";
//				break;
//			}
//		}
//		System.out.println(resultText);
		
		//--------------------- Tips37
//		double d = 12.34;
//		
//		int displayNum = (int)d;
//		System.out.println(displayNum);
		
		//--------------------- Tips38
//		
//		char text = 'c';
//		System.out.println((char)(text + 1));
		
		//--------------------- Tips40
//		int num = 123;
//		String newNum = String.valueOf(num);
//		System.out.println(newNum);
		
		
		//--------------------- Tips41
//		double[] nums = { 1.1, 2.2, 3.3 };
//		int[] newNums = new int[nums.length];
//		
//		for(int i = 0; i < nums.length; i++) {
//			newNums[i] = (int)nums[i];
//			System.out.println(newNums[i]);
//		}
		
		//--------------------- Tips42
//		List<Double> nums = new ArrayList<>();
//		nums.add(2.2);
//		nums.add(1.2);
//		
//		List<Integer> newNums = new ArrayList<>();
//		
//		for(double num: nums) {
//			newNums.add((int) num);
//		}
//		for(int num: newNums) {
//			System.out.println(num);
//		}
		
		
		//--------------------- Tips43
//		String a = "10";
//		String b = "20";
//		
//		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
		
		//--------------------- Tips44
//		int[] arry = {6, 7, 3};
//		int sum = 0;
//		double divided = 0;
//		
//		for(int el: arry) {
//			sum += el;
//		}
//		divided = (double)sum / arry.length;
//		
//		System.out.println("合計 " + sum);
//		System.out.println("平均値 " + divided);
		
		
		//--------------------- Tips45
//		String text = "あいう";
//		
//		char[] charList = new char[text.length()]; 
//		for(int i = 0; i < text.length(); i++) {
//			charList[i] = text.charAt(i);
//		}
//		
//		for(int i = 0; i < text.length(); i++) {
//			System.out.println(charList[i]);
//		}	
		
		//--------------------- Tips47
//		List<String> strLists = new ArrayList<>();
//		strLists.add("api");
//		strLists.add("android");
//		strLists.add("binary");
//		strLists.add("class");
//		strLists.add("cache");
//		strLists.add("domain");
//		strLists.add("database");
//		
//		
//		for(int i = 0; i < strLists.size(); i++) {
//			String el = strLists.get(i);
//			if(el.charAt(0) == 'c') {
//				strLists.remove(i);
//				i--;
//			}
//		}
//		
//		System.out.println(strLists);
		
		//--------------------- Tips48
//		Object[] obj = {
//			"りんご",
//			"ごりらra",
//		};
//		for(int i = 0; i < obj.length; i++) {	
//			System.out.println(obj[i] + " : " + ((String) obj[i]).length());
//		}
//		
		//--------------------- Tips49
//		List<String> validityWordList = new ArrayList<>();
//		validityWordList.add("for");
//		validityWordList.add("Class");
//		validityWordList.add("i");
//		validityWordList.add("num");
//		validityWordList.add("public");
//		validityWordList.add("a");
//		
//		List<String> invalidWordList = new ArrayList<>();
//		invalidWordList.add("class");
//		invalidWordList.add("for");
//		invalidWordList.add("if");
//		invalidWordList.add("public");
//		invalidWordList.add("static");
//		invalidWordList.add("while");
//		
//		List<String> validity = new ArrayList<>();
//		List<String> invalid = new ArrayList<>();
//		
//		String extractValidWord = "";
//		String extractInvalidWord = "";
//		
//		for(String validWord: validityWordList) {
//			for(String invalidWord: invalidWordList) {
//				
//				extractValidWord = checkValidWord(validWord);
//				if(extractValidWord != "") {
//					validity.add(extractValidWord);	
//				}
//				
//				extractInvalidWord = checkInvalidWord(invalidWord);
//				if(extractValidWord != "") {
//					validity.add(extractInvalidWord);
//				}
//			}
//		}
		
		
//	 	ArrayList<String> identifierList = new ArrayList<>();
//        identifierList.add("for");
//        identifierList.add("Class");
//        identifierList.add("i");
//        identifierList.add("num");
//        identifierList.add("public");
//        identifierList.add("a");
// 
//        ArrayList<String> excludeList = new ArrayList<>();
//        excludeList.add("class");
//        excludeList.add("for");
//        excludeList.add("if");
//        excludeList.add("public");
//        excludeList.add("static");
//        excludeList.add("while");
// 
//        ArrayList<String> validWordList = new ArrayList<>();
//        ArrayList<String> invalidWordList = new ArrayList<>();
//        
//        for(String targetWord : identifierList) {
//        	if(isExcludeWord(targetWord, excludeList)) {
//        		invalidWordList.add(targetWord);
//        	}else {
//        		validWordList.add(targetWord);
//        	}
//        }
//        
//        System.out.println("有効 : " + validWordList);
//        System.out.println("無効 : " + invalidWordList);

		
		//--------------------- Tips50
//		Double num = 1.2;
//		double num2 = num;
//		
//		System.out.println((int)num2);
		
	}
	
	private static boolean isExcludeWord(String targetWord, ArrayList<String> excludeList) {
		boolean isexclude = false;
		
		 for(String excludeWord : excludeList) {
			 if(targetWord.equals(excludeWord)) {
				 isexclude = true;
				 break;
			 }else{
				 isexclude = false;
			 }
		 }
		 return isexclude;
	}
	
	public static boolean checkSameChar(char target[], char targetSplit, int currentIndex) {
		String newTarget = String.valueOf(target);
		int matchIndex = newTarget.indexOf(targetSplit, currentIndex + 1);
		return  matchIndex >= 0;
	}
	
	public static double averageOfArray(int[] nums) {
		double mas = 0;
		for(int i = 0; i < nums.length; i++) {
			mas  += nums[i];
		}
		return mas / nums.length;
	}
	public static int sumOfArray(int[] arry) {
		int sum = 0;
		for(int i = 1; i <= arry.length; i++) {
			sum += i;
		}
		return sum;
	}
	public static int total(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	public static String createMark(int n) {
		String markBox = "";
		for(int i = 0; i < n; i++) {
			markBox += "●";
		}
		return markBox;
	}
	public static String createSpace(int index, int n) {
		String spaceBox = "";
		int spaceSize = n - index;
		for(int i = 0; i < spaceSize; i++) {
			spaceBox += " ";
		}
		
		return spaceBox;
	}
//	public static boolean isInt (String text) {
//		try {
//			Integer.parseInt(text);
//			return true;
//		}catch (NumberFormatException e){
//			return false;
//		}
//	}
	public static int sumOf(int a, int b) {
		return a + b;
	}
	public static int bigger(int a, int b) {
		return Math.max(a, b);
	}
	public static int diff(int a, int b) {
		return Math.max(a, b) - Math.min(a, b);
	}
}



