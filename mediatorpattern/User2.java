package br.com.gustavo.mediatorpattern;

public class User2 extends Participant {
	
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
	
	public User2(ChatRoom chat) {
		this.chat = chat;
	}
}

