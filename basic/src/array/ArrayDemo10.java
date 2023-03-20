package array;

public class ArrayDemo10 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * 		타입[][] 변수명 = new 타입[크기][크기];
		 * 		타입[][] 변수명 = new 타입[크기][];			// 두번째배열표시의 크기는 생략가능하다.
		 * 		* 첫번째 크기는 생략할 수 없다.
		 * 
		 * 		타입[][] 변수명 = {{값, 값},{값, 값},{값, 값}};
		 * 		타입[][] 변수명 = {{값},{값,값, 값},{값, 값}};
		 * 		* 내부 배열의 크기는 서로 다를 수 있다.		
		 */
		
		// 2행 3열 크기의 배열객체 생성하기
		int[][] arr1 = new int[2][3];
		
		// 행의 크기 조회하기
		System.out.println("행의 크기 : " + arr1.length);
		// 열의 크기 조회하기
		System.out.println("1번째 행의 배열의 크기 : " + arr1[0].length);
		System.out.println("2번째 행의 배열의 크기 : " + arr1[1].length);
		
		// 배열에 값 대입하기
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[1][0] = 40;
		arr1[1][1] = 50;
		arr1[1][2] = 60;
		
		// 3행 4열 크기의 배열객체를 생성하기
		int[][] arr2 = {{10, 20, 30, 40},{50, 60, 70, 80},{90, 100, 110, 120}};
		// 배열의 값 출력하기
		// 다중 for문을 사용해서 다차원 배열의 반복처리 할 수 있다.
		int rowSize = arr2.length;
		for (int i = 0; i < rowSize; i++) {		// 행의 갯수만큼 반복 
			int columSize = arr2[i].length; 
			// 3 대신 arr2.length
			for (int j = 0; j < columSize; j++) {	// 열의 갯수만큼 반복
				// 4 대신 arr2[i].length
				System.out.println("[" + i + "][" + j + "] -> " + arr2[i][j]);
			}
		}
		
		// 열의 크기가 서로 다른 3행짜리 배열객체 생성하기
		String[][] names = new String[3][];
		String[] teamA = {"이다혜", "박연진"};
		String[] teamB = {"여진구"};
		String[] teamC = {"IU", "뉴진스","지코","개리","김윤식"};
		names[0] = teamA;
		names[1] = teamB;
		names[2] = teamC;
		
		// 배열의 값 출력
		for (int i = 0; i < names.length; i++) {
			int columsize = names[i].length;
			for (int j = 0; j < columsize; j++) {
				System.out.println("["+i+"]["+j+"] -> " + names[i][j]);
			}
		}
	}
}
