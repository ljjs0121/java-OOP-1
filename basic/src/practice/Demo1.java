package practice;

public class Demo1 {

	public static void main(String[] args) {
		
		// 변수에 저장된 두 수 중에서 더 큰 수를 출력하시오.
		int x = 10;
		int y = 100;
		
		// if문을 사용해서 더 큰 값이 출력되게 한다.
		if (x > y) {
			System.out.println(x);
		} else if (x < y) {
			System.out.println(y);
		} 
		// 강사님 풀이
		if (x >= y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
	}
}
