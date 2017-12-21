public class Person{
	private int age,height=0;
	private String name= null;

		public void setHeight(int height){
			 this.height=height;

	}
		public int getHeight(){
			return this.height;
		}
		public void setAge(int age){
			this.age=age;
		}
		public int getAge(){
			return this.age;
		}
		public void setName(String name){
			this.name=name;
		}
		public String getName(){
			return this.name;
		}
		public void run(){
			System.out.println(this.name+"は走る");
		}
	}