package sample04_override;
// override 후 실행 방법
public class PrinterApp2 {

	public static void main(String[] args) {
		
		System.out.println("### ColorPrinter객체를 참조하는 참조변수 사용");
		ColorPrinter p1 = new ColorPrinter();
		p1.print();
		p1.printColor();
		System.out.println();
		
		System.out.println("### ColorPrinter객체와 연결된 Printer객체를 참조하는 참조변수 사용");
		Printer p2 = new ColorPrinter();
		p2.print();	// Printer의 print()여도 메소드재정의가 되어있기 때문에
					// 메소드재정의한 값이 출력된다. > "LaserPrinter의 print() 실행됨"
		System.out.println();
		
		System.out.println("### LaserPrinter객체와 연결된 Printer객체를 참조하는 참조변수 사용");
		Printer p3 = new LaserPrinter();
		p3.print(); // Printer의 print()여도 메소드재정의가 되어있기 때문에
					// 메소드재정의한 값이 출력된다. > "LaserPrinter의 print() 실행됨"
		System.out.println();
		
		System.out.println("### PhotoPrinter객체와 연결된 Printer객체를 참조하는 참조변수 사용");
		Printer p4 = new PhotoPrinter();
		p4.print();
	}
}
