package test09;

public class Button {
	OnClickListener listener; //인터페이스 타입 필드(listener)를 선언
	
	//var OnClickListener listener = new CallListener(); 자동형변환 / 다형성
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//실제 버튼을 클릭 했을 때 실행하는 내용을 작성하지 않음
	void touch() {
		listener.onClick(); //구현 객체의 onClick() 메소드 호출
	}

	//중첩인터페이스 : 버튼을 클릭했을때 실제로 실행할 내용을 담고 있는 구현객체를 얻기 위해서...
	//static가 선언된 interface는 객체 없이 사용가능
	static interface OnClickListener{
		void onClick();
	}
}
