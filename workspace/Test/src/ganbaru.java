import java.util.ArrayList;
import java.util.List;

public class ganbaru {
	public static void main(String[] args){
		List<ShopDTO> shopList = new ArrayList<ShopDTO>();
		ShopDAO dao=new ShopDAO();

		shopList=dao.setDTO();
		for(int i = 0 ; shopList.size() > i ; i++){
			System.out.println(shopList.get(i).getAaa());
			System.out.println(shopList.get(i).getBbb());
			System.out.println(shopList.get(i).getCcc());
		}
	}
}
