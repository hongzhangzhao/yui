/*
	在其他类里面，父类型当做成员变量，用子类给赋值，
	这个其他类里面可以定义一些方法去使用这个父类去调用，
	子类的覆盖方法；
*/



interface ActionListener {
	public void actionPerformed();
}

class ActionHandler {
	ActionListener al;

	ActionHandler(ActionListener al) {
		this.al=al;
	}

	void process() {
		al.actionPerformed();
	}
}

class PlayMusicAction implements ActionListener {
	public void actionPerformed() {
		System.out.println("Play music");
	}
}

class Button {
	ActionListener als;

	void addListener(ActionListener al) {
		this.als = al;
	}
	void processEvent() {
		als.actionPerformed();
	}
}
