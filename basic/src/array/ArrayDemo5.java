package array;

import util.KeyboardReader;

public class ArrayDemo5 {

	public static void main(String[] args) {
		
		// KeyboardReader를 이용해서 사용자가 입력한 값을 읽어와서 배열에 저장하기
		// 학생이름을 입력받아서 배열에 저장하기, 총 학생수는 3명으로 정한다.
		
		// 1. 키보드 입력을 읽어오는 기능이 제공되는 객체를 생성해서 reader 변수가 참조하게 한다.
		KeyboardReader reader = new KeyboardReader();
		// 2. 입력값을 저장할 배열객체를 생성한다.
		String[] names = new String[3];
		
		for(int i = 0; i < 3; i++) {
			// 3. 학생 이름을 입력하라는 메시지를 화면에 출력한다.
			System.out.print("학생 이름을 입력하세요: ");
			
			// 4. reader가 참조하는 객체의 readString()을 실행해서 입력값을 읽어와서 변수에 대입한다.
			String value = reader.readString();
			
			// 5. 변수에 저장된 값을 배열의 0번째 요소로 저장한다.
			names[i] = value;
		}
		
		// 6. 배열에 저장된 값을 전부 출력해보기
		System.out.println("--- 전체 학생이름을 확인하세요 ---");
		for (String name : names) {
			System.out.println(name);
		}
		
	}
}
