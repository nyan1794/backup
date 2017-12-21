
public class SmartPhone extends Mp3player {//Smartphone にMp3playerを継承
										   //SmartphoneはMp3playerの子クラスである
	public void call(){					   //SmartphoneにMp3playerのメゾットをかくと上書き(オーバーライド)することができる。
		System.out.println("電話");		   //オーバーライドした際同名の親クラスのメゾットは無視され子クラスのメゾットが実行される
	}
	public void mail(){
		System.out.println("メール");
	}
	public void photo(){
		System.out.println("写真");
	}
	public void internet(){
		System.out.println("インターネット");
	}
	public void play(){
		System.out.println("再生(ハイレゾ機能)");
	}
	public void stop(){
		System.out.println("停止(ハイレゾ機能)");
	}
	public void next(){
		System.out.println("次へ(ハイレゾ機能)");
	}
	public void back(){
		System.out.println("戻る(ハイレゾ機能)");
	}
}

