package sample01_extends;

public class PhoneApp2 {

	public static void main(String[] args) {
		
		System.out.println("### Galaxy객체 생성 및 필드/메소드 사용하기");
		// galaxy가 참조하는 Galaxy객체의 조상객체인 Phone객체의 속성과 기능 사용하기
		Galaxy galaxy = new Galaxy();		
		galaxy.tel = "010-3333-3333";		
		galaxy.call();						 
		galaxy.sms();						 
		
		// galaxy가 참조하는 Galaxy객체의 부모객체인 SmartPhone객체의 속성과 기능 사용하기
		galaxy.ip = "187.173.14.10";		
		galaxy.email = "sam@daum.com";			
		galaxy.game();						
		galaxy.internet();					
		
		// galaxy참조변수가 참조하는 Galaxy객체의 속성과 기능 사용하기
		galaxy.samsuongId = "sam@samsung.com";	// p4가 참조하는 Galaxy객체의 필드
		galaxy.samsungPay();					// p4가 참조하는 Galaxy객체의 메소드
	}
}
