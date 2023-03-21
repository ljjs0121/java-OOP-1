package sample1;

import java.security.SecurityPermission;

import util.KeyboardReader;

public class ScoreApp {
	
	public static void main(String[] args) {
		
		// 1. 키보드 입력을 읽어오는 기능이 제공되는 객체를 생성하자.
		KeyboardReader reader = new KeyboardReader();
		
		// 2. 시험성적정보를 저장하는 객체를 생성하자.
		Score score = new Score();
		
		// 3. 학번,이름,국어,영어,수학점수를 입력받아서 성적을 계산하고 출력한다.
		System.out.print("학번 입력: ");
		score.studentNo = reader.readInt();
		
		System.out.print("이름 입력: ");
		score.studentName = reader.readString();
		
		System.out.print("국어점수 입력: ");
		score.kor = reader.readInt();
		
		System.out.print("영어점수 입력: ");
		score.eng = reader.readInt();
		
		System.out.println("수학점수 입력: ");
		score.math = reader.readInt();
		
		score.total = score.kor + score.eng + score.math;
		score.average = (double) score.total/3;
		
		if (score.average >= 60) {
			System.out.println("합격");
			// 과목 중 하나라도 40점 미만이여도 불합격 처리 추가
			if (score.kor < 40 || score.eng < 40 || score.math < 40) {
				System.out.println("불합격");
			}
		} else {
			System.out.println("불합격");
		}
		// if문 코드를 리팩토링한 코드
//		score.passed = score.average >= 60;
		
		System.out.println("-- 시험 정보 --");
		System.out.println("학번 : " + score.studentNo);
		System.out.println("이름 : "+ score.studentName);
		System.out.println("국어 : " + score.kor);
		System.out.println("영어 : " + score.eng);
		System.out.println("수학 : " + score.math);
		System.out.println("총점 : "+ score.total);
		System.out.println("평균 : " + score.average);
		System.out.println("합격여부 : " + score.passed);
	}
}
