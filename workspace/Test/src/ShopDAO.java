import java.util.ArrayList;
import java.util.List;

public class ShopDAO {private ShopDTO s = new ShopDTO();

	private List<ShopDTO> list = new ArrayList<ShopDTO>();
	private ShopDTO DTO = new ShopDTO();
	public List<ShopDTO> setDTO(){

		s.setAaa("aaa");
		s.setBbb("aaa");
		s.setCcc("aaa");
		list.add(DTO);
		return list;
		}

}
