
public class Test {

	public static void main(String[] args) {
		TestUserDAO dao= new TestUserDAO();

		dao.selectByName("hanako");
		dao.select("taro", "123");
		dao.selectAll();
		dao.selectByPassword("789");
		dao.updateUserNamebyUserName("taro","takuro");
		dao.insert(4, "南里健太", "1794");
		dao.delete("takuro");
	}

}
