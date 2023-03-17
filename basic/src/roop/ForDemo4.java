package roop;

public class ForDemo4 {

	public static void main(String[] args) {
		/*
		 * break 와 continue
		 *  break는 switch와 반복문(for, while, do ~ while)에서 사용가능한 키워드다.
		 *  break가 반복문에서 사용되면 반복을 중단시키고, 반복문을 빠져나간다.
		 *  
		 *  예시
		 *  	for (int i = 1; i <= 10; i++) {
		 *  		if ( i == 6) {
		 *  			break;
		 *  		}
		 *  		System.out.println(i);
		 *  	}
		 *  	1, 2, 3, 4, 5 까지 반복문을 실행하고 종료된다.
		 *  
		 *  continue는 반복문에서 사용가능한 키워드다.
		 *  continue가 반복문에서 사용되면 반복문 블록에서 남아 있는 수행문 실행을 취소하고, 다음 번 반복을 수행한다.
		 *  
		 *  예시
		 *  	for (int i = 1; i <= 10; i++) {
		 *  		if ( i == 6) {
		 *  			continue;
		 *  		}
		 *  		System.out.println(i);
		 *  	}
		 *  	1, 2, 3, 4, 5, 7, 8, 9, 10 가 출력된다.
		 */
		
		// break로 반복문 탈출하기
		// 1 ~ 100까지 합계를 계산했을 때 합계가 2000을 초과하는 순간의 합계와 숫자를 출력하기
		int begin = 1;
		int end = 100;
		int total = 0;		// 합계
		int number = 0;		// 2000을 초과하는 순간의 숫자값
		
		for (int i = begin; i <= end; i++) {
			total += i;
			System.out.println("total += " + i);
			if (total > 2000) {
				number = i;
				break;
			}
		}
		System.out.println("합계 = " + total);
		System.out.println("숫자 = " + number);
	}
}
