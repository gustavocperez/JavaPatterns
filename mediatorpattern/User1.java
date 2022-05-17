package br.com.gustavo.mediatorpattern;

public class User1 extends Participant {
	
	private String name;
	private ChatRoom chat;

	@Override
	public void sndMsg(String msg) {
		chat.showMsg(msg, this);

	}

	@Override
	public void sentname(String name) {
		this.name = name;

	}

	@Override
	public String getName() {
		return name;
	}
	
	public User1(ChatRoom chat) {
		this.chat = chat;
	}
}
