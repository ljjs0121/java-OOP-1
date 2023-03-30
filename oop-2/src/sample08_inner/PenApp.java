package sample08_inner;

public class PenApp {

	public static void main(String[] args) {
		
		/*
		 * 익명 내부 클래스
		 *  - 익명 내부클래스는 이름이 없는 클래스다.
		 * 	- 익명 내부클래스는 부모역할을 하는 부모인터페이스 혹은 부모클래스가 필요하다.
		 *  - 익명 내부클래스는 익명객체를 생성할 때 활용된다.
		 *  - 익명 내부클래스는 클래스의 선언과 객체의 생성이 동시에 이루어진다.
		 *  - 형식 
		 *  	부모 인터페이스(클래스) 정의 
		 *  		public interface Pen {
		 *  			void draw();
		 *  		}
		 *  	익명 내부 클래스 정의
	     *  	Pen yellowPen = new Pen() {
		 *  		public void draw() {
		 *  			System.out.println("노랗게 그리기");
		 *  		}			
		 *  	}
		 *  
		 *  	Pen redPen = new Pen() {
		 *  		public void draw() {
		 *  			System.out.println("빨갛게 그리기");
		 *  		}			
		 *  	}
		 */
		
		// 익명내부클래스로 익명객체 사용하기
		Pen yellowPen = new Pen() {
	   		public void draw() {
	   			System.out.println("노랗게 그리기");
	   		}			
	   	};
	   
	   	// 익명내부클래스로 익명객체 사용하기
	   	Pen redPen = new Pen() {
	   		public void draw() {
	   			System.out.println("빨갛게 그리기");
	   		}			
	   	};
	   	
	   	// 람다식을 이용해서 익명객체 생성하기 (자바 8부터 가능)
	   	Pen bluePen = () -> {
	   		System.out.println("파랗게 그리기");
	   	};
	   	
	   	yellowPen.draw();
	   	redPen.draw();
	   	bluePen.draw();
	}
}
