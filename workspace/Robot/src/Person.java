
public class Person {
		public String name=null;
		public int age=0;
		public Person(String name,int age){
		this.name=name;
		this.age=age;
		}
		public void writename(){
			System.out.println(this.name+"さんは"+this.age+"歳です");
		}
}