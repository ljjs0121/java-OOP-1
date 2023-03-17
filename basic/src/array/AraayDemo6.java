package array;

import util.KeyboardReader;

public class AraayDemo6 {

	public static void main(String[] args) {
		
		// 키보드 입력으로 두 수를 입력받아서, 해당 숫자의 범위에 포함되는 모든 숫자를 저장하는 배열을 생성하고,
		// 배열에 저장된 숫자들의 총합을 출력하기
		
		KeyboardReader reader = new KeyboardReader();
		
		// 숫자를 입력받는다.
		System.out.println("첫번째 입력값을 입력하세요: ");
		int firstNumber = reader.readInt();
		System.out.println("두번째 입력값을 입력하세요: ");
		int secondNumber = reader.readInt();
		
		// firstNumber의 값이 secondNumber의 값보다 클 경우 두 값을 바꿔주는 코드를 만들어준다.
		if (firstNumber > secondNumber) {
			int t = firstNumber;
			firstNumber = secondNumber;
			secondNumber = t;
		}
		// 배열을 생성한다.
		int[] size = new int[secondNumber - firstNumber + 1];
		
		// 배열을 숫자 저장하기
		for (int i = 0; i < size.length; i++) {
			size[i] = i + firstNumber;
		}
		
		// 총합을 계산하기
		int total = 0;
		for (int num : size) {
			total += num;
		}
		System.out.println("총합: " + total);
	}
}
