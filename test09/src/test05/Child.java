package test05;

public class Child extends Parent {
	private String name;
	
	public Child() {  
		// ①super(); 가 보이지는 않지만 this('홈길동'); 보다 먼저 실행됨 즉, Parent()가 실행됨
		this("홍길동");  // ⑤이 생성자는 인자가 하나인 아래 메서드 Child(String name)를 호출하게 된다.
		System.out.println("Child() call");  // ⑦이 부분을 네 번째로 출력
	}
	
	public Child(String name) {  
		this.name = name;
		System.out.println("Child(String name) call");  // ⑥이 부분을 세 번째로 출력
	}
}
