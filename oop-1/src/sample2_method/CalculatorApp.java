package sample2_method;

public class CalculatorApp {
	
	public static void main(String[] args) {
		// 사칙연산 기능이 구현된 Calculator객체 생성하기
		Calculator calculator = new Calculator();
		
		// 덧셈기능 사용하기
		int result = calculator.plus(499, 399);
		System.out.println("덧셈 결과 : " + result);
		
		// 뺄셈기능 사용하기
		int result1 = calculator.minus(499, 399);
		System.out.println("뺄셈 결과 : " + result1);
		
		// 곱셈기능 사용하기
		int result2 = calculator.multi(299, 599);
		System.out.println("곱셈 결과 : " + result2);
		
		// 나눗셈기능 사용하기
		double result3 = calculator.divide(12, 2);
		System.out.println("나눗셈 결과 : " + result3);
	}
}
