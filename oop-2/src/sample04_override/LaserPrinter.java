package sample04_override;
// Printer와 상속관계
public class LaserPrinter extends Printer{

	/*
	 * Printer의 void print() { ... } 메소드를 재정의한 메소드다.
	 */
	public void print() {
		System.out.println("LaserPrinter의 print() 실행됨 -> 레이저 출력");
	}
}
