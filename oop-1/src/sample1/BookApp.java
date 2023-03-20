package sample1;

public class BookApp {

	public static void main(String[] args) {
		// Book클래스로 Book객체 생성하기
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		// 생성된 Book 객체 확인하기
		// 출력값은 해시코드가 나온다. 주소값 X
		System.out.println(book1);	// sample1.Book@5aaa6d82
		System.out.println(book2);	// sample1.Book@73a28541
		System.out.println(book3);	// sample1.Book@6f75e721
		
		// book1 참조변수가 참조하는 객체의 멤버변수가 조회해서 출력하기
		System.out.println(book1.no);				// 0
		System.out.println(book1.title);			// null
		System.out.println(book1.writer);			// null
		System.out.println(book1.publisher);		// null
		System.out.println(book1.price);			// 0
		System.out.println(book1.discountPrice);	// 0
		System.out.println(book1.onsell);			// false
		System.out.println(book1.stock);			// 0
		
		// book2 참조변수가 참조하는 객체의 멤버변수가 변경하기
		book2.no = 10001;
		book2.title = "자바의 정석";
		book2.writer = "남궁성";
		book2.publisher = "도우출판사";
		book2.price	= 35_000;
		book2.discountPrice = 32_500;
		book2.onsell = true;
		book2.stock = 3;
		
		// book2 참조변수가 참조하는 객체의 멤버변수를 조회해서 출력하기
		System.out.println(book2.no);				// 10001
		System.out.println(book2.title);			// 자바의 정석
		System.out.println(book2.writer);			// 남궁성
		System.out.println(book2.publisher);		// 도우추판사
		System.out.println(book2.price);			// 35000
		System.out.println(book2.discountPrice);	// 32500
		System.out.println(book2.onsell);			// true
		System.out.println(book2.stock);			// 3
	}
}
