package sample3_constuctor;

public class StudentScore {
	
	// 멤버변수, 인스턴스 변수, 프로퍼티
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double average;
	boolean passed;
	
	//////////////////////////////////////////
	// 생성자
	//////////////////////////////////////////
	// 매개변수가 있는 생성자 메소드
	// 번호, 이름, 국어, 영어, 수학, 점수를 전달받아서 해당 멤버변수를 초기화하고, 계산된 결과로 총점, 평균, 합격여부도 초기화한다.
	StudentScore(int 번호, String 이름, int 국어, int 영어, int 수학) {
		no = 번호;
		name = 이름;
		kor = 국어;
		eng = 영어;
		math = 수학;
		// 총점, 평균, 합격여부를 계산해서 멤버변수에 대입한다.
		total = 국어 + 영어 + 수학;
		average = (double) total/3;
		passed = average >= 60;
	}
	
	//////////////////////////////////////////
	// 멤버 메소드
	//////////////////////////////////////////
	void displayStudentScore() {
		System.out.println("----------------------------");
		System.out.println("번호: " + no);
		System.out.println("이름: " + name);
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		System.out.println("합격여부: " + passed);
		System.out.println("-----------------------------");
		System.out.println();
	}
}
