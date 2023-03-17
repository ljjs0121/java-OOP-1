package practice;

public class Demo3 {
	
	public static void main(String[] args) {
		// 아래의 세자리 숫자에 대해서 100의 자리, 10의 자리, 1의 자리 숫자를 구해서 그 숫자들의 합계를 출력하시오
		int number = 345;
		
		// 강사님 풀이
		// number = 345;						345/100 -> 3 	백의 자리 숫자
		// number = 345 - (3*100)	-> 45 		45/10 	-> 4 	십의 자리 숫자
		// number = 45 - (4*10)		-> 5						일의 자리 숫자
		
		int num1 = number/100;
		number = number - (num1*100); 	// number = number - (num1*100);	// number = 45
		
		// 십의자리 수 구하기
		int num2 = number/10;
		
		// 일의 자리 수 구하기
		int num3 = number - (number*10);
		
		int sum = num1 + num2 + num3;
		System.out.println(sum);
	}
	
}
