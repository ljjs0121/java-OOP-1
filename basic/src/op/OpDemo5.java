package op;

public class OpDemo5 {
	public static void main(String[] args) {
		// 논리연산자
		// && || !
		// &&는 논리곱(AND) 연산을 수행한다. 좌항과 우항의 값이 모두 true일 때만 연산 결과가 true다.
		// &&는 좌항의 값이 false로 판정되면 우항의 값을 확인하지 않고, 전체 연산 결과를 false로 판정한다.
		// ||는 논리합(OR) 연산을 수행한다. 좌항이나 우항의 값 중에 하나라도 true면 연산 결과가 true다.
		// ||는 좌항의 값이 true로 판정되면 우항의 값을 확인하지 않고, 전체 연산 결과를 true로 판정한다.
		// !는 논리부정(NOT) 연산을 수행한다. 
		
		// 논리연산자의 사용목적은 2개 이상의 비교 연산식을 활용해서 더 복잡한 논리식을 구성하기 위해서 사용한다.
		
		// 자동차 서비스센터의 유상수리 기준 : 사용기간 3년 이상이거나 운행거리가  50000km이상일 때 유상수리대상이다.
		int distance = 34000;
		int usedYear = 2;
		
		boolean result1 = distance >= 50000 || usedYear >= 3;
		System.out.println("result1 = " + result1);
		
		// 사은품 지급 기준 : 방문 고객의 보유 포인트가 10만점 이상이고, 현장 구매금액이 30만원 초과시 사은품 지급 대상이다.
		int savedPoint = 50_000;
		int orderAmount = 1_000_000;
		
		boolean result2 = savedPoint >= 100_000 && orderAmount > 300_000;
		System.out.println("result2 = " + result2);
		
		// 사은품 지급 기준 : 방문 고객의 보유 포인트가 10만점 이상이고, 현장 구매금액이 30만원 초과시 사은품 지급 대상이다.
		//				   방문 고객의 현장 구매금액이 100만원 이상이면, 보유 포인트에 상관없이 사은품 지급 대상이다.

		boolean result3 = orderAmount >= 1000000 || (savedPoint >= 100000 && orderAmount > 300000);
		System.out.println("result3 = " + result3);
		
		// ! 부정
//		System.out.println(!true);		// false
//		System.out.println(!false);		// true
//		System.out.println(!!true);		// true
//		System.out.println(!!false);	// false
		
		// 자동차 서비스센터의 무상수리 기준 : 사용기간 3년 미만이고, 운행거리가  50000km미만일 때 무상수리대상이다.

		distance = 20000;
		usedYear = 2;
		
		boolean result4 = !(distance >= 50000 || usedYear >= 3);
		boolean result5 = distance < 50000 && usedYear < 3;
		System.out.println("result4 = " + result4);
		System.out.println("result5 = " + result5);
		
		
	}
}
