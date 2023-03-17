package var1;

public class VarDemo3 {

	public static void main(String[] args) {
		// 학번, 이름, 전공학과명, 학년, 담당교수명, 졸업여부를 자정하는 변수 생성하고, 적절한 값을 저장하기
		// 변수에 저장된 값을 출력하기
		int studentNo = 20230313;		// 학번 같은 경우는 연산작업을 안하기 때문에 int 타입보다 String 타입으로 사용해도 된다.
		String studentName = "이진서";
		String deptName = "컴퓨터공학과";
		int grade = 1;
		String professorName = "이응수";
		boolean graduated = false;
		
		System.out.println(studentNo);
		System.out.println(studentName);
		System.out.println(deptName);
		System.out.println(grade);
		System.out.println(professorName);
		System.out.println(graduated);
		
	}

}
