package sample3_constuctor;

public class EmployeeApp {

	public static void main(String[] args) {
		
		// 신입사원정보, 경력사원정보, 재직중인 사원정보를 표현하는 객체를 생성하기
		
		Employee emp0 = new Employee();
		emp0.displayEmployeeInfo();
		
		// 신입사원정보는 아이디, 이름, 소속부서, 급여정보를 가지고 있다.
		// Employee 파일에서 기본 생성자 매개변수를 초기화 작업을 해서 아래처럼 간편하게 사용할 수 있다.
		// Employee 클래스로 객체를 생성하고, 
		// 생성자 메소드 중에서 Employee(String, String, String, int) 매개변수를 가지고 있는 생성자 메소드를 실행한다.
		
		Employee emp1 = new Employee("hong","홍수아","인사과",3_000_000);
		emp1.displayEmployeeInfo();
		// 기본생성자 매개변수 작성 전 코드 
//		emp1.id = "hong";
//		emp1.name = "홍수아";
//		emp1.department = "인사과";
//		emp1.salary = 3_000_000;
		
		// 경력사원정보는 아이디, 이름, 소속부서, 급여정보, 커미션지급 비율정보를 가지고 있다.
		Employee emp2 = new Employee("lee","이대길","개발2팀",8_000_000,0.1);
		emp2.displayEmployeeInfo();
		
		// 재직사원정보는 아이디, 이름, 이메일, 전화번호, 소속부서, 급여정보, 커미션지급 비율정보를 가지고 있다.
		Employee emp3 = new Employee("kim","김신","kim@naver.com","개발1팀","02-1234-5678",6_500_000,0.07);
		emp3.displayEmployeeInfo();

	}
}
