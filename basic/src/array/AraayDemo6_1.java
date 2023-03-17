package array;

import util.KeyboardReader;

public class AraayDemo6_1 {

	public static void main(String[] args) {
		KeyboardReader reader = new KeyboardReader();
		
		/* 강사님 풀이 */
		// 숫자를 입력받는다.
		System.out.println("첫번째 숫자를 입력하세요: ");
		int firstNumber = reader.readInt();
		System.out.println("두번째 숫자를 입력하세요: ");
		int secondNumber = reader.readInt();
		
		// 배열을 생성한다.
		int size = secondNumber - firstNumber + 1;
		int[] numbers = new int[size];
		
		// 배열을 숫자 저장하기
		for (int i = 0; i < size; i++) {
			numbers[i] = i + firstNumber;
		}
		
		// 총합을 계산하기
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		System.out.println("--- 총합을 확인하세요 ---");
		System.out.println(total);
	}

}
