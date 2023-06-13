package test05;

public class Parent {
	public String nation;
	
	public Parent() { 
		this("대한민국"); // ②인자가 하나인 다시 아래 메서드 Parent(String nation)를 호출
		System.out.println("Parent() call"); // ④아래 출력한 다음 이 부분 출력
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call"); // ③결국, 이 부분을 제일 먼저 출력하게 됨
	}
}
