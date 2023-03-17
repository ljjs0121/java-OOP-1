package control;

public class SwitchDemo1 {
	public static void main(String[] args) {
		/*
		 * switch문
		 * 		switch (값) {
		 * 			case 값1:
		 * 				수행문1;
		 * 				break;
		 * 			case 값2:
		 * 				수행문2;
		 * 				break;
		 * 			case 값3:
		 * 				수행문3;
		 * 				break;
		 * 			default:
		 * 				수행문4;
		 * 		}
		 * 		* 값의 타입은 정수, 문자, 문자열, enum만 가능하다.
		 * 		* 수행문1은 값과 값1이 일치하면 실행된다.
		 * 		* 수행문2는 값과 값2가 일치하면 실행된다.
		 * 		* 수행문3은 값과 값3이 일치하면 실행된다.
		 * 		* 수행문4는 값과 일치하는 case가 없을 때 실행된다.
		 *		* break는 switch문의 실행을 중단시키고 탈출한다. 
		 */
		
		String grade = "골드";
		int orderAmount = 1_000_000;
		
		double depositRate = 0;
		switch (grade) {
		case "골드" :
			depositRate = 0.05;
			break;
		case "실버" :
			depositRate = 0.02;
			break;
		case "브론즈" :
			depositRate = 0.01;
			break;
		default :
			depositRate = 0.003;
		}
		
		int point = (int) (orderAmount*depositRate);
		System.out.println("고객등급 : " + grade);
		System.out.println("적립률 : " + depositRate);
		System.out.println("구매금액 : " + orderAmount);
		System.out.println("포인트 : " + point);
	}
}
