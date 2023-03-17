package array;

public class ArrayDemo41 {

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
		// 가로로 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학금여부");
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			int kor = korScores[i];
			int eng = engScores[i];
			int math = mathScores[i];
			int total = totalScores[i];
			int average = averageScores[i];
			
			System.out.print(name +"\t");
			System.out.print(kor + "\t");
			System.out.print(eng +"\t");
			System.out.print(math +"\t");
			System.out.print(total +"\t");
			System.out.print(average +"\t");
			
			// 합격여부 기준 평균 60점 이상
			if (average >= 60) {
				System.out.print("합격" + "\t");
			} else {
				System.out.print("불합격" + "\t");
			}
			// 장학금 기준 평균 95점 이상 기능 추가
			if (average >= 95) {
				System.out.println("O");
			} else {
				System.out.println("X");
			}
			
		}
		
	}

}
