package practice;

public class Demo5 {

	public static void main(String[] args) {
		
		// 지정된 정수의 약수를 모두 출력하시오.
		
		int x = 12;	// 1, 2, 3, 4, 6, 12
		
		// 1 부터 12 까지 나눠서 나머지가 0이면 약수니까 그 수만 출력하게끔 하면 된다.
		for (int i = 1; i <= 12; i++) {
			if (x%i == 0) {
				System.out.println(i);
			}
		}
		
	}
}
