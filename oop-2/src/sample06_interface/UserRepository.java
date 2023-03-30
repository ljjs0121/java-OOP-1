package sample06_interface;
// 인터페이스를 활용한 예제
/**
 * 사용자정보 관리와 관련된 기능명세(스펙, 사양, 표준, 규격)을 정의하는 인터페이스다.
 * @author L
 *
 */
public interface UserRepository {

	/*
	 * 사용자정보 저장기능에 대한 명세다.
	 * 	명세
	 * 		반환타입 : void
	 * 		메소드이름 : insertUser
	 * 		매개변수 : User
	 */
	void insertUser(User user);
	
	/*
	 * 사용자정보 변경기능에 대한 명세다.
	 * 	명세
	 * 		반환타입 : void
	 * 		메소드이름 : updateUser
	 * 		매개변수 : User
	 */
	void updateUser(User user);
	
	/*
	 * 사용자정보 삭제기능에 대한 명세다.
	 * 	명세
	 * 		반환타입 : void
	 * 		메소드이름: deleteUser
	 * 		매개변수 : String
	 */
	void deleteUser(String id);
	
	/*
	 * 사용자 정보 조회기능에 대한 명세다.
	 * 	명세
	 * 		반환타입 : User
	 * 		메소드이름 : getUserById
	 * 		매개변수 : String
	 */
	User getUserById(String id);
}
