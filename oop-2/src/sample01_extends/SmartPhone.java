package sample01_extends;

public class SmartPhone extends Phone {
	
	String ip;
	String email;
	
	void internet() {
		System.out.println("SmartPhone의 internet() 실행됨");
	}
	
	void game() {
		System.out.println("SmartPhone의 game() 실행됨");
	}
}
