package sec03.exam01;

public class Anonymous {
	//Anonymous 객체를 만들 수 있는 조건 (2가지중 하나만 만족)
	//상속(인터페이스구현)  or 인터페이스 
	
	//필드 초기값으로 대입
	//new Person() {}
	//Person() : 부모클래스를 상속해서
	//{} : 자식 클래스의 내용을 작성
	//new : 이것을 가지고 객체를 생성해서 (자식객체 생성)
	
	//Person field : 부모클래스 변수(필드)에 대입 => 결국 자동형변환이 일어남
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}		
	};
	
	void method1() {
		//로컬변수값으로 대입
		Person localVer = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}		
		};
		localVer.wake();
	}
	
	void method2(Person person) { //var Person person = 내용이 길어서 생략
		person.wake();
	}
}


















