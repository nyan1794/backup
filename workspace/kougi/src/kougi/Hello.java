package kougi;

public class Hello{
	public static int i=1;

	public static void main(String[]args){
		System.out.println(i);

		Change();
		show();

	}
	public int Change(){
		return i=4;
	}
	public void show(){
		System.out.println(i);
	}
}