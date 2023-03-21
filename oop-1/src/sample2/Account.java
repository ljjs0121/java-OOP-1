package sample2;
/**
 * 입금 기능, 출금 기능, 비밀번호 변경 기능, 계좌정보 출력 기능을 제공하는 클래스다.
 * @author Lee
 *
 */
public class Account {
	
	long balance;
	int password;
	double depositInterestRate;
	// 변경 추가 삭제 > void
	// 입금기능
	// 입금액을 전달받아서 잔액을 증가시킨다.
	// 반환타입 : void
	// 메소드이름 : deposit
	// 매개변수 : int amount
	// 구현내용 : 매개변수로 전달받은 금액만큼 현재 잔액을 증가시킨다.
	void deposit(int amount) {
		balance += amount;
	}
	
	// 출금기능
	// 출금액과 비밀번호를 전달받아서 출금액만큼 잔액을 감소시키고, 출금액만큼 금액을 반환한다.
	// 반환타입 : long
	// 메소드이름 : withdraw
	// 매개변수 : int amount, int pwd
	// 구현내용 : 매개변수로 전달받은 출금액만큼 잔액을 감소시키고, 출금액만큼의 금액을 반환한다.
	//			단, 비밀번호가 일치하지 않으면 오류 메세지를 표시하고 메소드를 종료한다.
	//			단, 출금액보다 잔액이 부족하면 오류 메세지를 표시하고 메소드를 종료한다.
	long withdraw(int amount, int pwd) {
		if (password != pwd) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return 0;
		}
		if (balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		
		balance -= amount;
		
		return amount;
	}
	
	// 비밀번호 변경기능
	// 이전 비밀번호와 신규 비밀번호를 전달받아서 비밀번호를 변경한다.
	// 반환타입 : void
	// 메소드이름 : changePassword
	// 매개변수 : int prevPassword, int newPassword
	// 구현내용 : 매개변수로 전달받은 이전 비밀번호와 멤버변수의 비밀번호가 일치하면 
	//			전달받은 새 비밀번호를 멤버변수 password에 대입한다.
	// 			단, 이전비밀번호와 새 비밀번호와 동일하면 오류 메세지를 출력하고, 메소드를 종료한다.
	// 			단, 이전비밀번호와 멤버변수 password에 저장된 비밀번호가 일치하지 않으면 오류 메세지를 출력하고, 메소드를 종료한다.
	void changePassword(int prevPassword, int newPassword) {
		if (prevPassword == newPassword) {
			System.out.println("이전 비밀번호와 동일한 비밀번호로 변경할 수 없습니다.");
			return;
		}
		if (prevPassword != password) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		password = newPassword;
	}
	
	// 계좌정보 출력기능
	// 비밀번호를 전달받아서 잔액, 금리를 출력한다.
	// 반환타입 : void
	// 메소드이름 : printAccountInfo
	// 매개변수 : int inputPassword
	// 구현내용 : 현재잔액, 금리를 화면에 출력한다.
	// 			단, 비밀번호가 일치하지 않으면 오류메세지를 출력하고, 메소드를 종료한다.
	void printAccountInfo(int inputPassword) {
		if (inputPassword != password) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		
		System.out.println("--- 계좌정보 ---");
		System.out.println("현재 잔액: " + balance + " 원");
		System.out.println("현재 금리: " + (depositInterestRate*100) + " %");
	}
	
}
