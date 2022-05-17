package br.com.gustavo.mediatorpattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatRoomImp implements ChatRoom {
	
	DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyy hh:mm");
	Date date = new Date();

	@Override
	public void showMsg(String msg, Participant p) {
		System.out.println(p.getName()+"1gets message: "+msg);
		System.out.println("\t\t\t\t"+"["+dateFormat.format(date).toString()+"]");
	}
	
	

}
