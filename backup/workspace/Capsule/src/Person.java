

public class Person {


	private String name=null;
	private int age=0;
	public String getName(){
		return this.name;

	}
	public int getAge(){
		return this.age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void showName(){
		System.out.println("名前は"+name+"です");
	}
	public void showAge(){
		System.out.println("年齢は"+age+"歳です");
	}
}
