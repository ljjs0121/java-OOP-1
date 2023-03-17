package control;

public class IfDemo51 {
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수 성적으로 합격 불합격여부를 판단한다.
		// 평균이 60점 이상이면 합격, 미만이면 불합격이다.
		// 국어, 영어, 수학 과목중에서 한 과목이라도 40점 이하면 불합격이다. ㅇ
		// 평균이 95점 이상이면 장학금 지급 대상이다.
		int kor = 70;
		int eng = 50;
		int math = 80;
		
		if (kor <= 40 || eng <= 40 || math <= 40) {
			System.out.println("불합격입니다.");
		} else {
			int total = kor + eng + math;
			int average = total/3;
			if (average >= 60) {
				System.out.println("합격입니다.");
				if (average >= 95) {
					System.out.println("장학금 지급 대상입니다.");
				}
			} else {
				System.out.println("불합격입니다.");
			}
		}
	}
}
