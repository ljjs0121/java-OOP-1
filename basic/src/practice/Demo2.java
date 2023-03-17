package practice;

public class Demo2 {

	public static void main(String[] args) {
		
		// 숫자 3개 중에서 가장 큰 숫자를 출력하기
		int x = 50;
		int y = 40;
		int z = 60;
		
		// if문 (논리곱 && 활용)
		if (x > y && x > z ) {
			System.out.println("x의 값 = " + x);
		} else if (y > x && y > z ) {
			System.out.println("y의 값 = " + y);
		} else if (z > x && z > y) {
			System.out.println("z의 값 = " + z);
		}
		
		// 강사님 풀이
		// x 와 y를 비교해서 더 큰 값을 t에 저장
		int t = 0;
		if (x >= y) {
			t = x;
		} else {
			t = y;
		}
		
		// t와 z를 비교해서 더 큰 값을 출력시킨다.
		if (t >= z) {
			System.out.println(t);
		} else {
			System.out.println(z);
		}
	}
	
}
