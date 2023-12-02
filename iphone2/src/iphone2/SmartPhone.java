package iphone2;

//implments(インターフェイス実装)
//演習⑥ (継承 + Mp3playerとNewFunctionはインターフェイス)
public class SmartPhone extends Phone implements Mp3player,NewFunction{
	
	// 演習② (Mp3playerでのルール+処理内容も記述)
	public void play() {
		System.out.println("再生");
	}
	public void stop() {
		System.out.println("停止");
	}
	public void next() {
		System.out.println("次へ");
	}
	public void back() {
		System.out.println("戻る");
	}
}
