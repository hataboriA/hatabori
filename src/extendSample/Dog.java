package extendSample;

public class Dog {
	String type = "犬";
	String voice;
	
	Dog(){
		this.voice = "わんわん";
	}
	Dog(String v){
		this.voice = v;
	}
	void bark() {
		System.out.println(voice);
	}
}