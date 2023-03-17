package control;

public class IfDemo33 {
	public static void main(String[] args) {
		// 성적이 90점 이상이면 A, 80점 이상이면 B, 70점이상이면 C, 60점이상이면 D, 그 외는 F로 한다.
		int score = 60;
		
		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	
	// 구매금액이 100만원 이상이면 구매금액의 5%를 포인트로 적립한다.
	// 구매금액이 70만원 이상이면 구매금액의 2%를 포인트로 적립한다. 
	// 구매금액이 50만원 이상이면 구매금액의 1%를 포인트로 적립한다.
	// 구매금액이 10만원 이상이면 구매금액의 0.1%를 포인트로 적립한다.
	
		int orderAmount = 800_000;
		
		if (orderAmount >= 1_000_000) {
			int point =(int) (orderAmount*0.05);
			System.out.println("구매금액 : " + orderAmount + "원" );
			System.out.println("적립포인트 : " + point + "점");
			
		} else if (orderAmount >= 700_000) {
			int point =(int) (orderAmount*0.02);
			System.out.println("구매금액 : " + orderAmount + "원");
			System.out.println("적립포인트 : " + point + "점");
			
		} else if (orderAmount >= 500_000) {
			int point =(int) (orderAmount*0.01);
			System.out.println("구매금액 : " + orderAmount + "원");
			System.out.println("적립포인트 : " + point + "점");
			
		} else if (orderAmount >= 100_00) {
			int point =(int) (orderAmount*0.001);
			System.out.println("구매금액 : " + orderAmount + "원");
			System.out.println("적립포인트 : " + point + "점");
		}
	}
}