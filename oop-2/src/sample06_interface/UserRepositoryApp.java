package sample06_interface;

public class UserRepositoryApp {

	public static void main(String[] args) {
		
		// 엑셀파일 혹은 데이터베이스로 사용자 정보 관리해보기
		UserRepository repo = new UserDatabaseRepository();
		
		User sampleUser = new User("hong", "홍유빈");
		
		// 저장하기
		repo.insertUser(sampleUser);
		
		// 변경하기
		sampleUser.setName("사용자1");
		repo.updateUser(sampleUser);
		
		// 조회하기
		User savedUser = repo.getUserById("hong");
		System.out.println("### 조회된 사용자정보 -> " + savedUser.getId() + ", " + savedUser.getName());
		
		// 삭제하기
		repo.deleteUser("hong");
		
	}
}
