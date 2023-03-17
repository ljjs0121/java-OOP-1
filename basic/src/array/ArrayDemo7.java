package array;

import java.util.Random;

public class ArrayDemo7 {

	public static void main(String[] args) {
		
		// 1 ~ 100 사이의 임의의 숫자를 입력받아서 배열에 저장한다.
		// 배열의 크기는 10이다.
		// 배열에 저장된 값 중에서 가장 큰 값과 가장 작은 값을 출력하시오.
		
		/* Random
		 *  임의의 난수를 제공하는 객체다. 
		 *  	nextInt(int bound) : bound에 지정한 숫자를 기준으로 0 ~ bound 범위에 속하는 임의의 정수를 제공한다.
		 *  						 0을 포함되고, bound는 포함되지 않는다.
		*/
		
		// 1. 배열을 생성한다.
		int[] numbers = new int[10];
		
		// 2. 임의의 난수를 발생시키는 Random객체를 생성한다.
		Random random = new Random();
		
		// 3. 배열의 크기만큼 반복을 수행해서 배열에 임의의 난수를 저장한다.
		for (int i = 0; i < numbers.length; i++) {
			int number = random.nextInt(100) + 1; // 0부터 99까지  +1을 하게 되면 1 ~ 100 까지
			numbers[i] = number;
		}
		
		// 4. 배열에 저장된 값 중에서 가장 큰 숫자와 가장 작은 숫자를  찾는다.
		// 최대값 구하기 - max 변수에 들어있는 값과 배열의 값을 비교해서 배열의 값이 더 크면 그 값을 max에 대입한다.
		// 최대값 구하기1 - 배열의 0번재 저장된 값을 max 변수에 대입한다.
		// 최대값 구하기2 - 배열의 1번째 부터 배열의 끝까지 배열에 저장된 숫자를 하나씩 가져와서 max에 저장된 값과 비교하면서 최대값을 찾는다.
		// 최대값 구하기3 - 배열의 i번째 값을 조회한다.
		// 최대값 구하기4 - 배열의 i번째 값과 max에 저장된 값을 비교해서 배열의 i번째 값이 더 크면, max에 배열의 i번째 값을 대입한다.
		int max = numbers[0];
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			int num = numbers[i];
			// 최대값 구하기
			// 배열에서 조회한 값이 max의 값보다 크면, 배열에서 조회한 값을 max에 대입시킨다.
			if (num > max) {
				max = num;
			}
			// 최소값 구하기
			// 배열에서 조회한 값이 min의 값보다 작으면, 배열에서 조회한 값을 min에 대입시킨다.
			if (num < min) {
				min = num;
			}
		}
		// 5. 최소값과 최대값을 출력한다.
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		// 6. 배열에 저장된 값 출력한다.
		for (int num : numbers) {
			System.out.println(num);
		}
	}
}

