package op;

public class OpDemo4 {
	public static void main(String[] args) {
		// 비교 연산자
		// > >= < <= == !=
		// 연산결과는 항상 boolean 타입의 값이다. (true 혹은 false)
		
		int num1 = 67;
		boolean result1 = num1 >= 60;
		System.out.println(result1);
		
		int num2 = 10;
		int num3 = 20;
		
		System.out.println(num2 > num3);	// false
		System.out.println(num2 >= num3);	// false
		System.out.println(num2 < num3);	// true
		System.out.println(num2 <= num3);	// true
		System.out.println(num2 == num3);	// false
		System.out.println(num2 != num3);	// true
	}
}
