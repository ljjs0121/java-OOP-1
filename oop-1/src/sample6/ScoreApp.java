package sample6;

public class ScoreApp {

	public static void main(String[] args) {
		// 성적정보관련 조회/변경/삭제 기능을 제공하는 객체 생성하기
		ScoreService service = new ScoreService();
		
		// 합격한 학생수 조회하기
		int passedCount = service.getPassedStudentCount();
		System.out.println("합격자 수 -> " + passedCount + "명");
		
		// 장학금 수령하는 학생수 조회하기
		int scholarship = service.getReceivedScholarshipStudentsCount();
		System.out.println("장학금 수령자 수 -> " + scholarship + "명");
		
		// 90점 이상 받은 학생수 조회하기
		int studentsCount90 = service.getStudentsByAverage(90);
		System.out.println("평균 90점 이상 학생 수 -> " + studentsCount90 + "명");
		
		// 12번 학생의 성적정보 조회하기
		Score s1 = service.getScoreByNo(12);
		if (s1 != null) {
			System.out.println("조회된 학생 정보 -> " + s1.name);
		} else {
			System.out.println("학번과 일치하는 성적정보가 존재하지 않습니다.");
		}
		
		// 13번 학생의 국어점수를 100으로 변경하기
		service.updateScore(12, "국어", 85);
		
		// 모든 학생의 성적정보를 화면에 출력하기
		service.printAllScores();
		
	}
}
