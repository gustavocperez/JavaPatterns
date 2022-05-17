package br.com.gustavo.mediatorpattern;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		
		ChatRoom chat = new ChatRoomImp();
		
		User1 u1= new User1(chat);
		u1.sentname("Aragy");
		u1.sndMsg("Olá from Aragy. Como vai a aula?");
		
		User2 u2 = new User2(chat);
		u2.sentname("Gustavo");
		u2.sndMsg("Tá Top! Bora outra");
	}

}
