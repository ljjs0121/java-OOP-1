package sample05_abstract;
// 추상화
public class Customer {

	private String name;
	private String tel;
	
	public Customer(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}
