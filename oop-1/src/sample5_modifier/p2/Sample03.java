package sample5_modifier.p2;

import sample5_modifier.p1.Sample01;

public class Sample03 {
	
	public static void main(String[] args) {
		
		Sample01 sample = new Sample01();
		// System.out.println(sample.a); // 다른 패키지라서 private 접근제한이 적용된 a에 접근할 수 없다.
		// System.out.println(sample.b); // 다른 패키지라서 default 접근제한이 적용된 a에 접근할 수 없다.
		// System.out.println(sample.c); // 다른 패키지라서 protected 접근제한이 적용된 a에 접근할 수 없다.
		System.out.println(sample.d);	// 다른 패키지라서 public 접근제한이 적용된 d만 접근할 수 있다.
	}
	}
