
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro=new Person();
		taro.setName("山田太郎");
		taro.setAge(20);
		taro.setHeight(160);

		Person kenta =new Person();
		kenta.setName("南里健太");
		kenta.setAge(21);
		kenta.setHeight(174);

		System.out.println(taro.getName()+"さんは"+taro.getAge()+"歳で、身長は"+taro.getHeight()+"cmです");
		System.out.println(kenta.getName()+"さんは"+kenta.getAge()+"歳で、身長は"+kenta.getHeight()+"cmです");
		kenta.run();
	}

}
