package sample3_constuctor;
/**
 * 사원정보 클래스다.
 * @author Lee
 *
 */
public class Employee {
	
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
	/**
	 * 기본 생성자 메소드다.
	 */
	Employee() {
		System.out.println("기본 생성자 메소드가 실행됨");
	}
	
	/**
	 * 신입직원 정보용 생성자 메소드다. 신입직원은 아이디, 이름, 부서, 급여 정보만 전달받아서 생성된 객체의 멤버변수에 저장한다.
	 * @param 아이디
	 * @param 이름
	 * @param 부서
	 * @param 급여
	 */
	Employee(String id, String name, String department, int salary) {
		this(id, name, department, salary, 0.0);
		// this. 는 멤버변수 id 를 가르킨다.
//		this.id = id;
//		this.name = name;
//		this.department = department;
//		this.salary = salary;
	}
	
	/**
	 * 경력직원 정보용 생성자 메소드다. 경력직원은 아이디, 이름, 부서, 급여, 커미션비율 정보만 전달받아서 생성된 객체의 멤버변수에 저장한다.
	 * @param 아이디
	 * @param 이름
	 * @param 부서
	 * @param 급여
	 * @param 커미션비율
	 */
	Employee(String id, String name, String department, int salary, double commissionPct) {
		this(id, name, null, null, department, salary, commissionPct);
//		this.id = id;
//		this.name = name;
//		this.department = department;
//		this.salary = salary;
//		this.commissionPct = commissionPct;
	}
	
	/**
	 * 재직중인 직원 정보용 생성자 메소드다. 재직중인 직원은 아이디, 이름, 이메일, 전화번호, 부서, 급여, 커미션비율 정보만 전달받아서 생성된 객체의 멤버변수에 저장한다.
	 * @param 아이디
	 * @param 이름
	 * @param 메일
	 * @param 전화번호
	 * @param 부서
	 * @param 급여
	 * @param 커미션비율
	 */
	Employee(String id, String name, String email, String tel, String department, int salary, double commissionPct) {
		System.out.println("아이디, 이름, 이메일, 전화번호, 부서, 급여, 커미션비율 정보를 전달받아서 초기화 작업을 수행하는 생성자 메소드가 실행됨");
		this.id = id;
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.department = department;
		this.salary = salary;
		this.commissionPct = commissionPct;
		
	}
	
	// 멤버메소드(인서턴스 메소드) 정의하기
	/**
	 * 직원 상세 정보를 출력하는 멤버메소드다.
	 */
	void displayEmployeeInfo() {
		System.out.println("--- 직원 상세 정보 ---");
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
		System.out.println("전화번호: " + tel);
		System.out.println("소속부서: " + department);
		System.out.println("급여: " + salary);
		System.out.println("커미션비율: " + commissionPct);
		System.out.println();
	}
}