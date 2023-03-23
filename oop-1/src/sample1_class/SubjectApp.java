package sample1_class;

public class SubjectApp {
	public static void main(String[] args) {
		
		// Subject subject -> subject 참조변수는 Subject 클래스로 생성된 객체의 주소값을 저장하는 참조변수다.
		// new Subject() -> new 키워드는 객체를 생성하고, 생성된 객체의 주소값을 참조변수에 대입시킨다.
		// 객체 생성 목적 -> 수강과목정보를 저장하기 위해서 아래와 같이 객체를 생성한 것이다.
		Subject subject = new Subject();
		subject.code = "s0101";
		subject.name = "이산수학";
		subject.department = "컴퓨터공학과";
		subject.professor = "김유신";
		subject.major = true;
		subject.credit = 3;
		subject.year = 2023;
		subject.term = "여름학기";
		subject.quota = 30;
		subject.applicants = 5;
		
		Subject subject2 = new Subject();
		subject2.code = "s0102";
		subject2.name = "데이터베이스 개론";
		subject2.department = "컴퓨터공학과";
		subject2.professor = "강감찬";
		subject2.major = true;
		subject2.credit = 3;
		subject2.year = 2023;
		subject2.term = "2학기";
		subject2.quota = 15;
		subject2.applicants = 0;
		
		/*
		 * Subject subject3 = new Subject();
		 * 아래의 코드는 전부 오류다. 생성된 객체의 멤버변수에 접근하기 위해서는 참조변수를 사용해야 한다.
		 * Subject는 참조변수가 아니다.
		 * subject.no = "s202";
		 * subject.name = "프로그램 기초";
		 * subject.department = "컴퓨터공학과";
		 */
		
		System.out.println("-- 컴퓨터공학과 개설과목 --");
		System.out.println(subject.name);
		System.out.println(subject2.name);
	}
}
