package iphone2;

public class Iphone {
	public static void main(String[]args) {
		
		// 演習③ (実行)
		SmartPhone iphone = new SmartPhone();
		iphone.play();
		iphone.stop();
		iphone.next();
		iphone.back();
		
		//演習⑦ (継承+インターフェイス追加分)
		iphone.call();
		iphone.mail();
		iphone.photo();
		iphone.internet();
		
	}
}
