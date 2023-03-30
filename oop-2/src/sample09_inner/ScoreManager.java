package sample09_inner;

public class ScoreManager {

	private Score[] scores = {
			new Score("홍유빈", 30, 50, 80),
			new Score("김다미", 100, 100, 90),
			new Score("최수빈", 90, 60, 70),
	};
	// 성적 추가하기
	// 성적 변경하기
	// 성적 삭제하기
	
	// 요약정보 제공하기
	public Summary getSummary() {
		// 내부클래스인 Summary를 반환
		return new ScoreSummary();
	}
	
	// 멤버내부클래스 작성하기
	class ScoreSummary implements Summary {

		@Override
		public int total() {
			int total = 0;
			for (Score score : scores) {
				total += score.getKor();
				total += score.getEng();
				total += score.getMath();
				
			}
			return total;
		}

		@Override
		public int average() {
			
			return total()/(scores.length*3);
		}
		
	}
}
