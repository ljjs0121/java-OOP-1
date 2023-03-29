package sample04_override;
// 다형성
public class DocumentOutputAppicationApp {

	public static void main(String[] args) {
		// DocumentOutputApplication객체가 사용할 Printer류 객체를 생성한다.
		Printer p1 = new Printer();
		ColorPrinter p2 = new ColorPrinter();
		PhotoPrinter p3 = new PhotoPrinter();
		
		// DocumentOutputApplication객체를 생성한다.
		DocumentOutputAppication appication = new DocumentOutputAppication();
		// DocumentOutputApplication객체의 setPrinter(Printer printer)메소드를 실행해서
		// Printer류 객체 중 하나를 전달한다.
		appication.setPrinter(p3);
		// DocumentOutputApplication객체의 문서출력기능을 실행한다.
		appication.printDocument();
	}
}
