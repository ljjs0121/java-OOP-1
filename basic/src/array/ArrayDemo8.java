package array;

// import문 = 패키지에 존재하지 않은 클래스를 사용할 경우 import문을 사용한다.
// 			  다만, String은 java 자체에서 기본으로 하는것이기 때문에 예외이다.
import java.util.Arrays;
import java.util.Random;

public class ArrayDemo8 {
	/*
	 * 
	 */
	public static void main(String[] args) {
		// 1 ~ 100 사이의 임의의 정수를 배열에 저장한다.
		// 배열의 크기는 10이다.
		// 숫자에 3 혹은 6 혹은 9가 포함된 숫자가 몇개나 있는지 조사해서 그 수를 출력
		
		// 1. 난수를 제공하는 Random객체를 생성한다.
		Random random = new Random();
		
		// 2. 정수 10개를 저장하는 배열객체를 생성한다.
		int[] numbers = new int[10];
		
		// 3. 배열의 각 요소에 임의의 정수 저장하기
		for (int i = 0; i < numbers.length; i++) {
			// 1 ~ 100 사이의 임의의 정수를 획득해서 number 변수에 저장한다.
			int number = random.nextInt(100) + 1;
			// 배열의 i번째 요소에 숫자를 저장한다.
			numbers[i] = number;
		}
		
		// 4. 배열에 저장된 숫자 중에서 3, 6, 9를 포함하고 있는 숫자의 갯수를 담은 변수 생성
		int count = 0;
		int count1 = 0;
		// 5. 배열의 각 요소에 저장된 숫자를 조사해서 3/6/9가 포함되어 있는지 확인하고, 포함되어 있으면 count값을 1 증가 시킨다.
		for (int number : numbers) {
			// 일의자리 수 조회하기
			int num1 = number%10;
			if (num1 == 3 || num1 == 6 || num1 == 9) {
				count++;
				continue;
			}
			// 십의자리 수 조회하기
			int num2 = number/10;
			if (num2 == 3 || num2 == 6 || num2 == 9) {
				count++;
			}
		}
		/*
		 *  추가 문제
		 *  3/6/9 포함되지 않은 수 구하기
		 */
		// 3/6/9가 포함되지 않은 수 구하기
		for (int number : numbers) {
			// 플래그변수란것을 생성
			// 플래그변수란 변수의 값을 통해서 로직의 수행결과를 판단하는 작업을 말한다.
			boolean exist = false;
			// 일의자리 수 조회하기
			int num1 = number%10;
			if (num1 == 3 || num1 == 6 || num1 == 9) {
				exist = true;
				continue;
			}
			// 십의자리 수 조회하기
			int num2 = number/10;
			if (num2 == 3 || num2 == 6 || num2 == 9) {
				exist = true;
			}
			// exist(3/6/9가 포함된 경우)가 참이면 포함이므로 count1 증가가 안된다.
			// 만일 거짓이면 3/6/9가 포함되지 않은 것이므로 count1이 1 증가
			if (!exist) {
				count1++;
			}
		}
		// 6. count에 저장된 값을 출력한다.
		System.out.println("3/6/9가 포함된 숫자의 갯수: " + count);
		System.out.println("3/6/9가 포함되지 않은 숫자의 갯수: " + count1);
		
		// 7. 배열에 저장된 숫자를 전부 출력한다.
		System.out.println(Arrays.toString(numbers));
	}
}
