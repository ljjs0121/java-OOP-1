package control;

public class IfDemo44 {
	public static void main(String[] args) {
	// 성적이 60점 이상이면 합격이다.
	// 성적이 60범 미만이면 불합격이다.
	// 성적이 95점 이상이면 장학금 지급대상이다.
	// 성적이 40점 미만이면 재응시 기회가 박탈됩니다.
	
	// 중첩 if문
	int score = 30;
	if (score >= 60) {
		System.out.println("합격입니다.");
		if (score >= 95) {
			System.out.println("장학금 지급대상입니다.");
		}
	} else {
		System.out.println("불합격입니다.");
		if (score < 40) {
			System.out.println("재응시 기회가 박탈됐습니다.");
		}
	}
	
	}
}
