package sample05_abstract;

public class EventNotification {

	// MessageSender류 객체를 참조하는 멤버변수다.
	private MessageSender messageSender;	// 연결할 잭 만들기
	
	// MessageSender류 객체를 전달받아서 멤버변수에 저장하는 setter 메소드다. 
	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}
	
	// 고객명단과 메세지를 전달받아서 알림으로 보낸다.
	// 알림을 보낼때는 멈버변수 messageSender에 연결된 객체를 이용해서 보낸다.
	public void notice(Customer[] customers, String message) {
		// 멤버변수에 전달된 MessageSender류객체의 conect()를 실행해서 서버와 연결한다.
		messageSender.connect();
		
		// 고객들에게 메세지를 발송한다.
		for (Customer customer : customers) {
			// 고객의 전화번호를 조회한다.
			String to = customer.getTel();
			// 멤버변수 messageSender와 연결된 객체를 이용해서 지정된 수신자에게 메세지를 보낸다.
			messageSender.sendMessage(to, message);
			System.out.println();
		}
	}
	
}
