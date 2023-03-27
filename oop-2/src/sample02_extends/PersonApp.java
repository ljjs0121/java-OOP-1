package sample02_extends;

public class PersonApp {

	public static void main(String[] args) {
		
		// Student객체의 기본 생성자 메소드를 호출해서 객체 생성하고 초기화한 다음, Setter 메소드 호출해서 멤버변수의 값 초기화하기
		Student student1 = new Student();
		student1.setId("hong");						// Person
		student1.setStudentNo(20230213);			// Student
		student1.setMajor("컴퓨터공학과");				// Student
		student1.setGrade(1);						// Student
		student1.setName("홍길동");					// Person
		student1.setTel("010-1111-1111");			// Person
		student1.setEmail("hong@hanamil.net");		// Person
		
		// Student객체의 Student(String, int, String, int String) 생성자 메소드를 호출해서 객체 생성하고 초기화하기
		Student student2 = new Student("lee", 202101001, "컴퓨터공학과", 3, "이교진");
		
		// Student객체의 Student(String, int, String, int String, String, String) 생성자 메소드를 호출해서 객체 생성하고 초기화하기
		Student student3 = new Student("kim", 202201002, "컴퓨터공학과", 2, "김새론", "010-2222-2222", "kim@naver.com");
		
		// Professor객체의 기본 생성자 메소드를 호출해서 객체 생성하고 초기화한 다음, setter 메소드호출해서 멤버변수의 값 초기화하기
		Professor professor1 = new Professor();
		professor1.setId("kang");						// Person의 setId(String id) 호출
		professor1.setMajor("컴퓨터공학");					// Professor의 setMajor(String major) 호출
		professor1.setName("강기리");						// Person의 setName(String name) 호출
		professor1.setPosition("부교수");					// Professor의 setPosition(String position) 호출
		professor1.setSalary(9000000);					// Professor의 setSalary(int salary) 호출
		professor1.setResearch("빅데이터");				// Professor의 setResearch(String research) 호출
		professor1.setTel("010-4444-3333");				// Person의 setTel(String tel) 호출
		professor1.setEmail("kang@gmail.com");			// Person의 setEmail(String email) 호출
		
		// Professor객체의 Professor(String, String, String, String, int, String, String, String) 생성자 메소드를 호출해서 객체생성하고 초기화하기
		Professor professor2 = new Professor("kim", "컴퓨터공학", "김신", "조교수", 8000000, "자료구조 연구", "010-2222-3333", "kim@naver.com");
		
	}
}
