import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
			Map<String,Object> map=new HashMap<String,Object>();

			map.put("体重", 60);
			map.put("体型","太りめ");

			System.out.println(map.get("体重"));
			System.out.println(map.get("体型"));

	}

}
