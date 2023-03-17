package roop;

public class ForDemo2 {
	public static void main(String[] args) {
		
		// 수행문이 한번 실행될 때마다 현재 i값을 사용할 수 있다.
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 1 ~ 100 까지의 합계를 계산하기
		// 명사 : 합계 -> 변수, int total = 0; 
		// 시작값과 끝값을 담는 변수 생성하자 -> int begin = 1; int end = 100;
		// 수행작업 -> 합계를 계산하기(1 ~ 100 까지 total에 더하기)
		
		int total = 0;
		int begin = 1;
		int end = 100;
		
		for (int i = begin; i <= end; i++) {
			total += i;
		}
		System.out.println("합계 = " + total);
	
	}
}
