
public class Person {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Test taro =new Test();
taro.name="山田太郎";
taro.age=20;
taro.phonenumber="090-1535-1794";
taro.address="far place";
Test hanako =new Test();
hanako.name="花子";
hanako.age=35;
hanako.phonenumber="0120117117";
hanako.address="too far to go";
System.out.println(hanako.name);
System.out.println(hanako.address);
hanako.run();
taro.run();
	}

}
