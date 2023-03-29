package sample05_abstract;

public class EventNotificationApp {

	public static void main(String[] args) {
		
		// MessageSender류 객체를 생성한다.
		SmsMessageSender sms = new SmsMessageSender("hia", "qwer1234");
		KakaoMessageSender katalk = new KakaoMessageSender("hia", "qwer1234");
		
		// 고객정보를 생성한다.
		Customer[] customers = {
				new Customer("홍두깨", "010-1111-1111"),
				new Customer("김두리", "010-2222-4234"),
				new Customer("박찬영", "010-3333-8457"),
				new Customer("이민성", "010-4444-4345"),
				new Customer("최치열", "010-5555-9678"),
		};
		
		// 이벤트발송을 담당하는 객체를 생성한다.
		EventNotification notification = new EventNotification();
		// 이벤트발송담당객체가 사용할 MessageSender류 객체를 전달한다.
		notification.setMessageSender(katalk);
		// 고객정보와 메세지를 전달해서 이벤트정보를 알린다.
		notification.notice(customers, "4월 할인 이벤트 행사 안내입니다...");
		
	}
}
