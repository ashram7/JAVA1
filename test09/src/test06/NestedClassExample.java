package test06;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		//Tire는 인스턴스 멤버클래스이기 때문에 myCar라고 하는 참조변수를 통해서만 접근가능
		Car.Tire tire = myCar.new Tire();
		//Engine은 정적 멤버클래스이기 때문에 바깥쪽 Car 객체가 필요 없다.
		Car.Engine engine = new Car.Engine();
	}

}
