package sample02_extends;
// 상속의 속성
public class Person {

	private String id;
	private String name;
	private String tel;
	private String email;
	
	// 기본 생성자 메소드
	public Person () {
		// super(); // 컴파일러가 자동으로 추가하는 메소드다. 생략가능!
	}
	
	public Person (String id, String name) {
		// this() 메소드나 this(값, 값, ...), super(값, 값, ...) 있는 경우 super()는 자동으로 추가되지 않는다.
		this(id, name, null, null); // this 자신의 생성자 메소드를 호출할 때 사용
	}
	
	public Person(String id, String name, String tel, String email) {
		super();		// 컴파일러가 자동으로 추가하는 메소드다.
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
