package sample09_inner;
// 멤버변수 중복정의를 할 때 여러가지 경우의 수를 줄이기 위해 정적내부클래스로 대체하기
// 빌드패턴을 사용하면 중복정의할 때 보다 가독성이 좋고 자유롭다.
public class Employee {

	private int no;
	private String name;
	private String dept;
	private String position;
	private int salary;
	private double commissionPct;
	private String hiredate;
	private boolean expired;
	
	/*
	 * 생성자 메소드의 접근제한을 private로 설정한다.
	 * Employee클래스 외부에서 Employee객체를 생성할 수 없다. 
	 */
	
	private Employee() {} // 내부클래스안에 있는 Employee Build 메소드의 호출 Employee를 쓰기위해서는 Build를 사용해야한다.
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public boolean isExpired() {
		return expired;
	}
	public void setExpired(boolean expired) {
		this.expired = expired;
	}
	
	public void displayInfo() {
		System.out.println("========== 직원정보 ==========");
		System.out.println("사원번호: " + no);
		System.out.println("사원이름: " + name);
		System.out.println("소속부서: " + dept);
		System.out.println("직위직급: " + position);
		System.out.println("직원급여: " + salary);
		System.out.println("커미션비율: " + commissionPct);
		System.out.println("입사일자: " + hiredate);
		System.out.println("퇴사여부: " + expired);
		System.out.println("============================");
	}
	
	/*
	 * Employee 객체를 제공하는 Builder객체를 정적 내부 클래스로 구현한다.
	 *  - Builder클래스는 멤버변수 초기화에 필요한 값을 전달받는 메소드를 포함한다.
	 *  - Builder클래스는 Employee객체를 제공하는 build() 메소드를 포함한다.
	 */
	public static class Builder {
		private int no;
		private String name;
		private String dept;
		private String position;
		private int salary;
		private double commissionPct;
		private String hiredate;
		private boolean expired;
		
		public Builder() {}
		public Builder no(int no) {
			this.no = no;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder dept(String dept) {
			this.dept = dept;
			return this;
		}
		public Builder position(String position) {
			this.position = position;
			return this;
		}
		public Builder salary(int salary) {
			this.salary = salary;
			return this;
		}
		public Builder commissionPct(double commissionPct) {
			this.commissionPct = commissionPct;
			return this;
		}
		public Builder hiredate(String hiredate) {
			this.hiredate = hiredate;
			return this;
		}
		public Builder expired(boolean expired) {
			this.expired = expired;
			return this;
		}
		public Employee build() {
			Employee emp = new Employee();
			emp.no = no;
			emp.name = name;
			emp.dept = dept;
			emp.position = position;
			emp.salary = salary;
			emp.commissionPct = commissionPct;
			emp.hiredate = hiredate;
			emp.expired = expired;
			
			return emp;
		}
		
	}
}
