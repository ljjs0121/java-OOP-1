package practice;

import util.KeyboardReader;

public class Demo7 {

	public static void main(String[] args) {
		// 키보드 입력을 읽어오는 기능을 제공하는 KeyboardReader 객체를 생성한다.
		// new KeyboardReader() -> new 키워드를 사용해서 KeyboardReader설계도로 객체를 생성한다.
		// KeyboardReader reader -> KeyboardReader설계도로 생성된 객체의 주소값을 담는 참조변수
		KeyboardReader reader = new KeyboardReader();
		// System.out.println("학생 이름을 입력하세요 : ");
		// reader.readString(); // .readString(); 은 문자열을 얻을 수 있다.
		
		// 국어, 영어, 수학점수를 입력받아서 총점과 평균을 출력하기
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = reader.readInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = reader.readInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = reader.readInt();
		
		int total = kor + eng + math;
		int average = total/3;
		
		System.out.println("--- 점수를 확인하세요 ---");
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("총합점수: " + total);
		System.out.println("평균점수: " + average);
		
	}
}
