package sample4;

public class SampleApp2 {

	int x;
	static int y;
	
	public static void main(String[] args) {
		// 오류, 클래스메소드에서 멤버변수를 사용할 수 없다.
		// System.out.println(x); 클래스메소드에서는 멤버변수에 접근할 수 없기 때문에 오류가 나타난다.
		
		// 멤버변수를 사용하기 위해서는 객체를 생성하고, 생성된 객체를 참조하는 참조변수를 이용해야 한다.
		SampleApp2 app = new SampleApp2();
		System.out.println(app.x);
		
		// 클래스메소드에서 클래스변수를 사용할 수 있다
		// 같은 클래스안에 있는 클래스변수는 클래스이름 없이 변수명으로 사용할 수 있지만,
		System.out.println(y);
		// 대부분 표기는 아래처럼 표기해주는것이 좋다.
		System.out.println(SampleApp2.y);
	}
}
