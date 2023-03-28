package sample03_casting;

public class PhoneApp {

	public static void main(String[] args) {
		// 클래스형변환 - 자식객체를 생성해서 부모타입 참조변수에 대입하는 것이 가능하다.
		/*
		 * 클래스형변환이 필요한 이유
		 * 	- 하나의 타입으로 다양한 객체의 타입을 참조할 수 있다.
		 * 		예시)
		 * 			SmartPhone p; 	// p참조변수는 SmartPhone, Galaxy, Iphone객체를 참조할 수 있다.
		 * 	- 하나의 타입으로 여러 객체를 관리(저장)할 수 있다.
		 * 		예시)
		 * 			Phone p = new Phone[10];
		 * 				p가 참조하는 배열은 Phone타입객체 10개를 저장할 수 있다.
		 * 				p가 참조하는 배열의 각 요소에 하위 객체(Phone, SmartPhone, FeaturPhone, Galaxy, Phone객체)들을 저장할 수 있다.
		 * 				p가 참조하는 배열의 각 요소에는 통화기능, 문자기능이 있는 모든 Phone종류를 저장할 수 있다.
		 * 			SmartPhone p = new SmartPhone[10];
		 * 				p가 참조하는 배열은 SmartPhone타입객체 10개를 저장할 수 있다.
		 * 				p가 참조하는 배열의 각 요소에 하위 객체(SmartPhone, Galaxy, Iphone)객체를 저장할 수 있다.
		 *				p가 참조하는 배열의 각 요소에는 통화기능, 문자기능, 게임기능, 인터넷 기능이 있는 모든 SmartPhone종류를 저장할 수 있다. 		
		 *	- 참조변수의 타입으로 객체의 종류를 제한할 수 있다.
		 *		예시)
		 *			public void testCall(Phone p) { ... }
		 *				* 통화기능을 테스트하는 메소드
		 *				* 매개변수의 타입을 Phone타입으로 지정함으로써 call() 기능이 제공되는 모든 Phone류 객체를 전달받을 수 있다.
		 *			public void testInternet(SmartPhone p) { ... }
		 *				* 인터넷기능을 테스트하는 메소드
		 *				* 매개변수의 타입을 SmartPhone타입으로 지정함으로써 internet() 기능이 제공되는 모든 SmartPhone류 객체를 전달받을 수 있다.
		 *			public void testApplePay(Iphone p) { ... }
		 *				* 애플페이기능을 테스트하는 메소드
		 *				* 매개변수의 타입을 Iphone타입으로 지정함으로써 applePay() 기능이 제공되는 모든 Iphone류 객체를 전달받을 수 있다.
		 *	- 참조변수의 타입으로 반환타입의 종류를 제한할 수 있다.
		 *		예시)
		 *			public Phone createPhone() { ... }
		 *				* 이 메소드는 모든 Phone류 객체를 반환할 수 있다.
		 *				public Phone createPhone() { return new Phone(); }
		 *				public Phone createPhone() { return new SmartPhone(); }
		 *				public Phone createPhone() { return new Iphone(); }
		 *			public SmartPhone createSmartPhone { ... }
		 *				* 이 메소드는 모든 SmartPhone류 객체를 반환할 수 있다.
		 *				public SmartPhone createSmartPhone() { return new SmartPhone;}
		 *				public SmartPhone createSmartPhone() { return new Iphone;}
		 *				public SmartPhone createSmartPhone() { return new Galaxy;}
		*/
		
		System.out.println("### Iphone객체를 Iphone타입 참조변수에 대입하였다.");
		Iphone p1 = new Iphone();
		p1.call();			// Phone
		p1.sms();			// Phone
		p1.internet();		// SmartPhone
		p1.game();			// SmartPhone
		p1.facetime();		// Iphone
		p1.applePay();		// Iphone
		System.out.println("### Iphone객체를 Iphone타입 참조변수로 참조하면 Iphone, SmartPhone, Phone객체의 기능을 실행할 수 있다.");
		System.out.println();
		
		System.out.println("### Iphone객체를 Smartphone타입 참조변수에 대입하였다.");
		SmartPhone p2 = new Iphone();
		p2.call();
		p2.sms();
		p2.game();
		p2.internet();
		//p2.facetime();		// Iphone
		//p2.applePay();		// Iphone
		System.out.println("### Iphone객체를 SmartPhone타입 참조변수로 참조하면 SmartPhone, Phone객체의 기능을 실행할 수 있다.");
		System.out.println("### Iphone객체를 SmartPhone타입 참조변수로 참조하면 Iphone객체의 기능을 실행할 수 없다.");
		System.out.println();
		
		//FeaturePhone p3 = new Iphone(); // FeaturePhone객체가 Iphone의 부모객체가 아니기때문에 클래스형변환 오류다.
		
		System.out.println("### Iphone객체를 phone타입 참조변수에 대입하였다.");
		Phone p4 = new Iphone();
		p4.call();			// Phone
		p4.sms();			// Phone
		//p4.internet();		// SmartPhone
		//p4.game();			// SmartPhone
		//p4.facetime();		// Iphone
		//p4.applePay();		// Iphone
		System.out.println("### Iphone객체를 Phone타입 참조변수로 참조하면 Phone객체의 기능을 실행할 수 있다.");
		System.out.println("### Iphone객체를 Phone타입 참조변수로 참조하면 SmartPhone, Iphone객체의 기능을 실행할 수 없다.");
		System.out.println();
		
		System.out.println("### Iphone객체를 Object타입 참조변수에 대입하였다.");
		Object p5 = new Iphone();
		//p5.call();			// Phone
		//p5.sms();			// Phone
		//p5.internet();		// SmartPhone
		//p5.game();			// SmartPhone
		//p5.facetime();		// Iphone
		//p5.applePay();		// Iphone
		System.out.println("### Iphone객체를 Phone타입 참조변수로 참조하면 Phone, SmartPhone, Iphone객체의 기능을 실행할 수 없다.");
	}
}
