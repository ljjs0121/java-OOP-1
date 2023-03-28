package sample03_casting;
// 객체의 생성에 따른 기능 실행 
public class PhoneApp4 {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		FeaturePhone phone2 = new FeaturePhone();
		SmartPhone phone3 = new SmartPhone();
		Iphone phone4 = new Iphone();
		Galaxy phone5 = new Galaxy();
		
		// 객체의 통화기능 실행해보기
		PhoneApp4.통화기능테스트(phone1);
		PhoneApp4.통화기능테스트(phone2);
		PhoneApp4.통화기능테스트(phone3);
		PhoneApp4.통화기능테스트(phone4);
		PhoneApp4.통화기능테스트(phone5);
		
		// 객체의 인터넷기능 실행해보기
		/* 매개변수가 SmartPhone타입이기 때문에 Phone객체는 FeaturePhone객체는 전달할 수 없다. */
		//PhoneApp4.인터넷기능테스트(phone1);	
		//PhoneApp4.인터넷기능테스트(phone2);	
		PhoneApp4.인터넷기능테스트(phone3);
		PhoneApp4.인터넷기능테스트(phone4);
		PhoneApp4.인터넷기능테스트(phone5);
		
		// 객체의 애플페이기능 실행해보기
		/* 매개변수가 Iphone타입이기 때문에 Phone, SmartPhone, Galaxy객체는 전달할 수 없다. */
		//PhoneApp4.애플페이기능테스트(phone1);	
		//PhoneApp4.애플페이기능테스트(phone2);
		//PhoneApp4.애플페이기능테스트(phone3);
		PhoneApp4.애플페이기능테스트(phone4);
		//PhoneApp4.애플페이기능테스트(phone5);
		
		// 객체의 삼성페이기능 실행해보기
		/* 매개변수가 Galaxy타입이기 때문에 Phone, SmartPhone, Iphone객체는 전달할 수 없다.*/
		//PhoneApp4.삼성페이기능테스트(phone1);	
		//PhoneApp4.삼성페이기능테스트(phone2);
		//PhoneApp4.삼성페이기능테스트(phone3);
		//PhoneApp4.삼성페이기능테스트(phone4);
		PhoneApp4.삼성페이기능테스트(phone5);
		
	}
	
	// Phone류 객체는 통화기능을 가지고 있다. 		Phone타입의 매개변수 p는 Phone객체 혹은 Phone객체의 하위 객체만 전달받을 수 있다.
	static void 통화기능테스트(Phone p) {
		p.call();
	}
	
	// SmartPhone류 객체는 인터넷기능을 가지고 있다.
	static void 인터넷기능테스트(SmartPhone p) {
		p.internet();
	}
	
	// Iphone류 객체는 애플페이기능을 가지고 있다.
	static void 애플페이기능테스트(Iphone p) {
		p.applePay();
	}
	
	// Galaxy류 객체는 삼성페이기능을 가지고 있다.
	static void 삼성페이기능테스트(Galaxy p) {
		p.samsungPay();
	}
}
