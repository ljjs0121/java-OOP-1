package sample6;

public class ScoreService {

	// 성적정보를 10개 저장하는 배열객체를 생성하고, 멤버변수 score에 배열객체의 주소값을 대입한다.
	 Score[] scores = new Score[10];
	
	public ScoreService() {
		scores[0] = new Score(10, "김은별", 80, 80, 80);
		scores[1] = new Score(11, "박하민", 80, 80, 50);
		scores[2] = new Score(12, "김창수", 70, 70, 60);
		scores[3] = new Score(13, "이사라", 50, 90, 80);
		scores[4] = new Score(14, "하대영", 80, 100, 90);
		scores[5] = new Score(15, "박연진", 60, 60, 70);
		scores[6] = new Score(16, "하예솔", 40, 50, 30);
		scores[7] = new Score(17, "최혜정", 85, 85, 60);
		scores[8] = new Score(18, "문동은", 95, 100, 80);
		scores[9] = new Score(19, "유재석", 100, 100, 100);
	}
	// 시험에 합격한 학생수를 반환하는 메소드
	// 반환타입 : int
	// 메소드명 : getPassedStudentCount
	// 매개변수 : 없다. 전달해줘야하는 값
	public int getPassedStudentCount() {
		int count = 0;
		
		// 합격한 학생을 조회해서 count값을 증가시키는 코드
		for (Score score : scores) {
			if(score.passed) {
				count ++;
			}
		}
		return count;
	}
	
	// 장학금을 수령하는 학생수를 반환하는 메소드
	// 반환타입 : int
	// 메소드명 : getReceivedScholarshipStudentsCount
	// 매개변수 : 없다.
	public int getReceivedScholarshipStudentsCount() {
		int count = 0;

		for (Score score : scores) {
			if(score.scholarship) {
				count ++;
			}
		}
		return count;
	}
	
	// 평균점수를 전달받아서 해당 평균점수 이상을 획득한 학생수를 반환하는(조회하는) 메소드
	// 반환타입 : int
	// 메소드명 : getStudentsByAverage
	// 매개변수 : int average
	public int getStudentsByAverage(int average) {
		int count = 0;
		for (Score score : scores) {
			if (score.average >= average) {
				count++;
			}
		}
		return count;
	}
	
	// 학번을 전달받아서 성적정보를 반환하는 메소드 * 정보가 나오면 객체여야 한다.
	// 반환타입 : Score
	// 메소드명 : getScoreByNo
	// 매개변수 : int StudentNo
	public Score getScoreByNo(int StudentNo) {
		Score foundScore = null;
		
		for (Score score : scores) {
			if (score.no == StudentNo) {
				foundScore = score;
				break;	// 학번이 일치하는 성적정보를 발견했기 때문에 반복문을 탈출한다.
			}
		}
		return foundScore;
	}
	
	// 학번, 과목명, 점수를 전달받아서 성적정보를 수정하는 메소드 (추가 삭제 수정 -> 반환타입이 없다 void)
	// 반환타입 : void
	// 메소드명 : updateScore
	// 매개변수 : int studentNo, String subject, int value
	public void updateScore(int studentNo, String subject, int value) {
		Score score = getScoreByNo(studentNo);
		// 안좋은 것부터 끝내기
		if (score == null) {
			System.out.println("학번과 일치하는 성적정보가 없습니다.");
			return;
			
		}
		int prevValue = 0;
		if ("국어".equals(subject)) {
			prevValue = score.kor;
			score.kor = value;
		} else if ("영어".equals(subject)) {
			prevValue = score.eng;
			score.eng = value;
		} else if ("수학".equals(subject)) {
			prevValue = score.math;
			score.math = value;
		}
		
		// 성적 정보가 바뀌면 총점, 평균, 합격여부, 장학금수령여부가 달라질 수도 있기 때문에
		// 총점, 평균, 합격여부, 장학금수령여부 업데이트 하기
		score.total = score.kor + score.eng + score.math;
		score.average = score.total/3;
		score.passed = score.average >= 60;
		score.scholarship = score.average >= 95;
		
		System.out.println(subject + "점수가 [" + prevValue + "] 에서 [" + value + "]로 변경되었습니다.");
	}
	
	// 모든 성적정보를 화면에 출력하는 메소드
	// 반환타입 : void
	// 메소드명 : printAllScores
	// 매개변수 : 없음
	public void printAllScores() {
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t합격\t장학금여부");
		for (Score score : scores) {
			System.out.print(score.no + "\t");
			System.out.print(score.name + "\t");
			System.out.print(score.kor + "\t");
			System.out.print(score.eng + "\t");
			System.out.print(score.math + "\t");
			System.out.print(score.total + "\t");
			System.out.print(score.average + "\t");
			System.out.print(score.passed + "\t");
			System.out.println(score.scholarship);
		}
	}
	
}


















