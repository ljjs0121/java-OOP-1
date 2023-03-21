package sample3;
/**
 * 사원정보 클래스다.
 * @author Lee
 *
 */
public class Employee {
	// 신입
	String id;				// 필수입력값
	String name;			// 필수입력값
	String email;			
	String tel;
	String department;		// 필수입력값
	int salary;				// 필수입력값
	double commissionPct; // 인센티브
	
	// 기본 생성자(Dfault Constructor) 메소드
	// 기본 생성자는 매개변수가 하나도 없는 생성자 메소드다.
	// 기본 생성자 메소드는 컴파일러가 자동으로 추가한다.(단, 생성자가 정의되어 있으면 자동으로 추가하지 않는다.)
	Employee() {
		System.out.println("기본 생성자 메소드가 실행됨");
	}
	
	Employee(String 아이디, String 이름, String 부서, int 급여) {
		
	}
	Employee(String 아이디, String 이름, String 부서, int 급여, double 커미션비율) {
		
	}
	Employee(String 아이디, String 이름, String 메일, String 전화번호, String 부서, int 급여, double 커미션비율) {
		
	}
}
