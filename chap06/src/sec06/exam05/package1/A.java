package sec06.exam05.package1;

public class A {
	//필드
	public int field1;
	int field2;
	private int field3;

	public int getField1() {
		return field1;
	}

	public void setField2(int field2) {
		if(field2<0) {
			this.field2 = field2;
		}else {
			this.field2 = 0;
		}
	}
	
	public int getField3() {
		return field3;
	}

	public void setField3(int field3) {
		this.field3 = field3;
	}



	//생성자
	public A() {
		field1 = 1;   
		field2 = 1;   
		field3 = 1;   
		
		method1();   
		method2();   
		method3();   
	}
	
	//메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
}
