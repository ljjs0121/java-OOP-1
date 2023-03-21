package sample2;

public class AccountApp {

	public static void main(String[] args) {
		
		// 계좌정보 관리기능을 지원하는 Account
		Account account = new Account();
		
		// 최초 잔액과 비밀번호 설정하기
		account.balance = 100000;
		account.password = 1234;
		account.depositInterestRate = 0.03;
		
		// 입금하기
		account.deposit(500_000);
		// 계좌정보 출력하기
		account.printAccountInfo(1234);		// 인자라고 한다.
		
		// 출금하기
		long amount = account.withdraw(150_000, 1234);
		System.out.println("출금액: " + amount);
		
		// 비밀번호 변경하기
		account.changePassword(1234, 1111);
		
		// 계좌정보 출력하기
		account.printAccountInfo(1111);
	}
}
