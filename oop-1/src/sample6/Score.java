package sample6;

/**
 * 성적정보(학번, 이름, 국어, 영어, 수학, 총점, 평균, 합격여부, 장학금수령여부)를 표현하는 클래스다.
 * @author Lee
 *
 */
public class Score {
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int average;
	boolean passed;
	boolean scholarship;
	
	public Score(int no, String name, int kor, int eng, int math) {
		// 학번, 이름, 국어, 영어, 수학점수를 멤버변수에 각각 대입한다.
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		// 총점과 평균을 계산해서 멤버변수에대입한다.
		this.total = kor + eng + math;
		this.average = total/3;
		// 평균 60점 이상이면 합격여부를 true로 설정
		this.passed = this.average >= 60;
		// 평균 95점 이상이면 장학금여부를 true로 설정
		this.scholarship = this.average >= 95;
	}
}
