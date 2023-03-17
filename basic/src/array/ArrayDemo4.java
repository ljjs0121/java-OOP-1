package array;

public class ArrayDemo4 {

	public static void main(String[] args) {
		/*
		 *  학생의 성적을 관리하는 프로그램
		 *  	* 학생이름을 저장하는 배열
		 *  	* 국어점수를 저장하는 배열
		 *  	* 영어점수를 저장하는 배열
		 *  	* 수학점수를 저장하는 배열
		 *  
		 *  	* 총점을 저장하는 배열
		 *  	* 평균을 저장하는 배열
		 *  
		 *  	학생이름 -> {"김유신", "강감찬", "이순신"}
		 *  	국어점수 -> {100, 80, 80}
		 *  	영어점수 -> {100, 60, 70}
		 *  	수학점수 -> {100, 40, 70}
		 *  	총점 ->    {0, 0, 0} -> new int[3];
		 *  	평균 ->    {0, 0, 0} -> new int[3];
		 */
		
		// 배열 리터럴을 사용해서 학생이름,국어/영어/수학 점수를 저장하는 배열객체를 생성하기
		String[] names = {"김유신", "강감찬", "이순신","유관순", "안중근"};
		int[] korScores = {100, 90, 50, 60, 70};
		int[] engScores = {90, 70, 70, 80, 70};
		int[] mathScores = {70, 70, 50, 80, 80};
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
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부");
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			int kor = korScores[i];
			int eng = engScores[i];
			int math = mathScores[i];
			int total = totalScores[i];
			int average = averageScores[i];
			
			System.out.print(name + "\t");
			System.out.print(kor + "\t");
			System.out.print(eng + "\t");
			System.out.print(math + "\t");
			System.out.print(total + "\t");
			System.out.print(average + "\t");
			
			// 60점 미만 불합격 표시
			if (average >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
			
			// 배열 인덱스별 출력
//			System.out.println("이름 : " + name);
//			System.out.println("국어 : " + kor);
//			System.out.println("영어 : " + eng);
//			System.out.println("수학 : " + math);
//			System.out.println("총점 : " + total);
//			System.out.println("평균 : " + average);
//			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
