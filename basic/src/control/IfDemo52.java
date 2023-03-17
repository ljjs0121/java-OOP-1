package control;

public class IfDemo52 {
	public static void main(String[] args) {
		/*
		 * 빠른 종료
		 *  	제어문의 조건식이 다양하고 복잡할 수록 제어문의 구조도 같이 복잡해진다.
		 *  	제어문의 구조가 복잡해지면, 코드의 가독성이 떨어지고 유지보수도 어려워진다.
		 *  
		 *  	빠른 종료는 제시된 조건에 부합되지 않는 나쁜 경우를 먼저 찾아서 프로그램의 실행을 중단시키는 것이다.
		 *  		빠른 종료는 return 키워드나 throw 키워드를 이용해서 나쁜 경우를 만나면 프로그램의 실행을 즉시 중단 시킨다.
		 *  		빠른 종료를 활용하면 if문의 구조를 단순화시킬 수 있고, 다양한 조건을 내포된 if문 없이도 작성할 수 있다.
		 *  		빠른 종료를 활용한 코드는 제어문의 구조가 단순하고, 코드 가독성이 높아지고, 유지보수도 쉽다.
		 *  	return
		 *  		프로그램은 return문을 만나면 수행문의 실행을 즉시 종료시킨다.
		 */
		
		// 국어, 영어, 수학 점수 성적으로 합격 불합격여부를 판단한다.
		// 평균이 60점 이상이면 합격, 미만이면 불합격이다.
		// 국어, 영어, 수학 과목중에서 한 과목이라도 40점 미만이면 불합격이다.
		// 평균이 95점 이상이면 장학금 지급 대상이다.
		
		int kor = 70;
		int eng = 100;
		int math = 80;
		
		if (kor < 40 || eng < 40 || math < 40) {
			System.out.println("불합격입니다.");
			return;
		}
		
		int total = kor + eng + math;
		int average = total/3;
		if (average < 60) {
			System.out.println("불합격입니다.");
			return;
		}
		
		System.out.println("합격입니다.");
		if (average >= 95) {
			System.out.println("장학금 지급 대상입니다.");
		}
		

	}
}
