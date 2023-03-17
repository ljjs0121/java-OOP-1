package op;

public class OpDemo1 {

	public static void main(String[] args) {
		// 산술 연산자
		// + - * / %
		// 나머지 연산자의 연산결과는 0 ~ 나누는수 -1
		int num1 = 11;
		int num2 = 4;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1*num2;
		int result4 = num1/num2;
		int result5 = num1%num2;
		// * / % 는 좌우항 붙여서 사용 > int result6 = num1 + num2*num3;
			
		System.out.println(result1);	// 15
		System.out.println(result2);	// 6
		System.out.println(result3);	// 44
		System.out.println(result4);	// 2 (몫)
		System.out.println(result5);	// 3 (나머지)

		double num3 = 0.1;
		double num4 = 0.2;
		
		double result6 = num3 + num4;
		double result7 = num3 - num4;
		
		System.out.println(result6);
		System.out.println(result7);
		
		double result8 = (num3*10 + num4*10)/10;
		System.out.println(result8);
	}

}
