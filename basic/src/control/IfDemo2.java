package control;

public class IfDemo2 {

		public static void main(String[] args) {
			/*
			 * if ~ else문
			 * 	if ~ else문의 조건식이 true로 판정될 때 실행할 수행문과 조건식이 false로 판정될 때 실행할 수행문은 지정할 수 있다.
			 *	if ~ else문의 형식
			 *		if () {
			 *			수행문1;
			 *			수행문2;
			 *		} else {
			 *			수행문3;
			 *			수행문4;
			 * 		}
			 * 		* 조건식이 true로 판정되면 수행문1과 수행문2가 실행된다.
			 * 		* 조건식이 false로 판정되면 수행문3과 수행문4가 실행된다.
			 */
			
			// 자동차 유상수리 여부를 기준으로 유상수리 대상일 때는 수리비를 출력하고, 무상수리 대상일 때는 "무상수리하였습니다." 출력한다.
			// 유상수리 기준 : 운행거리 5만km 이상이거나 사용기간 3년 이상
			int distance = 65_000;
			int usedYear = 2;
			
			if (distance >= 50_000 || usedYear >= 3) {
				int repairAmount = 1_000_000;
				System.out.println("수리비 : " + repairAmount + " 원");
			} else { 
				System.out.println("무상수리하였습니다.");
			}
			
			
		}
}
