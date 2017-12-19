package lesson;

public class Person {

	public static void main(String[] args) {
		test taro =new test("山田太郎",11);
		test kenta=new test("南里健太",21);
		test nanasi=new test("名無しさん");
		test hanako= new test(17,"hanako");
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(nanasi.name);
		System.out.println(nanasi.age);
		System.out.println(hanako.age);
		System.out.println(hanako.name);
		taro.walk();
		taro.run();
		taro.talk();
		kenta.walk();
	}

}
