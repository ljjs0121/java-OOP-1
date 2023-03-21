package sample3;

public class EmployeeApp {

	public static void main(String[] args) {
		
		// 신입사원정보, 경력사원정보, 재직중인 사원정보를 표현하는 객체를 생성하기
		
		// 신입사원정보는 아이디, 이름, 소속부서, 급여정보를 가지고 있다.
		Employee emp1 = new Employee("hong","홍길동","인사과",3_000_000);
//		emp1.id = "hong";
//		emp1.name = "홍길동";
//		emp1.department = "인사과";
//		emp1.salary = 3_000_000;
		
		// 경력사원정보는 아이디, 이름, 소속부서, 급여정보, 커미션지급 비율정보를 가지고 있다.
		Employee emp2 = new Employee("lee","이순신","개발2팀",8_000_000,0.1);
//		emp1.id = "lee";
//		emp2.name = "이순신";
//		emp2.department = "개발2팀";
//		emp2.salary = 8_000_000;
//		emp2.commissionPct = 0.1;
		
		// 재직사원정보는 아이디, 이름, 이메일, 전화번호, 소속부서, 급여정보, 커미션지급 비율정보를 가지고 있다.
		Employee emp3 = new Employee("kim","김유신","kim@naver.com","개발1팀","010-1234-5678",6_500_000,0.07);
//		emp3.id = "kim";
//		emp3.name = "김유신";
//		emp3.email = "kim@naver.com";
//		emp3.department = "개발1팀";
//		emp3.tel = "010-1234-5678";
//		emp3.salary = 6_500_000;
//		emp3.commissionPct = 0.07;
	}
}
