package sample08_inner;
/* 내부클래스에 대하여 */
public class Sample1 {
	
	private int a = 100;
	private static int b = 200;
	
	public void m1() {
		System.out.println("외부클래스의 멤버메소드 m1() 실행됨");
	}
	public static void m2() {
		System.out.println("외부클래스의 클래스메소드 m2() 실행됨");
		
	}
	
	/* 인스턴스 내부 클래스
	 *	- 클래스내부에 정의된 클래스다.
	 *	- static 변수와 static 메소드는 포함할 수 없다.
	 *	- 외부 클래스가 객체 생성된 후에 인스턴스 내부 클래스는 사용가능하다.
	 *	- 내부클래스의 멤버메소드에서 외부클래스의 모든 필드, 모든 메소드를 사용할 수 있다.
	 *	- 내부클래스의 멤버메소드에서 외부클래스의 은닉화된 필드, 은닉화된 메소드도 사용할 수 있다.
	 *	
	 */
	class Inner1 {
		private int x;
//		private static int y;	
		
		// 내부클래스의 멤버메소드
		public void m3() {
			// 외부클래스의 모든 필드 사용가능 - 외부클래스의 멤버 변수, 외부클래스의 클래스변수
			System.out.println(a);
			System.out.println(b);
			// 외부클래스의 모든 메소드 사용가능 - 외부클래스의 멤버메소드, 외부클래스의 클래스메소드
			m1();
			Sample1.m2();
		}
//		public static void m4() {
//			
//		}
	}
}
