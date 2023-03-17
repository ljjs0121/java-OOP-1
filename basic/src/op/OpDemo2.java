package op;

public class OpDemo2 {

	public static void main(String[] args) {
		// 대입 연산자
		// = += -= *= /= %=
		
		int num1 = 10;
		int num2 = 10;
		int num3 = 10;
		int num4 = 10;
		int num5 = 10;
		
		num1 += 3;		// num1 = num1 + 3;
		num2 -= 3;		// num2 = num2 - 3;
		num3 *= 3;		// num3 = num3*3;
		num4 /= 3;		// num4 = num4/3;
		num5 %= 3;		// num5 = num5%3;
	
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// +=을 이용하면 총합을 계산할 수 있다
		int num = 0;
		num += 100;
		num += 90;
		num += 80;
		num += 100;
		num += 50;
		System.out.println(num);
	
	}

}
