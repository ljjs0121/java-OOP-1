package sample4;
// 클래스 변수에 대한 예제
public class Circle {
	
	// 멤버변수
	double r;
	/*
	 * static 
	 * 		static 키워드는 클래스 변수임을 나타낸다.
	 * 		클래스변수는 객체 생성에 참여하지 않는다.
	 * 		클래스변수는 설계도가 메모리에 로딩되면 즉시 변수(저장소)가 생성되고, 초기화된다.
	 * 		클래스변수는 객체 생성과 관계없이 "클래스이름.변수명"으로 사용가능하다.
	 * 		클래스변수는 모든 객체가 공통으로 사용하는 값을 저장하는 변수로 정의한다.
	 * 		클래스변수는 대부분 상수값(한번 정해진 값이 변하지 않는 값)을 담는 용도로 사용된다.
	 * 		클래스변수는 final 키워드와 같이 사용되는 경우가 많다.
	 * final
	 * 		final 키워드는 한번 결정된 변수의 값을 변경할 수 없음을 나타낸다.
	 * 		상수값을 담고 있는 경우 final 키워드를 붙여서 값을 변경하지 못하게 한다.
	 * 상수(Constant)
	 * 		프로그램이 실행되는 동안 값이 변하지 않는 것이다.
	 * 		static 키워드를 붙여서 클래스 변수로 만든다. (값이 변하지 않기 때문에 객체마다 갖고 있을 필요가 없다.)
	 * 		final 키워드를 붙여서 값을 변경하지 못하게 만든다. (값을 변경할 수 없게 해야한다.)
	 * 		상수명은 전부다 대문자로 적는다.
	 * 		예)
	 * 			static final double PI = 3.141592;
	 * 			static final int SPEED_OF_LIGHT = 299_792_458;
	 * 			static final long MAX_UPLOAD_FILE_SIZE = 1024*1024;
	 * 			static final String FILE_SAVE_DIRECTORY = "resources/images";
	 */
	// 클래스변수
	// final = 최종적인 값. 수정 불가능 
	// 상수일때 대문자로 적는다.
	static final double PI = 3.141592;
	
	/**
	 * 원의 반지름과 원주율을 전달받아서 Circle 객체를 초기화한다.
	 * @param r	반지름
	 * @param pi 원주율
	 */
	// 생성자
	Circle(double r) {
		this.r = r;
	}
	
	/**
	 * 원의 둘레를 반환한다.
	 * @return	원의 둘레
	 */
	// 멤버 메소드
	// 기능 1
	double round() {
		double len = 2*Circle.PI*r;
		return len;
	}
	
	/**
	 * 원의 넓이를 반환한다.
	 * @return	원의 넓이
	 */ 
	// 기능 2
	double area () {
		double area = Circle.PI*r*r;
		return area;
	}
}
