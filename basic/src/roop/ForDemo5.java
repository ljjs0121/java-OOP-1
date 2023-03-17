package roop;

public class ForDemo5 {
	/*
	 *  다중 for문
	 *   for문 내부에 for문이 존재하는 구문
	 *   
	 *   for (초기식; 조건식; 증감식) {
	 *   	수행문1;
	 *   	for (초기식; 조건식; 증감식 {
	 *   		수행문2;
	 *   	}
	 *   }
	 *   * 수행문1은 바깥쪽 for문의 반복 횟수만큼 실행된다.
	 *   * 수행문2는 (바깥쪽 for문의 반복 횟수 * 안쪽 for문의 반복 횟수)만큼 실행된다.
	 */
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("i -> " + i);
			for (int j = 1; j <= 5; j++) {
				System.out.println("i -> " + i + ", j -> " + j);
				}
			}
		}
	}

