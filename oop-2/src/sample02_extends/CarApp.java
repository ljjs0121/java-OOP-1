package sample02_extends;

public class CarApp {

	public static void main(String[] args) {
		Sonata sonata = new Sonata();
		
		// 은닉화된 필드나 메소드는 상속되지 않기 때문에 Sonata객체를 참조하는 참조변수로 실행할 수 없다. 
		//sonata.speed = 10;
		//sonata.name = "소나타";
		
		// 은닉화되지 않은 필드와 메소드는 자식객체로 상속되기 때문에
		// Car클래스에서 정의한 은닉화되지 않은 필드와 메소드는 전부 Sonata클래스로 상속된다.
		// 따라서, Sonata객체를 참조하는 참조변수 sonata로는 Sonata객체의 공개된 필드와 공개된 메소드를 실행할 수 있고,
		// Sonata객체가 상속받는 Car객체의 공개된 필드와 메소드도 실행할 수 있다.
		sonata.setName("소나타");
		sonata.start();
		sonata.speedUp();
		sonata.speedUp();
		sonata.speedUp();
		sonata.speedUp();
		sonata.speedUp();
		sonata.speedUp();
		sonata.speedDown();
		sonata.speedDown();
		sonata.speedDown();
		sonata.speedDown();
		sonata.stop();
			
	}
}
