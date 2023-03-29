package sample05_abstract;

public class KakaoMessageSender extends MessageSender {

	// TODO 는 view 에서 Tasks 에서 내가 작업할 내용을 볼 수 있다.
	public KakaoMessageSender(String id, String password) {
		super(id, password);
	}
	
	@Override // @를 어노테이션이라 부른다.
	public void connect() {
		System.out.println("### Kakaotalk Message Sever 연결...");
		System.out.println("["+getId()+"] ["+getPassword()+"]로 Kakaotalk Message Server와 연결됨");
	}

	@Override
	public void sendMessage(String to, String message) {
		System.out.println("### Kakaotalk 발송");
		System.out.println("수신자["+to+"] ["+message+"]로 Kakaotalk 발송 완료");
	}

}
