
public class Test {

	public static void main(String[] args) {
		Person taro=new Person("山田太郎",20);
		Person sabu=new Person("saburo");
		Person noname=new Person(25);
		Person hanako=new Person(17,"hanako");
		System.out.println(taro.age+taro.name);
		System.out.println(sabu.name+sabu.age);
		System.out.println(noname.name+noname.age);
		System.out.println(hanako.name+hanako.age);

	}

}
