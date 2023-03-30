package sample08_inner;
/* 정적 내부 클래스에 대해 */
public class Sample2 {

	private int a = 100;
	private static int b = 200;
	
	public void m1() {
		System.out.println("외부클래스의 멤버메소드 m1() 실행됨");
	}
	public static void m2() {
		System.out.println("외부클래스의 클래식메소드 m2() 실행됨");
	}
	
	/*
	 * 정적(static) 내부 클래스
	 * 	- static으로 선언된 내부클래스다.
	 * 	- 외부클래스를 객체생성하지 않고도 내부클래스를 사용할 수 있다.
	 * 	- 외부클래스의 구성요소 중에서 클래스변수와 클래스메소드만 사용할 수 있다.
	 * 	  (정적내부 클래스는 외부클래스를 객체 생성하지 않고도 사용할 수 있기 때문에, 객체 생성후에만 사용할 수 있는
	 * 	 	외부클래스의 멤버변수, 외부클래스의 멤버메소드에는 접근할 수 없다.)
	 */
	static class Inner2 {
		private int x;
		private static int y;
		
		public void m3() {
			// 외부클래스의 멤버변수에 접근할 수 없다.
//			System.out.println(a);	멤버변수는 사용못해서 오류
			System.out.println(Sample2.b);
			// 외부클래스의 멤버메소드에 접근할 수 없다.
//			m1();					멤버메소드를 사용못해서 오류
			Sample2.m2();
		}
		public static void m4() {
			
		}
	}
}
