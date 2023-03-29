package sample04_override;
// ColorPrinter와 상속관계
public class PhotoPrinter extends ColorPrinter {

	/*
	 * ColorPrinter() void print() { ... } 메소드를 재정의한 메소드다. 
	 */
	public void print() {
		System.out.println("PhotoPrinter의 print() 실행됨 -> 사진품질 출력");
	}
	
	
}
