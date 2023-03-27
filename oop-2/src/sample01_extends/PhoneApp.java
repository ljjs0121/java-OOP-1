package sample01_extends;

public class PhoneApp {

	public static void main(String[] args) {
		
		System.out.println("### Phone객체 생성 및 필드/메소드 사용하기");
		Phone p1 = new Phone();
		p1.tel = "010-1234-5678";	// Phone객체의 필드
		p1.call();					// Phone객체의 메소드
		p1.sms();					// Phone객체의 메소드
		System.out.println();
		
		System.out.println("### SmartPhone객체 생성 및 필드/메소드 사용하기");
		SmartPhone p2 = new SmartPhone();
		p2.tel = "010-1111-1234";	// p2가 참조하는 SmartPhone객체의 부모객체인 Phone객체의 필드
		p2.call();					// p2가 참조하는 SmartPhone객체의 부모객체인 Phone객체의 메소드
		p2.sms();					// p2가 참조하는 SmartPhone객체의 부모객체인 Phone객체의 메소드
		
		p2.ip = "192.164.10.11";		// p2가 참조하는 SmartPhone객체의 필드
		p2.email = "lee@naver.com";		// p2가 참조하는 SmartPhone객체의 필드
		p2.game();						// p2가 참조하는 SmartPhone객체의 메소드
		p2.internet();					// p2가 참조하는 SmartPhone객체의 메소드
		
		
		
	}	
}
