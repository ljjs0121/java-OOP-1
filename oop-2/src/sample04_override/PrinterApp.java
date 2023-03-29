package sample04_override;
// override 메소드재정의 하기전 실행 방법
public class PrinterApp {

	public static void main(String[] args) {
		
		System.out.println("p1 참조변수");
		ColorPrinter p1 = new ColorPrinter();
		p1.print();
		p1.printColor();
		System.out.println();
		
		System.out.println("p2 참조변수");
		Printer p2 = new ColorPrinter();
		p2.print();			// override 하기 전에 실행하면 Printer의 print()가 실행된다.
		//p2.printColor();	// Printer 객체를 참조하는 p2참조변수로 ColorPrinter 객체가 제공하는 기능을 실행할 수 없다.
		((ColorPrinter) p2).printColor();	// 실제로 생성한 ColorPrinter객체를 참조하도록 객체형변환을 해야한다.
		
	}
}
