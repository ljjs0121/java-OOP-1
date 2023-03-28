package sample03_casting;
// 배열객체에 값을 저장하고 인덱스에 담겨있는 객체의 기능 실행
// instanceof 연산자 사용
public class PhoneApp3 {

	public static void main(String[] args) {
		
		// phones 참조변수가 참조하는 배열객체는 SmartPhone류 객체를 5개 저장할 수 있다.
		SmartPhone[] phones = new SmartPhone[5];
		phones[0] = new SmartPhone();
		phones[1] = new Iphone();
		phones[2] = new Iphone();
		phones[3] = new Galaxy();
		phones[4] = new Galaxy();
		// 자식객체가 부모객체를 담을 수 없다.
		//phones[4] = new FeaturePhone();	// featurePhone객체는 SmartPhone객체를 담는 배열에 저장할 수 없다.
		//phones[4] = new Phone(); 			// Phone객체는 SmartPhone객체를 담는 배열에 저장할 수 없다.
		
		for (SmartPhone p : phones) {
			/* p라는 배열객체가 해당 클래스와 연결되었는지 알 수 있다. */
//			boolean a = p instanceof Object;
//			boolean b = p instanceof Phone;
//			boolean d = p instanceof SmartPhone;
//			boolean e = p instanceof Iphone;
//			boolean f = p instanceof Galaxy;
			// Phone
			p.call();
			p.sms();
			// SmartPhone
			p.internet();
			p.game();
			
			if(p instanceof Iphone) { // instanceof > 만약 p가 참조하는 객체가 Iphone인 연결된 객체라면
				Iphone x = (Iphone) p;
				x.applePay();
				x.facetime();
			} else if (p instanceof Galaxy) { // instanceof > 만약 p가 참조하는 객체가 Galaxy인 연결된 객체라면
				Galaxy x = (Galaxy) p;
				x.samsungPay();
				x.recodeVoice();
			}
			System.out.println();
		}
		
	}
}
