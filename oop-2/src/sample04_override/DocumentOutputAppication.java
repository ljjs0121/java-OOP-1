package sample04_override;
// 다형성
public class DocumentOutputAppication {

	// Printer, ColorPrinter, PhotoPrinter 객체를 참조하는 참조변수 
	private Printer printer; // DocumentOutputAppication객체는 Printer객체를 필요로한다.
	
	// Setter 메소드 : 필요한 객체를 제공할 때 사용된다.
	// Printer류 객체를 연결할 때 사용되는 기능이다.
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void printDocument() {
		printer.print();
	}
}
