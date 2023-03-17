package array;

public class ArrayDemo411 {
	public static void main(String[] args) {
		// 배열 리터럴을 사용해서 학생이름,국어/영어/수학 점수를 저장하는 배열객체를 생성하기
		String[] names = {"이유리", "김필두", "한마음", "박하민", "이은우"};
		int[] korScores = {95, 70, 50, 100, 90};
		int[] engScores = {100, 50, 90, 100, 70};
		int[] mathScores = {90, 60, 70, 90, 80};
		
		// new 연산자를 이용해서 총점/평균 점수를 저장하는 배열객체를 생성하기
		int[] totalScores = new int[5];
		int[] averageScores = new int[5];
		
		// 국어/영어/수학점수를 조회해서 총점/평균을 계산한 다음 총점배열에 저장하기
		for (int i = 0; i < names.length; i++) {
			int kor = korScores[i];
			int eng = engScores[i];
			int math = mathScores[i];
			
			int total = kor + eng + math;
			int average = total/3;
			totalScores[i] = total;
			averageScores[i] = average;
			
		}
		// 성적처리 결과 출력하기
		// 일반적인 출력
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			int kor = korScores[i];
			int eng = engScores[i];
			int math = mathScores[i];
			int total = totalScores[i];
			int average = averageScores[i];
			
			System.out.println("이름 : " + name);
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("총점 : " + total);
			System.out.println("평균 : " + average);
			
			// 평균 60미만은 불합격처리
			if (average >= 60) {
				System.out.println("합격여부 : " + "합격");
			} else {
				System.out.println("합격여부 : " + "불합격");
			}
			
			// 평균 95점이상은 장학금 지급 대상 추가
			if (average >= 95) {
				System.out.println("장학금 여부 : " + "O");
			} else {
				System.out.println("장학금 여부 : " + "X");
			}
			System.out.println();
			
		}
		
		
	}
}
