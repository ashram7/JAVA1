package test02;

public class ShopService {
	// 작성 위치
	private static ShopService shopservice=new ShopService();
	private ShopService() {}
	public static ShopService getInstance() {
		return shopservice;
	};
}