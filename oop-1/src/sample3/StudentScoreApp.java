package sample3;

public class StudentScoreApp {

	public static void main(String[] args) {
		// 기본생성자를 통해 객체를 초기화하는 방법
		StudentScore score1 = new StudentScore(1, "김신", 80, 90, 60);
		StudentScore score2 = new StudentScore(2, "김덕배", 80, 100, 70);
		StudentScore score3 = new StudentScore(3, "이사자", 70, 80, 90);
		StudentScore score4 = new StudentScore(4, "박화차", 100, 90, 100);
		StudentScore score5 = new StudentScore(5, "장만월", 100, 100, 100);
		
		score1.displayStudentScore();
		score2.displayStudentScore();
		score3.displayStudentScore();
		score4.displayStudentScore();
		score5.displayStudentScore();
	}
}
