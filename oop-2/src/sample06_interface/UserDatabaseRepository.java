package sample06_interface;

public class UserDatabaseRepository implements UserRepository {

	@Override
	public void insertUser(User user) {
		System.out.println("### 데이터베이스에 ["+user.getId()+"] ["+user.getName()+"] 정보를 저장한다.");
	}

	@Override
	public void updateUser(User user) {
		System.out.println("### 데이터베이스에서 ["+user.getId()+"] ["+user.getName()+"] 정보를 찾아서 변경한다.");
	}

	@Override
	public void deleteUser(String id) {
		System.out.println("### 데이터베이스에서 ["+id+"] 정보를 삭제한다.");
	}

	@Override
	public User getUserById(String id) {
		System.out.println("### 데이터베이스에서 ["+id+"] 정보를 조회한다.");
		return new User(id, "사용자1");
	}

	
}
