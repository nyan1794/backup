
public class Person {
	public String name,adress,phoneNumber;
	public int age;
	public Person (String name,int age){
		this.name=name;
		this.age=age;
	}
	public Person(int age, String name){
		this.name=name;
		this.age=age;
	}
	public Person(int age){
		this.age=age;
		this.name="名前無し";
	}
	public Person(String name){
		this.name=name;
		this.age=0;
	}
	public Person(){

	}

}
