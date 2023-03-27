package sample02_extends;

public class Car {

	// 자식클래스가 접근 불가
	private int speed;
	private String name; 
	
	public String getName() { // 자식클래스 간접적으로 접근 가능
		return name;
	}
	public void setName(String name) { // 자식클래스 간접적으로 접근 가능
		this.name = name;
	}
	
	public void start() {
		System.out.println("Car객체의 start() 실행됨");
		speed = 10;
		displaySpeed();
	}
	
	public void stop() {
		System.out.println("Car객체의 stop() 실행됨");
		speed = 0;
		displaySpeed();
	}
	
	public void speedUp() {
		System.out.println("Car객체의 speedUp() 실행됨");
		speed += 10;
		if (speed >= 200) { 
			speed = 200;
		}
		displaySpeed();
	}
	
	public void speedDown() {
		System.out.println("Car객체의 speedDown() 실행됨");
		speed -= 10;
		if (speed <= 0) {
			speed = 0;
		}
		displaySpeed();
	}
	
	public void displaySpeed() {
		System.out.println("Car의 현재 속도 -> ["+speed+"km]");
	}
}
