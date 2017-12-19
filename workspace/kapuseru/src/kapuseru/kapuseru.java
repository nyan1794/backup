package kapuseru;

public class kapuseru {
	private static int count_human=0;
	private String name;
	private int birthday;
	private int manpukudo;

	public int getManpukudo(){
		return this.manpukudo;
	}
	public void setManpukudo(int n){
		this.manpukudo =n;
	}
	public void showManpukudo(){
		System.out.println("満腹度は"+manpukudo+"です");
	}
}
