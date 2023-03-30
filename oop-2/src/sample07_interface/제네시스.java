package sample07_interface;

public class 제네시스 implements 운전기능명세, 안전기능명세, 고급안전기능명세 {

	@Override
	public void 전방추돌방지하기() {
		System.out.println("### 제네시스의 전방추돌방지하기() 실행됨");
	}

	@Override
	public void 차선이탈방지하기() {
		System.out.println("### 제네시스의 차선이탈방지하기() 실행됨");
		
	}

	@Override
	public void 에어백펼치기() {
		System.out.println("### 제네시스의 에어백펼치기() 실행됨");
		
	}

	@Override
	public void 출발하기() {
		System.out.println("### 제네시스의 출발하기() 실행됨");
		
	}

	@Override
	public void 정지하기() {
		System.out.println("### 제네시스의 정지하기() 실행됨");
		
	}

	@Override
	public void 가속하기() {
		System.out.println("### 제네시스의 가속하기() 실행됨");
		
	}

	@Override
	public void 감속하기() {
		System.out.println("### 제네시스의 감속하기() 실행됨");
		
	}

	@Override
	public void 방향전환하기() {
		System.out.println("### 제네시스의 방향전환하기() 실행됨");
		
	}

}
