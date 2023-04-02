package sample09_inner;

public class EmployeeApp {

	public static void main(String[] args) {
		// Employee 객체 생성하기
//		Employee emp1 - new Employee();	// Employee() 생성자 메소드를 private로 설정해놨기 때문에 컴파일 오류
		
		// Employee 클래스에 정의된 정적 내부클래스를 Builder를 이용해서 Employee객체 획득하기
		// 객체 생성 방법 1
		Employee.Builder builder = new Employee.Builder();
		Employee emp2 = builder.no(100)
				.name("홍유빈")
				.dept("개발1팀")
				.position("차장")
				.salary(800)
				.build();
		
		// 객체생성 방법 2
		Employee emp3 = new Employee.Builder()
				.no(200)
				.name("하도영")
				.dept("영업1팀")
				.position("대리")
				.salary(400)
				.commissionPct(0.05)
				.hiredate("2020-10-31")
				.build();
		// 빌더패턴이라 부른다.
		
		// 직원정보를 출력해보기
		emp2.displayInfo();
		emp3.displayInfo();
		
	}
}
