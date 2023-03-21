package sample2;
// /** + enter -> 설명글 작성법 / 자바 도큐먼트 주석이라 한다.
/**
 * 사칙연산 기능을 제공하는 클래스다.
 * @author Lee
 *
 */
public class Calculator {

	/**
	 * 정수 2개를 전닯받아서 덧셈을 수행하고, 그 결과를 반환한다.
	 * @param num1 첫번째 정수
	 * @param num2 두번째 정수
	 * @return 덧셈결과
	 */
	int plus(int num1, int num2) {
		int x = num1 + num2;
		return x;
	}
	
	/**
	 * 정수 2개를 전달받아서 뺄셈을 수행하고, 그 결과를 반환한다.
	 * @param num1 첫번째 정수
	 * @param num2 두번째 정수
	 * @return 뺄셈결과
	 */
	int minus(int num1, int num2) {
		int x = num1 - num2;
		return x;
	}
	
	/**
	 * 정수 2개를 전달받아서 곱셈을 수행하고, 그 결과를 반환한다.
	 * @param num1 첫번째 정수
	 * @param num2 두번째 정수
	 * @return 곱셈결과
	 */
	int multi(int num1, int num2) {
		int x = num1*num2;
		return x;
	}
	
	/**
	 * 정수 2개를 전달받아서 나눗셈을 수행하고, 그 결과를 반환한다. 결과값은 {@code double} 형의 값이다.
	 * @param num1 첫번째 정수
	 * @param num2 두번째 정수
	 * @return 나눗셈결과, {@code double}형의 값.
	 */
	double divide(int num1, int num2) {
		double x = num1/num2;
		return x;
	}
}
