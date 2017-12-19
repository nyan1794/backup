package phone;

public class phone implements mp3player , NewFunc {
	public void play(){
		System.out.println("再生する");
	}
	public void stop(){
		System.out.println("停止する");
	}
	public void next(){
		System.out.println("次へ");
	}
	public void back(){
		System.out.println("戻る");
	}
	public void call(){
		System.out.println("電話する");
	}
	public void mail(){
		System.out.println("メールする");
	}
	public void photo(){
		System.out.println("写真を撮る");
	}
	public void internet(){
		System.out.println("インターネットをひらく");
	}
	}
