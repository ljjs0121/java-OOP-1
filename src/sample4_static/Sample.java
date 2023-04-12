package sample4_static;
// 클래스변수에 대한 예제
public class Sample {
	
	int x;
	static int y;
	
	void update() {
		x++;
		Sample.y++;
	}
	
	void print() {
		System.out.println("멤버변수 x의 값 -> " + x);
		System.out.println("클래스변수 y의 값 -> " + Sample.y);
	}
}
