import java.util.Random;

public class Person {
		public void rand(){
			Random rand= new Random();
			int[] num=new int[8];
			String[] st=new String[8];
			String randomNum="";
			for (int i=0;i<8;i++){
				num[i]=rand.nextInt(10);
				st[i]=String.valueOf(num[i]);
				randomNum=randomNum+st[i];
			}
			System.out.println(randomNum);
		}
}