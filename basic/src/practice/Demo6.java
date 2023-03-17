package practice;

public class Demo6 {

	public static void main(String[] args) {
		// 구구단 출력하기
		/*
		 * 		2 * 1 = 2
		 * 		2 * 2 = 4
		 * 		2 * 3 = 6
		 * 		2 * 4 = 8
		 * 		2 * 5 = 10
		 * 		2 * 6 = 12
		 * 		...
		 * 		2 * 9 = 18
		 * 
		 * 		System.out.println(dan + " * " + i + " = " + (dan*i));
		 */
		// 지정한 숫자에 대한 구구단 출력
		int dan = 7;
		
		for (int i = 1; i <10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		
		// 2단부터 9단까지 응용
		for (int x = 2; x < 10; x++) {
			System.out.println(x + "단");
			
			for (int y = 1; y < 10; y++) {
				System.out.println(x + " * " + y + " = " + (x * y));
			}
			System.out.println();
		}
	}
}
