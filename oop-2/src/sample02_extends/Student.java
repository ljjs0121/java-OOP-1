package sample02_extends;

public class Student extends Person {

	private int studentNo;
	private String major;
	private int grade;
	
	public Student() {
		 super(); // 컴파일러가 자동으로 추가하는 메소드다. Person의 기본 생성자 메소드를 호출한다. 
		 		  // Person 생성자를 주석처리한다면 이 Student 생성자는 오류가 생긴다.
	}
	
	public Student(String id, int studentNo, String major, int grade, String name) {
		// 부모 생성자 호출할 때 사용
		super(id, name);	// super() 대신 super(String, String) 메소드를 추가했기 때문에 super()는 자동을 추가되지 않는다.
							// super(String, String)은 Person의 Person(String, String) 메소드를 호출한다.
		this.studentNo = studentNo;
		this.major = major;
		this.grade = grade;
	}
	
	public Student(String id, int studentNo, String major, int grade, String name, String tel, String email) {
		// 부모객체인 Person 클래스의 생성자를 사용해야 할때는 super() 메소드를 사용하면 된다.
		super(id, name, tel, email);	// super() 대신 super(String, String, String, String) 메소드를 추가했기 때문에 super()는 자동을 추가되지 않는다.
										// super(String, String, String)은 Person의 Person(String, String,String, String) 메소드를 호출한다.
		this.studentNo = studentNo;
		this.major = major;
		this.grade = grade;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
