package javapractice2;

public class password {

	public static void main(String[] args) {
		int pass=9999;
		for(int i=0;i<10000;i++){
			System.out.println(i);
			if(pass==i){
				System.out.println("Your password is"+i);
		}
		}
	}

}
