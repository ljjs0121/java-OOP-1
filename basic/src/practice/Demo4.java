package practice;

public class Demo4 {

	public static void main(String[] args) {
		// 아래 두 수의 값을 서로 교환하시오.
		int x = 20;
		int y = 30;
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
	}
}
