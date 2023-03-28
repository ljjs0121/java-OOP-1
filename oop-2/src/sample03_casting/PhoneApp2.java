package sample03_casting;
// 클래스형변환
public class PhoneApp2 {
	
	public static void main(String[] args) {
		// 클래스 형변환 연산자를 이용해서 참조하는 객체를 변경하기
		// 객체를 참조한 후에 가능
		
		Phone p1 = new FeaturePhone();
		System.out.println("### FeaturePhone객체를 Phone타입 참조변수가 참조한다.");
		System.out.println(p1.toString());  // Object
		p1.call();							// Phone
		p1.sms();
		System.out.println("### FeaturePhone객체를 참조하기");
		FeaturePhone f1 = (FeaturePhone) p1;
		System.out.println(f1.toString());	// Object //toString > 객체의 해시코드 값
		f1.call(); 							// Phone
		f1.mp3(); 							// FeaturePhone
		System.out.println();
		
		Phone p2 = new SmartPhone();
		System.out.println("### SmartPhone객체를 Phone타입 참조변수가 참조한다.");
		System.out.println(p2.toString());  // Object
		p2.call();							// Phone
		SmartPhone s2 = (SmartPhone) p2;
		System.out.println(s2.toString());	// Object
		s2.call();							// Phone
		s2.internet();						// SmartPhone
		//System.out.println("### FeaturePhone객체를 참조하기");
		/* 실행하면 ClassCastException 오류 발생 > 형변환 오류 */
		// FeaturePhone f2 = (FeaturePhone) p2;		
		//f2.mp3();							// FeaturePhone
		System.out.println();
		
		Phone p3 = new Iphone();
		System.out.println("### IPhone객체를 Phone타입 참조변수가 참조한다.");
		System.out.println(p3.toString());  // Object
		p3.call();							// Phone
		System.out.println("### SmartPhone객체를 참조하기");
		SmartPhone s3 = (SmartPhone) p3;
		System.out.println(s3.toString()); 	// Object
		s3.call();							// Phone
		s3.internet();						// SmartPhone
		
		System.out.println("### IPhone객체를 참조하기");
		Iphone i3 = (Iphone) p3;
		System.out.println(i3.toString()); 	// Object
		i3.call();							// Phone			
		i3.internet();						// SmartPhone
		i3.applePay();						// Iphone
		
		System.out.println("### FeaturePhone객체를 참조하기");
		/* 실행하면 ClassCastException 오류 발생 > 형변환 오류 */
//		FeaturePhone f3 = (FeaturePhone) p3;
//		System.out.println("### Galaxy객체를 참조하기");
//		Galaxy g3 = (Galaxy) p3;
		System.out.println();
		
		Phone p4 = new Galaxy();
		System.out.println("### Galaxy객체를 Phone타입 참조변수가 참조한다.");
		System.out.println(p4.toString());  // Object
		p4.call();							// Phone
		
		System.out.println("### SmartPhone객체를 참조하고 SmartPhone객체의 기능 실행하기");
		SmartPhone s4 = (SmartPhone) p4;
		s4.internet();
		/* 아래의 방법으로 클래스형변환연산자로 SmartPhone을 참조하게하고, SmartPhone객체의 기능을 실행할 수 있다.*/
		((SmartPhone) p4).internet();
		
		System.out.println("### Galaxy객체를 참조하고 Galaxy객체의 기능 실행하기");
		/* 클래스형변환연산자로 Galaxy를 참조하게하고, Galaxy객체의 기능을 실행할 수 있다.*/
		((Galaxy) p4).samsungPay();
	}
}
