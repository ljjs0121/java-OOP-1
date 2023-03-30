package sample08_inner;

public class SampleApp {

	public static void main(String[] args) {
		// 인스턴스 내부 클래스 사용하기
		// 1. 외부클래스
		Sample1 sample1 = new Sample1();

		// 2. 내부클래스로 객체 생성하기
		Sample1.Inner1 inner1 = sample1.new Inner1(); // 이렇게 사용을 안한다고 한다.
		
		// 3. 내부클래스 기능 사용하기
		inner1.m3();
	}
}
