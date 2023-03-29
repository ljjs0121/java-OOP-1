package simple04_override;

public class ColorPrinter extends Printer {

	public void printColor() {
		System.out.println("ColorPrinter의 printColor() 실행됨");
	}
	
	/*
	 * Printer의 void print() { ... } 메소드를 재정의한 메소드다.
	 */
	// 메소드재정의 (Overriding)
	public void print() {
		System.out.println("ColorPrinter의 print() 실행됨 -> 컬러출력");
	}
	
}
