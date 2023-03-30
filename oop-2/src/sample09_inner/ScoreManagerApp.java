package sample09_inner;

public class ScoreManagerApp {

	public static void main(String[] args) {
		
		ScoreManager manager = new ScoreManager();
		Summary summary = manager.getSummary();
		System.out.println("성적합계: " + summary.total());
		System.out.println("성적합계: " + summary.average());
	}
}
