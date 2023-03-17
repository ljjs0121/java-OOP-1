package control;

public class IfDemo3 {

	public static void main(String[] args) {
		/*
		 * if ~ else if ~ else if ~ else 문
		 * 		조건이 여러 개 일때는 if ~ else if ~ 구문을 사용한다.
		 * 형식
		 * 		if (조건식1) {
		 * 			수행문1;
		 * 		} else if (조건식2) {
		 * 			수행문2;
		 * 		} else if (조건식3) {
		 * 			수행문3;
		 * 		} else {
		 * 			수행문4;
		 * 		}
		 * 		* 조건식1이 true로 판정되면 수행문1을 실행하고, 제어문을 빠져나간다.
		 * 		* 조건식1이 false로 판정되면 조건식2를 검사한다.
		 * 		* 조건식2가 true로 판정되면 수행문2를 실행하고, 제어문을 빠져나간다.
		 * 		* ...
		 * 		* 수행문4는 조건식1, 조건식2, 조건식3이 모두 false로 판정되면 실행된다.
		 * 		* else 블록은 생략 가능하다.
		 */
		
		// 성적이 90점 이상이면 A, 80점 이상이면 B, 70점이상이면 C, 60점이상이면 D, 그 외는 F로 한다.
		int score = 82;
		
		if (score >= 90) {
			System.out.println(score + "점 = A학점");
		} else if (score >= 80) {
			System.out.println(score + "점 = B학점");
		} else if (score >= 70) {
			System.out.println(score + "점 = C학점");
		} else if (score >= 60) {
			System.out.println(score + "점 = D학점");		
		} else {
			System.out.println(score + "점 = F학점");
		}
		
		// 구매금액이 100만원 이상이면 구매금액의 5%를 포인트로 적립한다.
		// 구매금액이 70만원 이상이면 구매금액의 2%를 포인트로 적립한다. 
		// 구매금액이 50만원 이상이면 구매금액의 1%를 포인트로 적립한다.
		// 구매금액이 10만원 이상이면 구매금액의 0.1%를 포인트로 적립한다.
		
		int orderAmount = 800_000;
		
		if (orderAmount >= 1_000_000) {
			int point = (int) (orderAmount*0.05);
			System.out.println("구매금액 : "+ orderAmount + "원");
			System.out.println("적립포인트 : " + point + "점");
			
		} else if (orderAmount >= 700_000) {
			int point = (int) (orderAmount*0.02);
			System.out.println("구매금액 : "+ orderAmount + "원");
			System.out.println("적립포인트 : " + point + "점");
			
		} else if (orderAmount >= 500_000) {
			int point = (int) (orderAmount*0.01);
			System.out.println("구매금액 : "+ orderAmount + "원");
			System.out.println("적립포인트 : " + point + "점");
			
		} else if (orderAmount >= 100_000) {
			int point = (int) (orderAmount*0.001);
			System.out.println("구매금액 : "+ orderAmount + "원");
			System.out.println("적립포인트 : " + point + "점");
		} 
	
	}
}
