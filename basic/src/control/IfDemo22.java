package control;

public class IfDemo22 {
	public static void main(String[] args) {
		// 자동차 유상수리 여부를 기준으로 유상수리 대상일 때는 수리비를 출력하고, 무상수리 대상일 때는 "무상수리하였습니다." 출력한다.
		// 유상수리 기준 : 운행거리 5만km 이상이거나 사용기간 3년 이상
	
		int distance = 30_000;
		int usedYear = 3;
		
		if (distance >= 50_000 || usedYear >= 3) {
			int repairAmount = 1_000_000;
			System.out.println("수리비 : " + repairAmount + "원");
		} else {
			System.out.println("무상수리하였습니다.");
		}
	
	}
}
