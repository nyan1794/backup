package lesson;

public class test {
public String name =null;
public int age=0;
public test(String name,int age){
	this.name=name;
	this.age=age;
}
public test(String name){
	this.name=name;
	this.age=0;
}
public test(int age){
	this.name="名前無し";
	this.age=age;
}
public test(int age,String name){
	this.age=age;
	this.name=name;
}
public void run(){
	System.out.println(this.name+"が走る");}
public void walk(){
	System.out.println(this.name+"が歩く");
}
public void talk(){
	System.out.println(this.name+"が話す");
}
}
