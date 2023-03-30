package sample07_interface;

public class 캐스퍼 implements 운전기능명세,안전기능명세 {

	@Override
	public void 에어백펼치기() {
		System.out.println("### Casper의 에어백펼치기() 실행됨");
	}

	@Override
	public void 출발하기() {
		System.out.println("### Casper의 출발하기() 실행됨");
		
	}

	@Override
	public void 정지하기() {
		System.out.println("### Casper의 정지하기() 실행됨");
		
	}

	@Override
	public void 가속하기() {
		System.out.println("### Casper의 가속하기() 실행됨");
		
	}

	@Override
	public void 감속하기() {
		System.out.println("### Casper의 감속하기() 실행됨");
		
	}

	@Override
	public void 방향전환하기() {
		System.out.println("### Casper의 에어백펼치기() 실행됨");
		
	}

	
}
