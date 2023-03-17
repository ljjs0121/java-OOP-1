package roop;

public class ForDemo3 {
	
	public static void main(String[] args) {
		/*
		 * for문은 내포된 if문을 포함할 수 있다.
		 */
		
		// 1 ~ 100까지의 정수 중에서 홀수의 합계를 계산하기
		// 값 : 1 ~ 100 -> 변수 -> int begin = 1; int end = 100;
		// 조건 : 홀수 일때만 더하기 수행
		// 명사 : 합계 -> 변수 -> int oddTotal = 0;
	
		int begin = 1;
		int end = 100;
		int oddTotal = 0;
		int evenTotal = 0;
		
		for (int i = begin; i <= end; i++) {
			if (i%2 == 1) {
				oddTotal += i;
				System.out.println("oddTotal += " + i);
			} else {
				evenTotal += i;
			}
		}
		System.out.println("홀수 합계 = " + oddTotal);
		System.out.println("짝수 합계 = " + evenTotal);
	
		
	}
}
