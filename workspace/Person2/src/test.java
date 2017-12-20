
public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro =new Person("山田太郎",20,"421-4141-3421","埼玉県");


		Person jiro=new Person("山田二郎",19,"041-1241-5421","北海道");


		Person kenta=new Person("南里健太",21,"090-1535-1794","東京都");

		Person jiro2=new Person("木村二郎",18,"031-7332-1351","神奈川県");

		Person hanako=new Person("鈴木花子",16,"090-1343-1355","栃木県");


		System.out.println(taro.name);			//山田太朗
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.adress);
		System.out.println();

		System.out.println(jiro.name);			//山田二郎
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.adress);
		System.out.println();

		System.out.println(kenta.name);			//南里健太
		System.out.println(kenta.age);
		System.out.println(kenta.phoneNumber);
		System.out.println(kenta.adress);
		System.out.println();

		System.out.println(jiro2.name);			//木村二郎
		System.out.println(jiro2.age);
		System.out.println(jiro2.phoneNumber);
		System.out.println(jiro2.adress);
		System.out.println();


		System.out.println(hanako.name);		//鈴木花子
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.adress);
		System.out.println();

	}

}
