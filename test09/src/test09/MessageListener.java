package test09;

public class MessageListener implements Button.OnClickListener {
	//중첩 인터페이스라서 경로를 표시해야함

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}

}
