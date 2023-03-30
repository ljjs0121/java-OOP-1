package sample06_interface;
// interface는 연결할때 구현기능인 implements 사용
public class UserExcelRepository implements UserRepository{

	@Override
	// interface는 미리 반환값과 변수명을 설정할 수 있다.
	public void insertUser(User user) {
		System.out.println("### 엑셀파일에 ["+user.getId()+"] ["+user.getName()+"] 정보를 저장한다.");
	}

	@Override
	public void updateUser(User user) {
		System.out.println("### 엑셀파일에서 ["+user.getId()+"] ["+user.getName()+"] 정보를 찾아서 변경한다.");
	}

	@Override
	public void deleteUser(String id) {
		System.out.println("### 엑셀파일에서 ["+id+"] 정보를 삭제한다.");
	}

	@Override
	public User getUserById(String id) {
		System.out.println("### 엑셀파일에서 ["+id+"] 정보를 조회한다.");
		return new User(id, "사용자1");
	}

	
}
