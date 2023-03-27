package sample01_extends;
// 상속 이론, 객체 생성 및 메소드 사용

public class Phone {

	String tel;
	
	void call() {
		System.out.println("Phone의 call()이 실행됨 ["+tel+"]");
	}
	
	void sms() {
		System.out.println("Phone의 sms()이 실행됨 ["+tel+"]");
	}
}
