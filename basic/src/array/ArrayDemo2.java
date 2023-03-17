package array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		// 배열 리터럴을 이용해서 배열객체 생성하기
		int[] arr1 = {10, 30, 50, 20, 70};
		String[] arr2 = {"김유신", "강감찬", "이순신", "유관순", "안중근"};
		
		// 배열의 각 요소에 저장된 값 출력하기
		for (int i = 0; i < arr1.length; i++) {
			int value = arr1[i];
			System.out.println("["+i+"]번째 값 -> " + value);
		}
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		System.out.println(arr1[4]);
//		
		for (int i = 0; i < arr2.length; i++) {
			String value = arr2[i];
			System.out.println("["+i+"]번째 값 -> " + value);
		}
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr2[2]);
//		System.out.println(arr2[3]);
//		System.out.println(arr2[4]);
	}
}
