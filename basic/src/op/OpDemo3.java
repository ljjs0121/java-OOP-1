package op;

public class OpDemo3 {
	public static void main(String[] args) {
		// 증감 연산자
		// ++ --
		
		int num1 = 10;
		int num2 = 10;
		
		num1++;
		num1++;
		num1++;
		System.out.println(num1);
		
		num2--;
		num2--;
		num2--;
		System.out.println(num2);
		
		// 증감연산자를 다른 연산자와 같이 사용할 때는 연산자의 위치에 따라서 결과값이 달라질 수 있다.
		int num3 = 10;
		int num4 = 10;
		int result3 = num3++;	// num3의 값을 result3에 대입시킨후 num3의 값을 1 증가시킨다.
		int result4 = ++num4;	// num4의 값을 1증가시킨후 num4의 값을 result4에 대입한다.
		
		System.out.println(result3);	// 10
		System.out.println(num3);		// 11
		System.out.println(result4);	// 11
		System.out.println(num4);		// 11
		
		// 아래 비교 연산식의 결과도 증감연산자의 위치에 따라서 결과값이 다르게 출력된다.
		int num5 = 10;
		int num6 = 10;
		System.out.println(num5++ == 10);
		System.out.println(++num6 == 10);
		
		// 따라서, 증감연산자와 다른 연산(대입연산이나 비교연산)을 같이 실행하지 말고, 먼저 증감연산을 실행한 후에 다른 연산에 사용하는 것이 좋다.
		int num7 = 10;
		int num8 = 10;
		
		num7++;
		++num8;
		System.out.println(num7 > 10);
		System.out.println(num8 > 10);
	}
}
