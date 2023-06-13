package test08;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setListener(new CallListener());
		btn.touch();

	}

}

