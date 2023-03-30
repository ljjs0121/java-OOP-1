package sample08_inner;

public class Sample2App {

	public static void main(String[] args) {
		
		// 정적 내부클래스 사용하기
		
		// 1. 외부클래스로 객체생성하기
		Sample2.Inner2 inner2 = new Sample2.Inner2();

		// 2. 내부클래스의 메소드 사용하기
		inner2.m3();
	}
}
