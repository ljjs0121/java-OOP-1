package array;

import java.util.Random;

public class ArrayDemo9 {
	/*
	 * 로또 프로그램 만들기
	 */
	public static void main(String[] args) {
		// 배열에 1 ~ 45 사이의 숫자를 중복없이 6개 저장하기
		
		// 1. 임의의 정수를 제공하는 Random 객체를 생성한다.
		Random random = new Random();
		
		// 2. 정수 6개를 저장하는 배열 객체를 생성한다.
		int[] lotto = new int[6];
		
		// 3. 배열객체에 숫자를 저장할 위치를 나타내는 변수를 생성하고, 초기값을 0을 설정한다.
		int position = 0;
		
		// 4. 임의의 정수를 조회해서 중복없이 배열에 순서대로 저장시키는 작업을 계속 수행한다.
		while (true) {
			// position 값이 6이면 배열의 0 ~ 5번째까지 모든 값이 채워졌기 때문에 반복문을 탈출한다.
			if (position == 6) {
				break;
			}
			
			// 5. 임의의 정수를 조회한다.
			int number = random.nextInt(45) + 1;
			System.out.println("임의의 정수 --> " + number);
			
			// 6. 획득한 정수가 배열에 저장되어 있는지 조사하기
			boolean isExist = false;
			for (int num : lotto) {
				// 배열에 가져온 값이 0일때 조사작업을 중단한다.
				if (num == 0) {
					break;
				}
				// 배열에 가져온 값과 임의의 정수가 서로 일치하면 isExist의 값을 true로 설정하고, 조사작업을 중단한다.
				if (num == number) {
					isExist = true;
					break;
				}
			}
			
			// 7. isExist 변수의 값이 false면(임의의 정수와 일치하는 값이 배열에 존재하지 않는다.)
			// 	  배열에 임의의 정수를 저장한다.
			if (isExist) {
				lotto[position] = number;
				position++;
			}
		}
		
		// 8. 배열에 저장된 값을 출력한다.
		for (int num : lotto) {
			System.out.println(num + "\t");
		}
		System.out.println();
		// 간편한 출력
//		System.out.println(Arrays.toString(lotto));
	}
}
