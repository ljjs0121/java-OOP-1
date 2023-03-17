package array;

public class ArrayDemo1 {
		/*
		 * 배열 생성
		 * 		타입[] 변수명 = new 타입[크기];
		 * 		타입[] 변수명 = {값, 값, 값, 값};
		 * 		타입[] 변수명 = new 타입[]{값, 값, 값, 값};
		 * 
		 * 예시
		 * 		// 정수 5개를 저장하는 배열객체 생성하고, 그 객체의 주소값을 arr1에 대입한다.
		 * 		int[] arr1 = new int[5];
		 * 		// 실수 5개를 저장하는 배열객체 생성하고, 그 객체의 주소값을 arr1에 대입한다.
		 * 		double[] arr1 = new double[5];
		 * 		// 문자열 5개를 저장하는 배열객체 생성하고, 그 객체의 주소값을 arr1에 대입한다.
		 * 		String[] arr1 = new String[5];
		 * 	// new - 객체를 생성시키는 키워드
		 * 		
		 * 		* int x;는 정수값을 저장하는 변수 x다.
		 * 		* int[] x;는 정수값을 여러개 저장하는 정수배열객체의 주소값을 저장하는 변수 x다.
		 * 		
		 */
	public static void main(String[] args) {
		
		// 정수 5개 담는 배열객체 생성하기
		int[] arr1 = new int[5];
		// 실수 5개 담는 배열객체 생성하기
		double[] arr2 = new double[5];
		// 문자열 3개 담는 배열객체 생성하기
		String[] arr3 = new String[3];
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		// 실행 된 값은 주소값이 아니다. 배열객체의 식별값을 나타내는 값이다.
		
		// 모든 배열객체는 배열의 크기 정보를 표현하는 length 프로퍼티(성질)가 있다.
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		// length 는 배열의 크기를 나타낸다.
		// . 는 객체접근연산자이다.
		
		// 배열객체의 각 요소에 접근할 때는 배열의 인덱스를 사용한다.
		int arr1Len = arr1.length;
		for (int i = 0; i < arr1Len; i++) {
			System.out.println(arr1[i]);
		}
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		System.out.println(arr1[4]);

		int arr2Len = arr2.length;
		for (int i = 0; i < arr2Len; i++) {
			System.out.println(arr2[i]);
		}
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr2[2]);
//		System.out.println(arr2[3]);
//		System.out.println(arr2[4]);

		int arr3Len = arr3.length;
		for (int i = 0; i < arr3Len; i++) {
			System.out.println(arr3[i]);
		}
//		System.out.println(arr3[0]);
//		System.out.println(arr3[1]);
//		System.out.println(arr3[2]);
	}
}
