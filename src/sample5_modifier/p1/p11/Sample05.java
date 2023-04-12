package sample5_modifier.p1.p11;

import sample5_modifier.p1.Sample01;
// p1 패키지 안에 p11 패키지가 있어도 다른 패키지로 인식한다.
public class Sample05 {
	
	public static void main(String[] args) {
		Sample01 sample = new Sample01();
		
		// System.out.println(sample.a);	 // private 접근제한이 적용된 a에 접근할 수 없다.
		// System.out.println(sample.b); 	// default 접근제한이 적용된 a에 접근할 수 없다.
		// System.out.println(sample.c); 	// protected 접근제한이 적용된 a에 접근할 수 없다.
		System.out.println(sample.d);		// public 접근제한이 적용된 d만 접근할 수 있다.
	}
}
