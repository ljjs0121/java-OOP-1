package sample05_abstract;

public class SmsMessageSender extends MessageSender {

	public SmsMessageSender(String id, String password) {
		super(id, password);
	}
	
	public void connect() {
		System.out.println("### SMS Sever 연결...");
		System.out.println("["+getId()+"] ["+getPassword()+"]로 SMS Server와 연결됨");
	}
	
	public void sendMessage(String to, String message) {
		System.out.println("### SMS 발송");
		System.out.println("수신자["+to+"] ["+message+"]로 문자메세지 발송 완료");
	}

}
