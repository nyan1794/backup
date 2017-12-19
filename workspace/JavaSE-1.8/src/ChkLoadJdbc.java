/**
 *
 */

/**
 * @author kentananri
 *
 */
public class ChkLoadJdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws InstantiationException,IllegalAccessException
		{
		String msg="";
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg="ドライバのロードが成功しました";
		}catch(ClassNotFoundException e){
			msg="ドライバのロードに失敗しました";
		}
		System.out.println(msg);
		}

	}
		// TODO 自動生成されたメソッド・スタブ




