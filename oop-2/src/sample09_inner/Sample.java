package sample09_inner;
// 내부클래스 특징
public class Sample {

	public static void main(String[] args) {
		// 원래 Sample.User1 = new Sample.User1(); 으로 작성해야하지만 
		// 같은 클래스이기 때문에 아래처럼 작성가능하다.
		// 정적메소드에서는 멤버 내부클래스를 사용할 수 없다.
//		User1 user1 = new User1();
		User2 user2 = new User2();
	}
	
	public static void 정적메소드() {
		// 정적메소드에서는 멤버 내부클래스를 사용할 수 없다.
//		User1 user1 = new User1();
		User2 user2 = new User2();
	}
	
	public void 멤버메소드() {		
		// 멤버메소드안에서는 멤버변수를 사용할 수 있다. 
		User1 user1 = new User1();
	}
	
	// 멤버 내부클래스, 외부 클래스가 객체 생성된 이후에만 사용가능하다.
	class User1 {
		int no;
		int name;
	}
	
	// 정적 내부클래스, 외부 클래스의 객체 생성 여부와 상관없이 사용가능하다.
	static class User2 {		
		int no;
		int name;
	}
}
