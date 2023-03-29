package sample05_abstract;

public abstract class MessageSender {

	private String id;
	private String password;
	
	public MessageSender() {
		
	}
	
	public MessageSender(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public abstract void connect();
	public abstract void sendMessage(String to, String message);
}
