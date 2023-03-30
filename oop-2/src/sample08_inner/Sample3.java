package sample08_inner;
/* 지역 내부클래스에 대하여 */
public class Sample3 {

	private int x = 100;
	private static int y = 200;
	
	private void m1() {
		
	}
	private static void m2() {
		
	}
	
	private void m3() {
		int a = 10;
		int b = 20;
		
		/*
		 * 지역(local) 내부클래스
		 * 	- 메소드내부에 정의된 클래스다.
		 * 	- 해당 메소드 안에서만 사용할 수 있다. (line 43)
		 *  - 내부클래스에 클래스변수, 클래스메소드는 정의할 수 없다.
		 *  - 내부클래스의 메소드에서 외부클래스 모든 필드, 모든 메소드를 사용할 수 있다.
		 *  - 내부클래스가 정의된 메소드의 매개변수, 지역변수의 경우 메소드가 실행되는 동안 값이 변하지 않는 변수의 값만 사용할 수 있다.
		 */
		class Inner3 {
			private int c;
//			private static int d;
			
			public void m4() {
				System.out.println(a);
				System.out.println(Sample3.y);
				m1();
				Sample3.m2();
				
				// a는 m3()메소드가 실행되는 동안 값이 변하지 않기 때문에 사용가능하다.
				System.out.println(a);
				// b는 m3()메소드가 실행되는 동안 값이 변하기 때문에 사용할 수 없다.
//				System.out.println(b);	// 컴파일 오류
			}
//			public satatic void m5() {
//				
//			}
			
		}
		
		// 지역 내부클래스로 객체 생성하기
		Inner3 inner3 = new Inner3();
		// 지역 내부클래스에 정의된 메소드 사용하기
		inner3.m4();
		
		b = 30;
	}
}
