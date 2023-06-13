package test08;

public class Button {
	OnClickListener listener;
	
	public OnClickListener getListener() {
		return listener;
	}
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	static interface OnClickListener{
		void onClick();
	};
	void touch(){
		listener.onClick();
	};
	
}
